package com.mycompany.teamproject.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.teamproject.dto.UserDto;

@Controller
@RequestMapping("/users")
public class UsersController {
	private static final Logger logger= LoggerFactory.getLogger(UsersController.class);
	
	@Resource
	UsersService usersService;
	
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
			public String sign_up_success(UserDto userDto, HttpSession session) {
				usersService.sign_up_success(userDto);
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
	
	@GetMapping("/photolist")
	public String photoList(Model model) {
		String saveDirPath = "D:/MyWorkspace/uploadfiles/";
		File dir = new File(saveDirPath);
		String[] fileNames = dir.list();
		model.addAttribute("fileNames", fileNames);
		return "users/photolist";	
	}
	
	
	
	

}
