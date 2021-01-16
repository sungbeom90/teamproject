package com.mycompany.teamproject.controller;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.teamproject.dto.Ch03Dto;
import com.mycompany.teamproject.dto.Ch09User;
import com.mycompany.teamproject.dto.UserDto;

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
		public String sign_up(UserDto user, HttpSession session) {
			logger.info("회원가입 화면 실행");
			String signup = (String)session.getAttribute("signupStatus");
			if(signup != null) {
				logger.info("이메일 : " , user.getUemail());
				logger.info("패스워드 : " , user.getUpassword());
				logger.info("이름 : " , user.getUname());
				logger.info("회원가입 화면 실행");
			}
			return "users/sign_up";
		}
		
		@PostMapping("/sign_up_success")
		public String sign_up_success(UserDto userDto) {
			//문자파트 정보얻기
			String uemail = userDto.getUemail();
			String upassword = userDto.getUpassword();
			String uname = userDto.getUname();
			String usex = userDto.getUsex();
			/*
			 * boolean uagree_e1 = userDto.isUagree_e1(); boolean uagree_e2 =
			 * userDto.isUagree_e2(); boolean uagree_o1 = userDto.isUagree_o1(); boolean
			 * uagree_o2 = userDto.isUagree_o2();
			 */
			logger.info("uemail: "+uemail);
			logger.info("upassword: "+upassword);
			logger.info("uname: "+uname);
			logger.info("usex: "+usex);
			/*
			 * logger.info("uagree_e1: "+uagree_e1); logger.info("uagree_e2: "+uagree_e2);
			 * logger.info("uagree_o1: "+uagree_o1); logger.info("uagree_o2: "+uagree_o2);
			 */
			
			
			/*
			 * //파일파트 정보얻기 MultipartFile uselfy= userDto.getUselfy(); if(!uselfy.isEmpty())
			 * { String originalFileName = uselfy.getOriginalFilename(); String contentType
			 * = uselfy.getContentType(); long size = uselfy.getSize();
			 * logger.info("originalFileName: "+originalFileName);
			 * logger.info("contentType: "+contentType); logger.info("size: "+size);
			 * 
			 * //파일 저장 이름 및 경로 String saveDirPath = "D:/MyWorkspace/uploadfiles/"; String
			 * fileName = new Date().getTime() + "-" + originalFileName; String filePath =
			 * saveDirPath + fileName; File file = new File(filePath); try {
			 * uselfy.transferTo(file); } catch (Exception e) { e.printStackTrace(); } }
			 */
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
