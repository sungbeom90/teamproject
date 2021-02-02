package com.mycompany.teamproject.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.dao.MemberDao;
import com.mycompany.teamproject.dto.MemberDto;

@Service
public class MemberService {
	private static final Logger logger=LoggerFactory.getLogger(MemberService.class);
	
	@Resource
	private MemberDao memberDao;
	
	//pk에 대한 정보 객체
	public MemberDto getMember(int mid) {
		logger.info("mid 객체 받기 확인");
		MemberDto member = memberDao.getMember(mid);
		return member;
	}
	
	//이메일에 대한 pk
	public int loginId(String memail) {
		logger.info("멤버pk 받아오기");
		int mid = memberDao.loginId(memail);
		return mid;
	}
	
	//사진 없는 회원가입
	public int joininsert(MemberDto mdt) {
		logger.info("회원가입 서비스");
		int join = memberDao.joininsert(mdt);
		return join;
	}
	
	
	
	//회원가입시 사진 첨부
	public int imageUpdate(MemberDto mdt) {
		logger.info("회원사진 서비스");
		int join = memberDao.imageUpdate(mdt);
		return join;
	}
	
	// 성공, 이메일, 비번 다를때
	public String login(MemberDto member) {
		logger.info("로그인서비스");
		MemberDto dbmember = memberDao.login(member.getMemail());
		logger.info(member.getMemail());
		logger.info(member.getMpassword());
		if(dbmember == null) {
			return "emptyEmail";
		}else if(dbmember.getMpassword().equals(member.getMpassword())){
			return "loginSuccess";
		}else {
			return "wrongPassword";
		}
		
	}
	
	//이메일 중복확인
	public String emailcheck(MemberDto memail) {
		logger.info("이메일 중복 검사 서비스");
		MemberDto dbemail = memberDao.emailcheck(memail.getMemail());
		logger.info("이메일 : "+ memail.getMemail());
		if(dbemail.getMemail().equals(memail.getMemail())) {
			return "sameEmail";
		}else {
			return "passEmail";
		}
		
		
	}
	
	//회원정보 관리
	public MemberDto loginstatus(String mstatus) {
		logger.info("회원정보 관리 가져오기 서비스");
		MemberDto status = memberDao.loginstatus(mstatus);
		logger.info("회원정보 관리 가져오기 서비스 : " + status.getMemail());
		logger.info("회원정보 관리 가져오기 서비스 : " + status.getMname());
		return status;
	}
	
	//회원정보 수정
	public void statusUpdate(MemberDto status) {
		logger.info("회원정보 수정 서비스");
		memberDao.statusUpdate(status);
		
	}
	
	//회원 탈퇴
	public void memberdelete(int member_id) {
		logger.info("회원 탈퇴 서비스");
		memberDao.memberdelete(member_id);
	}

	public int setMaccountP(MemberDto member) {
		logger.info("계좌입금 플러스 서비스");
		int rows = memberDao.MaccountPupdate(member);
		return rows;
	}
	
	public int setMaccountM(MemberDto member) {
		logger.info("계좌입금 마이너스 서비스");
		int rows = memberDao.MaccountMupdate(member);
		return rows;
	}

	
	
	
	
	


	
	
}
