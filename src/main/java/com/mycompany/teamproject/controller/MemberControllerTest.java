package com.mycompany.teamproject.controller;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
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
	private static final Logger logger = LoggerFactory.getLogger(MemberControllerTest.class);

	@Resource
	private MemberService memberService;

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

	// 응답처리 마저 해주기
	@PostMapping("/login")
	public void login(MemberDtoTest member, HttpSession session, HttpServletResponse response) throws Exception {
		logger.info("로그인 실행");
		// 리턴 값 받아와서 객체에 저장
		int memberId = memberService.loginId(member.getMemail());
		session.setAttribute("sessionMid", memberId);
		String login = memberService.login(member);
		if (login.equals("loginSuccess")) {
			logger.info("로그인 성공");
			session.setAttribute("loginStatus", member.getMemail());
		}
		logger.info(""+memberId);

		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();

		JSONObject root = new JSONObject();
		root.put("login", login);
		String json = root.toString();
		pw.println(json);

		pw.flush();
		pw.close();

	}
	

	@GetMapping("/join")
	public String joinForm() {
		logger.info("회원가입 화면 실행");
		return "memberstest/join";
	}
	

	@GetMapping("/emailcheck")
	public void emailcheck(MemberDtoTest memail, HttpServletResponse response) throws Exception {
		logger.info("이멜 확인 겟");
		String ckemail = memberService.emailselect(memail);
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		
		JSONObject email = new JSONObject();
		email.put("email", ckemail);
		String cemail = email.toString();
		pw.println(cemail);
		
		pw.flush();
		pw.close();
		
		
	}
	
	
	

	// not null처리 다시 하기
	@PostMapping("/join")
	public String join(MemberDtoTest mdt) {
		logger.info("회원가입 완료");
		
		memberService.joininsert(mdt);

		return "redirect:/main/content";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		logger.info("로그아웃");
		session.invalidate();
		return "redirect:/main/content";
	}

}
