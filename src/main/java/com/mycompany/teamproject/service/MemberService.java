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
	
	public void joininsert(MemberDtoTest mdt) {
		logger.info("회원가입디토");
		memberDao.joininsert(mdt);
	}
	
	public MemberDtoTest login(MemberDtoTest member) {
		logger.info("로그인디토");
		MemberDtoTest dbmember = memberDao.selectByPk(member.getMemail());
		return dbmember;
	}

	
	
}
