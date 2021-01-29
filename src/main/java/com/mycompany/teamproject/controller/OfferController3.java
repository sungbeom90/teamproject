package com.mycompany.teamproject.controller;

import java.io.File;
import java.util.Date;

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
import com.mycompany.teamproject.dto.MemberDto;
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
			//MemberDto mdto= memberService.getMember(mid);
			//PartnerDto pdto= memberService.getPartner(mdto.getPartner());
		//	offerDto.setPartner_id(pdto.partner_id);
			offerDto.setPartner_id(10);
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
			return "redirect:offer3/courseupload";
		}
		@GetMapping("/courseupload")
		public String courseuploadForm() {
			return "offers/courseupload";
		}
		@PostMapping("/courseupload")
		public String courseupload(CourseDto courseDto) {
			logger.info("실행");
			return "redirect:/main/content";	
		}
		@GetMapping("/courseplus")
		public String courseplus(CourseDto courseDto) {
			logger.info("실행");
			return "offers/course";	
		}
		
		@PostMapping("/offerresult")
		public String offerresult(CourseDto courseDto, HttpSession session) throws Exception {
			logger.info("실행");
			//String mid = (String) session.getAttribute("sessionMid");
		return "redirect:/main/content";
		}
}
