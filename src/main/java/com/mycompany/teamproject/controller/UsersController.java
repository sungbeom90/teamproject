package com.mycompany.teamproject.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.User;

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
		public String sign_up(User user, HttpSession session) {
			String signup = (String)session.getAttribute("signupStatus");
			if(signup != null) {
				logger.info("이름 : " , user.getUname());
				logger.info("이메일 : " , user.getUid());
				logger.info("패스워드 : " , user.getUpassword());
				logger.info("회원가입 화면 실행");
			}
			return "users/sign_up";
		}
		
		@RequestMapping("/sign_up_success")
		public String sign_up_success() {
			logger.info("회원가입 완료");
			return "redirect:/users/sign_in";
		}
		
		@RequestMapping("/password")
		public String password() {
			logger.info("비밀번호 찾기 화면 실행");
			return "users/password";
		}
		
		@RequestMapping("/password_re")
		public String password_re() {
			logger.info("비밀번호 재설정 완료");
			return "users/password_re";
		}
		
		@PostMapping("/login")
		public String login(String uid, String upassword, HttpSession session) {
			if(uid.equals("admin@naver.com") && upassword.equals("12345")) {
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
