package com.mycompany.teamproject.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.MemberDtoTest;
import com.mycompany.teamproject.service.MemberService;

@Controller
@RequestMapping("/memberstest")
public class MemberControllerTest {
	private static final Logger logger= LoggerFactory.getLogger(MemberControllerTest.class);
	
	@Resource
	private MemberService memberservice;
	
			@RequestMapping("/content")		
			public String content() {
				logger.info("실행");
				return "memberstest/content";
			}
			
			@GetMapping("/login")
			public String loginForm() {
				logger.info("로그인 화면 실행");
				return "memberstest/login";
			}
			
			@PostMapping("/login")
			public String login() {
				logger.info("로그인 성공");
				return "redirect:/main/content";
			}
			
			@GetMapping("/join")
			public String joinForm() {
				logger.info("회원가입 화면 실행");
				return "memberstest/join";
			}
			
			@PostMapping("/join")
			public String join(MemberDtoTest mdt) {
				logger.info("회원가입 완료");
				
				memberservice.joininsert(mdt);
				
				
				return "redirect:/main/content";
			}
		
			
			
			
			@GetMapping("/logout")
			public String logout(HttpSession session) {
				session.invalidate();
				return "redirect:/main/content";
			}
	
	
	
	

}
