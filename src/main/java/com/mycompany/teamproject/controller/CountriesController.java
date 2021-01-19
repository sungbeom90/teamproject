package com.mycompany.teamproject.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.CountryDto;

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
		
		
		
		@GetMapping("/usa")
		public String usa(HttpSession session){
			logger.info("usa 실행");
			CountryDto usadto = new CountryDto();
			usadto.setImgHead("/resources/img/usa_head.jpg");
			usadto.setImgCity1("/resources/img/newyork_head.jpg");
			usadto.setImgCity2("/resources/img/hawaii_head.jpg");
			usadto.setNameCity1("뉴 욕");
			usadto.setNameCity2("하 와 이");
			usadto.setNameCountry("미 국");
			usadto.setRootCity1("/cities/newyork");
			usadto.setRootCity2("/cities/hawaii");
			
			session.setAttribute("country", usadto);
			
			return "countries/country"; 
		}
		
		@GetMapping("/japan")
		public String japan(HttpSession session){
			logger.info("japan 실행");
			CountryDto usadto = new CountryDto();
			usadto.setImgHead("/resources/img/japan_head.jpg");
			usadto.setImgCity1("/resources/img/okinawa_head.jpg");
			usadto.setImgCity2("/resources/img/fukuoka_head.jpg");
			usadto.setNameCity1("오 키 나 와");
			usadto.setNameCity2("후 쿠 오 카");
			usadto.setNameCountry("일 본");
			usadto.setRootCity1("/cities/okinawa");
			usadto.setRootCity2("/cities/fukuoka");
			
			session.setAttribute("country", usadto);
			
			return "countries/country"; 
		}
		
		@GetMapping("/spain")
		public String spain(HttpSession session){
			logger.info("spain 실행");
			CountryDto usadto = new CountryDto();
			usadto.setImgHead("/resources/img/spain_head.jpg");
			usadto.setImgCity1("/resources/img/barcelona_head.jpg");
			usadto.setImgCity2("/resources/img/seville_head.jpg");
			usadto.setNameCity1("바 르 셀 로 나");
			usadto.setNameCity2("세 비 야");
			usadto.setNameCountry("스 페 인");
			usadto.setRootCity1("/cities/barcelona");
			usadto.setRootCity2("/cities/seville");
			
			session.setAttribute("country", usadto);
			
			return "countries/country"; 
		}
		
		@GetMapping("/korea")
		public String korea(HttpSession session){
			logger.info("korea 실행");
			CountryDto usadto = new CountryDto();
			usadto.setImgHead("/resources/img/korea_head.jpg");
			usadto.setImgCity1("/resources/img/busan_head.jpg");
			usadto.setImgCity2("/resources/img/sokcho_head.jpg");
			usadto.setNameCity1("부 산");
			usadto.setNameCity2("속 초");
			usadto.setNameCountry("한 국");
			usadto.setRootCity1("/cities/busan");
			usadto.setRootCity2("/cities/sokcho");
			
			session.setAttribute("country", usadto);
			
			return "countries/country"; 
		}
	
		
		

}
