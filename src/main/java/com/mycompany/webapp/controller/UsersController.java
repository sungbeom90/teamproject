package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {
		private static final Logger logger=
				LoggerFactory.getLogger(UsersController.class);


		// http://.../teamproject/users 생략됨
		@RequestMapping("/content")
		public String content() {
			logger.info("실행");
			return "users/content";
		}
		
		@RequestMapping("/sign_in")
		public String sign_in() {
			logger.info("실행");
			return "users/content";
		}
		@RequestMapping("/sign_up")
		public String sign_up() {
			logger.info("실행");
			return "users/content";
		}
		
		@RequestMapping("/password")
		public String password() {
			logger.info("실행");
			return "users/content";
		}
		

}
