package com.mycompany.teamproject.controller;

import java.io.File;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.teamproject.dto.UserDto;

@Controller
@RequestMapping("/users")
public class UsersController {
	private static final Logger logger= LoggerFactory.getLogger(UsersController.class);
	
	
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
			@PostMapping("/sign_up_success")
			public String sign_up_success(UserDto userDto) {
					//문자파트 정보얻기
					String uemail = userDto.getUemail();
					String upassword = userDto.getUpassword();
					String uname = userDto.getUname();
					String usex = userDto.getUsex();
					String uagree_e1 = userDto.getUagree_e1();
					String uagree_e2 = userDto.getUagree_e2();
					String uagree_o1 = userDto.getUagree_o1();
					String uagree_o2 = userDto.getUagree_o2();
					
					
					logger.info("uemail: "+uemail);
					logger.info("upassword: "+upassword);
					logger.info("uname: "+uname);
					logger.info("usex: "+usex);
					logger.info("uagree_o2: "+uagree_e1);
					logger.info("uagree_o2: "+uagree_e2);
					logger.info("uagree_o2: "+uagree_o1);
					logger.info("uagree_o2: "+uagree_o2);		
					
					//파일파트 정보얻기
					MultipartFile uphoto= userDto.getUphoto();
					if(!uphoto.isEmpty()) {
						String originalFileName = uphoto.getOriginalFilename();
						String contentType = uphoto.getContentType();
						long size = uphoto.getSize();
						logger.info("originalFileName: "+originalFileName);
						logger.info("contentType: "+contentType);
						logger.info("size: "+size);
						
						//파일 저장 이름 및 경로
						String saveDirPath = "D:/MyWorkspace/uploadfiles/";
						String fileName = new Date().getTime() + "-" + originalFileName;
						String filePath = saveDirPath + fileName;
						File file = new File(filePath);
						try {
							uphoto.transferTo(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				
				
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
			public String login(String uemail, String upassword, HttpSession session) {
				if(uemail.equals("admin@naver.com") && upassword.equals("12345")) {
				session.setAttribute("loginStatus",uemail);
				}
				return "redirect:/main/content";
			}
			@GetMapping("/logout")
			public String logout(HttpSession session) {
				session.invalidate();
				return "redirect:/main/content";
			}
	
	
	
	

}
