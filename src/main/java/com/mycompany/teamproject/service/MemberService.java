package com.mycompany.teamproject.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.dao.MemberDao;
import com.mycompany.teamproject.dto.MemberDtoTest;

@Service
public class MemberService {
	private static final Logger logger=LoggerFactory.getLogger(MemberService.class);
	
	@Resource
	private MemberDao memberDao;
	
	
	public MemberDtoTest getMember(int mid) {
		logger.info("mid 객체 받기 서비스");
		MemberDtoTest member = memberDao.getMember(mid);
		return member;
	}

	
	
	
	public int joininsert(MemberDtoTest mdt) {
		logger.info("회원가입서비스");
		int join = memberDao.joininsert(mdt);
		return join;
	}
	
	// 성공, 이메일, 비번 다를때
	public String login(MemberDtoTest member) {
		logger.info("로그인서비스");
		MemberDtoTest dbmember = memberDao.login(member.getMemail());
		if(dbmember == null) {
			return "failEmail";
		}else if(dbmember.getMpassword().equals(member.getMpassword())){
			return "loginSuccess";
		}else {
			return "wrongPassword";
		}
	}
	
	public int loginId(String memail) {
		logger.info("멤버pk 받아오기");
		int mid = memberDao.loginId(memail);
		return mid;
	}
	


	public String emailselect(MemberDtoTest email) {
		logger.info("이메일 중복 검사");
		MemberDtoTest dbemail = memberDao.emailselect(email);
		if(dbemail.getMemail().equals(email.getMemail())) {
			return "sameEmail";
		}else {
			return "passEmail";
		}
		
		
	}

	
	
}
