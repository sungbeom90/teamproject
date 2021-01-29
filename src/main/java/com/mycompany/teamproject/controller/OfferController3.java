package com.mycompany.teamproject.controller;

import java.io.File;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.teamproject.dto.CourseDto;
import com.mycompany.teamproject.dto.ImageDto;
import com.mycompany.teamproject.dto.MemberDtoTest;
import com.mycompany.teamproject.dto.OfferDto;
import com.mycompany.teamproject.dto.PartnerDto;
import com.mycompany.teamproject.service.MemberService;
import com.mycompany.teamproject.service.OfferService;
import com.mycompany.teamproject.service.PartnerService;

@Controller
@RequestMapping("/offer3")
public class OfferController3 {
		private static final Logger logger=
				LoggerFactory.getLogger(OfferController3.class);
		
		@Resource
		OfferService offerService;
		
		@Resource
		MemberService memberService;
		
		@Resource
		PartnerService partnerService;


		// http://.../teamproject/register 생략됨
		@RequestMapping("/content")
		public String content() {
			logger.info("실행");
			return "offer3/content";
		}
		@GetMapping("/offerupload")
		public String offerUploadForm() {
			return "offers/offerupload";
		}
		@Transactional
		@PostMapping("/offerupload")
		public String offerUpload(OfferDto offerDto, HttpSession session) throws Exception {
			logger.info("실행");
			int mid = (int) session.getAttribute("sessionMid");
			PartnerDto pdto= partnerService.getPartner(mid);
			offerDto.setPartner_id(pdto.getPartner_id());
			offerService.textRegister(offerDto);
			
			MultipartFile[] mfArray = offerDto.getOfferImage();
			ImageDto imageDto = new ImageDto();
			for (MultipartFile mf : mfArray) {
				logger.info("파일전송 for문실행");
				if(!mf.isEmpty()) {
					imageDto.setOffer_id(offerDto.getOffer_id());
					String oName = mf.getOriginalFilename();
					imageDto.setIimageoname(oName);
					imageDto.setIimagetype(mf.getContentType());
					File saveFile = new File("D:/MyWorkspace/teamfiles/offers/"+ offerDto.getOtitle()+"/"+oName); 
					mf.transferTo(saveFile);
					logger.info(""+imageDto.getOffer_id());
					offerService.ImageRegister(imageDto);
					}
			}			
			session.setAttribute("sessionOffer",offerDto);
			return "redirect:courseupload";
		}
		@GetMapping("/courseupload")
		public String courseuploadForm() {
			return "offers/courseupload";
		}
		@PostMapping("/courseupload")
		public String courseupload(CourseDto courseDto, HttpSession session) throws Exception {
			logger.info("실행");
			int[] course_no_array = courseDto.getCourse_no_array();
			String[] cplace_array = courseDto.getCplace_array();
			String[] cdetail_array = courseDto.getCdetail_array();
			String[] ctime_array = courseDto.getCtime_array();
			MultipartFile[] cimage_array = courseDto.getCimage_array();
			OfferDto offerDto=(OfferDto) session.getAttribute("sessionOffer");
			
			
			courseDto.setOffer_id(offerDto.getOffer_id());
			for(int i=0; i<course_no_array.length; i++) {
				courseDto.setCourse_no(course_no_array[i]);
				courseDto.setCplace(cplace_array[i]);
				courseDto.setCdetail(cdetail_array[i]);
				courseDto.setCtime(ctime_array[i]);
				
				/* if(!cimage_array[i].isEmpty()) { */
					String oName = cimage_array[i].getOriginalFilename();
					courseDto.setCimageoname(oName);
					courseDto.setCimagetype(cimage_array[i].getContentType());
					File saveFile = new File("D:/MyWorkspace/teamfiles/offers/"+ offerDto.getOtitle()+"/courses/"+oName); 
					cimage_array[i].transferTo(saveFile);
					logger.info(""+courseDto.getOffer_id());
					offerService.CourseRegister(courseDto);
					/* } */
			}
			session.removeAttribute("sessionOid");
			session.removeAttribute("sessionNo");
			return "redirect:/main/content";	
		}
		@GetMapping("/courseplus")
		public String courseplus(HttpSession session) {
			logger.info("실행");
			if(session.getAttribute("sessionNo")==null) {
				logger.info("no null 실행");
				int number=0;
				session.setAttribute("sessionNo", number);
			} else if(session.getAttribute("sessionNo")!=null) {
				logger.info("no not null 실행");
				int number=(int) session.getAttribute("sessionNo");
				number++;
				session.setAttribute("sessionNo", number);
			}
			return "offers/course";	
		}		
		@PostMapping("/offerresult")
		public String offerresult(CourseDto courseDto, HttpSession session) throws Exception {
			logger.info("실행");
			//String mid = (String) session.getAttribute("sessionMid");
		return "redirect:/main/content";
		}
}
