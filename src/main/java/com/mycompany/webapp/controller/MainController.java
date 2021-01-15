package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {
		private static final Logger logger=
				LoggerFactory.getLogger(MainController.class);


		// http://.../teamproject/main 생략됨
		@RequestMapping("/content")
		public String content() {
			logger.info("실행");
			return "main/content";
		}
		

}
