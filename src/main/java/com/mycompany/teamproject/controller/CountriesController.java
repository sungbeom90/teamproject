package com.mycompany.teamproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/countries")
public class CountriesController {
		private static final Logger logger=
				LoggerFactory.getLogger(CountriesController.class);


		// http://.../teamproject/countries 생략됨
		@RequestMapping("/content")
		public String content() {
			logger.info("실행");
			return "countries/content";
		}
		

}
