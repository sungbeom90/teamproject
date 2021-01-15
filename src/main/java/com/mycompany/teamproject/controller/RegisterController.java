package com.mycompany.teamproject.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		
		

}
