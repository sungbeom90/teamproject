package com.mycompany.teamproject.controller;

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
		
		
		@RequestMapping("/newyork")
		public String newyork() {
			logger.info("뉴욕 상품");
			return "cities/newyork";
		}
		
		@RequestMapping("/hawaii")
		public String hawaii() {
			logger.info("하와이 상품");
			return "cities/hawaii";
		}
		
		@RequestMapping("/barcelona")
		public String barcelona() {
			logger.info("바르셀로나 상품");
			return "cities/barcelona";
		}
		
		@RequestMapping("/seville")
		public String seville() {
			logger.info("세비야 상품");
			return "cities/seville";
		}
		
		@RequestMapping("/okinawa")
		public String okinawa() {
			logger.info("오키나와 상품");
			return "cities/okinawa";
		}
		
		@RequestMapping("/fukuoka")
		public String fukuoka() {
			logger.info("후쿠오카 상품");
			return "cities/fukuoka";
		}
	
		@RequestMapping("/busan")
		public String busan() {
			logger.info("부산 상품");
			return "cities/busan";
		}
		
		@RequestMapping("/sokcho")
		public String sokcho() {
			logger.info("속초 상품");
			return "cities/sokcho";
		}
		
		
		

}
