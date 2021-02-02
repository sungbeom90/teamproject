package com.mycompany.teamproject.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.teamproject.dto.AgreeDto;
import com.mycompany.teamproject.dto.MemberDto;
import com.mycompany.teamproject.dto.PartnerDto;
import com.mycompany.teamproject.service.AgreeService;
import com.mycompany.teamproject.service.MemberService;
import com.mycompany.teamproject.service.PartnerService;

@Controller
@RequestMapping("/members")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Resource
	private MemberService memberService;

	@RequestMapping("/content")
	public String content() {
		logger.info("실행");
		return "members/content";
	}

	@GetMapping("/login")
	public String loginForm() {
		logger.info("로그인 화면 실행");
		return "members/login";
	}

	@Resource
	PartnerService partnerService;
	
	//로그인 하기
	@PostMapping("/login")
	public void login(MemberDto member,PartnerDto partner, HttpSession session, HttpServletResponse response) throws Exception {
		logger.info("로그인 실행");
		// email에 대한 pk값 저장
		int memberId = memberService.loginId(member.getMemail());
		session.setAttribute("sessionMid", memberId);
		
		//로그인 실행
		String login = memberService.login(member);
		if(login.equals("loginSuccess")) {
			logger.info("로그인 성공");
			session.setAttribute("loginStatus", member.getMemail());
			/*
			//파트너  id 유무로 등록/정보 나누기
			partner.setMember_id(memberId);
			PartnerDto partnerId = partnerService.partnerEmail(partner);
			if(partnerId.getPartner_id() != 0) {
				logger.info("파트너 id : "+partnerId.getPartner_id());
				session.setAttribute("partnerId", partnerId);
			}
			*/
		}
		
		//json으로 설정
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();

		JSONObject root = new JSONObject();
		root.put("login", login);
		String json = root.toString();
		pw.println(json);

		pw.flush();
		pw.close();

	}
	
	//로그인시 프로필사진
	@GetMapping("/mimage")
	public void mimage(String memail, HttpSession session, HttpServletResponse response) throws Exception{
		logger.info("사진 가져오기 컨트롤러");
		memail = (String) session.getAttribute("loginStatus");
		MemberDto mimage = memberService.loginstatus(memail);
		
		String filePath = null;
		//사진 정보의 유무
		if(mimage.getMimageoname() != null) { 
			logger.info("사진정보 확인용 : " + mimage.getMimageoname() + mimage.getMimagetype());
			//가져올 경로 설정
			String imageName = mimage.getMimageoname();
			filePath = "D:/MyWorkspace/teamfiles/members/" 
								+ mimage.getMember_id() + "/" + imageName;
			//응답 본문 내용의 데이터 종류를 응답 헤더에 추가
			response.setContentType(mimage.getMimagetype());
			
					
		}else {
			logger.info("사진 없을때");
			//기본사진
			filePath = "D:/MyWorkspace/teamfiles/myphoto.png";
			response.setContentType("image/png");
		}
		
		//사진 응답으로 보여주기
		OutputStream os = response.getOutputStream();
		InputStream is = new FileInputStream(filePath);
		
		FileCopyUtils.copy(is, os);
		
		os.flush();
		os.close();
		is.close();
		
		
	}
	

	@GetMapping("/join")
	public String joinForm() {
		logger.info("회원가입 화면 실행");
		return "members/join";
	}
	
	@Resource
	AgreeService agreeService;
	
	//회원가입
	@PostMapping("/join")
	public String join(MemberDto mdt, Model model) throws Exception{
		logger.info("회원가입 완료");
		memberService.joininsert(mdt);
		logger.info("맴버id : "+mdt.getMember_id());
		logger.info("체크박스 : "+mdt.getAessence_1());
		
		//체크박스 처리하기
		AgreeDto agree = new AgreeDto();
		
		agree.setMember_id(mdt.getMember_id());
		agree.setAessence_1(mdt.getAessence_1());
		agree.setAessence_2(mdt.getAessence_2());
		agree.setAoption_1(mdt.getAoption_1());
		agree.setAoption_2(mdt.getAoption_2());
		agree.setApartner(mdt.getApartner());
		
		logger.info("어그리 : "+agree.getAessence_2());
		agreeService.agreeInsert(agree);
		
		//사진 첨부
		MultipartFile jphoto = mdt.getMimage();
		if(!jphoto.isEmpty()) {
			logger.info("사진 넣기");
			String photo = jphoto.getOriginalFilename();
			mdt.setMimageoname(photo);
			mdt.setMimagetype(jphoto.getContentType());
			
			//파일 저장
			File save = new File("D:/MyWorkspace/teamfiles/members/"
			+ mdt.getMember_id() + "/" + photo);
			
			jphoto.transferTo(save);
			memberService.imageUpdate(mdt);
		}
		
		return "redirect:/main/content";
	}
	
	//회원정보 관리(수정, 탈퇴)
	@GetMapping("/memberstatus")
	public String memberstatus(String mstatus, HttpSession session) {
		logger.info("회원정보 관리");
		mstatus = (String) session.getAttribute("loginStatus");
		MemberDto status = memberService.loginstatus(mstatus);
		logger.info("회원 이름 : "+status.getMember_id());
		session.setAttribute("mstatus", status);
		return "members/memberstatus";
	}
	
	//회원정보 수정
	@GetMapping("/memberupdate")
	public String statusUpdate(String status, HttpSession session) {
		logger.info("회원정보 수정 요청");
		status = (String) session.getAttribute("loginStatus");
		MemberDto update = memberService.loginstatus(status);
		logger.info("회원정보 수정 요청 : "+update.getMname()+" / "+update.getMember_id());
		session.setAttribute("update", update);
		return "members/memberupdate";
	}
	
	@PostMapping("/memberupdate")
	public String statusUpdate(MemberDto status){
		logger.info("회원정보 수정 보내기");
		/*
		MultipartFile mphoto = status.getMimage();
			if(mphoto.isEmpty()) {
			logger.info("사진 넣기");
			String photo = mphoto.getOriginalFilename();
			status.setMimageoname(photo);
			status.setMimagetype(mphoto.getContentType());
			
			//파일 저장
			File save = new File("D:/MyWorkspace/teamfiles/members/"
			+ status.getMember_id() + "/" + photo);
			
			mphoto.transferTo(save);
		}
		*/
		memberService.statusUpdate(status);
		return "redirect:/members/memberstatus";
	}
	//회원탈퇴, 파트너 등록 했을때 처리하기 - 파트너pk값을 불어와서 먼저 삭제 후 적용하면 될듯?
	@GetMapping("/memberdelete")
	public String memberdelete(int member_id, HttpSession session) {
		logger.info("회원 탈퇴");
		memberService.memberdelete(member_id);
		session.invalidate();
		return "redirect:/main/content";
	}
	
	
	
	
	//이메일 중복체크 진행중, 입력값 다시 생각해보기
	@PostMapping("/emailcheck")
	public void emailcheck(MemberDto memail, Model model, HttpServletResponse response) throws Exception {
		logger.info("이멜 확인 겟");
		/*
		MemberDtoTest loginemail = memberService. loginemail(memail.getMemail());
		logger.info("이멜 정보 : "+memail.getMemail());
		model.addAttribute("loginemail", loginemail);
		logger.info("이멜 정보 : "+memail.getMemail());
		*/
		String ckemail = memberService.emailcheck(memail);
		logger.info("이멜 확인 겟 : "+ckemail);
		
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		
		JSONObject email = new JSONObject();
		email.put("memail", ckemail);
		String cemail = email.toString();
		pw.println(cemail);
		
		pw.flush();
		pw.close();
	}
	
	
	
	
	


	@GetMapping("/logout")
	public String logout(HttpSession session) {
		logger.info("로그아웃");
		session.invalidate();
		return "redirect:/main/content";
	}

}
