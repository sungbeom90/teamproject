package com.mycompany.teamproject.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.teamproject.dto.OfferBoard;
import com.mycompany.teamproject.dto.UserDto;

@Controller
@RequestMapping("/register")
public class RegisterController {
		private static final Logger logger=
				LoggerFactory.getLogger(RegisterController.class);


		// http://.../teamproject/register 생략됨
		@RequestMapping("/content")
		public String content() {
			logger.info("실행");
			return "register/content";
		}
		
		@PostMapping("/offerupload")
		public String offerUpload(OfferBoard offerBoard,HttpSession session) {
			UserDto userDto= (UserDto) session.getAttribute("userDto");
			String title = offerBoard.getTitle();
			String subtitle = offerBoard.getSubtitle();
			String subcontents = offerBoard.getSubcontent();
			String include = offerBoard.getInclude();
			String uninclude = offerBoard.getUninclude();
			String price = offerBoard.getPrice();
			String course = offerBoard.getCourse();
			String addinfo = offerBoard.getAddinfo();
			String contacttime = offerBoard.getContacttime();
			String contactplace = offerBoard.getContactplace();
			
			logger.info("writer: "+userDto.getUname());
			logger.info("title: "+title);
			logger.info("subtitle: "+subtitle);
			logger.info("subcontents: "+subcontents);
			logger.info("include: "+include);
			logger.info("uninclude: "+uninclude);
			logger.info("price: "+price);
			logger.info("course: "+course);
			logger.info("addinfo: "+addinfo);
			logger.info("contacttime: "+contacttime);
			logger.info("contactplace: "+contactplace);
			
			MultipartFile offerPhoto= offerBoard.getOfferPhoto();
			if(!offerPhoto.isEmpty()) {
				String originalFileName = offerPhoto.getOriginalFilename();
				String contentType = offerPhoto.getContentType();
				long size = offerPhoto.getSize();
				logger.info("originalFileName: "+originalFileName);
				logger.info("contentType: "+contentType);
				logger.info("size: "+size);
			}
		
		return "redirect:/main/content";
		}
}
