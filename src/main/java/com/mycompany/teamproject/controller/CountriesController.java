package com.mycompany.teamproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		@RequestMapping("/usa")
		public String usa() {
			logger.info("미국");
			return "countries/usa";
		}
		
		@RequestMapping("/spain")
		public String spain() {
			logger.info("스페인");
			return "countries/spain";
		}
		
		@RequestMapping("/japan")
		public String japan() {
			logger.info("일본");
			return "countries/japan";
		}
		
		@RequestMapping("/korea")
		public String korea() {
			logger.info("한국");
			return "countries/korea";
		}
		
		
	
		
		

}
