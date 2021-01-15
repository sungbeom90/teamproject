package com.mycompany.teamproject.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
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
	
	@GetMapping("/method3")
	public String method3(HttpServletRequest request, HttpServletResponse response) {
		logger.info("실행");
		
		//쿠키 생성
		Cookie cookie1=new Cookie("memberId", "white");
		Cookie cookie2=new Cookie("logindStatus", "ok");
		//쿠키를 응답에 추가해서 클라이언트로 보내기
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		//응답 본문을 생성하는 뷰 리턴
		return "ch05/content";
	}
	
	@GetMapping("/method4")
	public String method4(HttpServletRequest request, HttpServletResponse response) {
		logger.info("실행");
		//브라우저가 요청 헤더에 보낸 쿠키 값을 읽기
		Cookie[] cookieArr = request.getCookies();
		
		for(Cookie cookie : cookieArr) {
			String name = cookie.getName();
			String value = cookie.getValue();
			logger.info(name+": "+value);			
		}		
		//응답 본문을 생성하는 뷰 리턴
		return "ch05/content";	
	}

	@GetMapping("/method5")
	public String method5(@CookieValue String memberId, @CookieValue String logindStatus) {
		logger.info("실행"); 
		//브라우저가 요청 헤더에 보낸 쿠키 값을 읽기 
		logger.info("memberId: "+memberId);
		logger.info("logindStatus: "+logindStatus);
		 
		// 응답 본문을 생성하는 뷰 리턴
		return "ch05/content";
	}
	
}
