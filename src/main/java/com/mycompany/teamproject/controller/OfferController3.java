package com.mycompany.teamproject.controller;

import java.io.File;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.teamproject.dto.CourseDto;
import com.mycompany.teamproject.dto.ImageDto;
import com.mycompany.teamproject.dto.OfferDto;
import com.mycompany.teamproject.service.MemberService;
import com.mycompany.teamproject.service.OfferService;

@Controller
@RequestMapping("/offer3")
public class OfferController3 {
		private static final Logger logger=
				LoggerFactory.getLogger(OfferController3.class);
		
		@Resource
		OfferService offerService;
		
		@Resource
		MemberService memberService;


		// http://.../teamproject/register 생략됨
		@RequestMapping("/content")
		public String content() {
			logger.info("실행");
			return "offer3/content";
		}
		@GetMapping("/offerupload")
		public String offerUploadForm() {
			return "offers/offerUpload";
		}
		
		@PostMapping("/offerupload")
		public String offerUpload(OfferDto offerDto,HttpSession session) throws Exception {
			logger.info("실행");
			/*String mid = (String) session.getAttribute("sessionMid");
			//MemberDto mdto= memberService.getMember(mid);
			//PartnerDto pdto= memberService.getPartner(mdto.getPartner());
			//offerDto.setPartner_id(pdto.partner_id);
			offerDto.setPartner_id(1);
			offerService.saveRegister(offerDto);
			
			MultipartFile[] mfArray = offerDto.getOfferImage();
			ImageDto iDto = new ImageDto();
			for (MultipartFile mf : mfArray) {
				if(!mf.isEmpty()) {
					iDto.setOattachoname(mf.getOriginalFilename());
					String saveName = new Date().getTime() + "-" + mf.getOriginalFilename();
					iDto.setOattachsname(saveName);
					iDto.setOattachtype(mf.getContentType());
					File saveFile = new File("D:/MyWorkspace/teamfiles/offers/"+ offerDto.getOtitle()+"/"+saveName); 
					mf.transferTo(saveFile);
					offerService.saveImageRegister(iDto);
				}
			}*/
			return "main/content";
			
		}
		@PostMapping("/courseupload")
		public String courseupload(CourseDto courseDto, HttpSession session) throws Exception {
			logger.info("실행");
			//String mid = (String) session.getAttribute("sessionMid");
			return "main/content";
			
		}
		@PostMapping("/offerresult")
		public String offerresult(CourseDto courseDto, HttpSession session) throws Exception {
			logger.info("실행");
			//String mid = (String) session.getAttribute("sessionMid");
		return "redirect:/main/content";
		}
}
