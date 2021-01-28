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

	
	
}
