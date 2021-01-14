package com.mycompany.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch05")
public class Ch05Controller {
	private static final Logger logger=
			LoggerFactory.getLogger(Ch05Controller.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch05/content";
	}
	
	/* 스프링을 이용, 브라우저 정보 가져오기 */
	@GetMapping("/method1")
	public String method1(@RequestHeader("User-Agent") String userAgent) {
		logger.info("실행");
		logger.info(userAgent);
		if(userAgent.contains("Edg")) {
			logger.info("브라우저 종류: 엣지");
		} else if(userAgent.contains("Chrome")) {
			logger.info("브라우저 종류: 크롬");
		} else if(userAgent.contains("Trident/7.0")) {
			logger.info("브라우저 종류: IE11");
		} else if(userAgent.contains("MSIE")) {
			logger.info("브라우저 종류: IE10 이하");
		}
		return "ch05/content";
	}
	
	/* 직접 HttpServletRequest 객체 가져와서 브라우저 정보 가져오기 */
	@GetMapping("/method2")
	public String method2(HttpServletRequest request) {
		logger.info("실행");
		
		String userAgent = request.getHeader("User-Agent");
		
		//logger.info(userAgent);
		if(userAgent.contains("Edg")) {
			logger.info("브라우저 종류: 엣지");
		} else if(userAgent.contains("Chrome")) {
			logger.info("브라우저 종류: 크롬");
		} else if(userAgent.contains("Trident/7.0")) {
			logger.info("브라우저 종류: IE11");
		} else if(userAgent.contains("MSIE")) {
			logger.info("브라우저 종류: IE10 이하");
		}
		return "ch05/content";
	}
}
