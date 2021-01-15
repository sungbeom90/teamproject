package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cities")
public class CitiesController {
		private static final Logger logger=
				LoggerFactory.getLogger(CitiesController.class);


		// http://.../teamproject/cities 생략됨
		@RequestMapping("/content")
		public String content() {
			logger.info("실행");
			return "cities/content";
		}
		

}