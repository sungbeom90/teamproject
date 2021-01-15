package com.mycompany.teamproject.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
			logger.info("로그인 화면 실행");
			return "users/sign_in";
		}
		
		@RequestMapping("/sign_up")
		public String sign_up() {
			logger.info("회원가입 화면 실행");
			return "users/sign_up";
		}
		
		@RequestMapping("/password")
		public String password() {
			logger.info("비밀번호 찾기 화면 실행");
			return "users/content";
		}
		
		@PostMapping("/login")
		public String login(String uid, String upassword, HttpSession session) {
			if(uid.equals("admin") && upassword.equals("12345")) {
			session.setAttribute("loginStatus",uid);
			}
			return "redirect:/main/content";
		}
		@GetMapping("/logout")
		public String logout(HttpSession session) {
			session.invalidate();
			return "redirect:/main/content";
		}
		

}
