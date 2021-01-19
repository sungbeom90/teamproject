package com.mycompany.teamproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.Offer;

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
		public String offerUpload(Offer offer) {
			String utitle = offer.getUtitle();
			String usubtitle = offer.getUsubtitle();
			String usubcontents = offer.getUsubcontents();
			String uinclude = offer.getUinclude();
			String uuninclude = offer.getUuninclude();
			String ucourse = offer.getUcourse();
			String uaddinfo = offer.getUaddinfo();
			
			logger.info("utitle: "+utitle);
			logger.info("usubtitle: "+usubtitle);
			logger.info("usubcontents: "+usubcontents);
			logger.info("uinclude: "+uinclude);
			logger.info("uuninclude: "+uuninclude);
			logger.info("ucourse: "+ucourse);
			logger.info("uaddinfo: "+uaddinfo);
		
		
		return "redirect:/main/content";
		}
}
