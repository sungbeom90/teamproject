package com.mycompany.teamproject.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.MemberDtoTest;

@Repository
public class MemberDao {
	private static final Logger logger=LoggerFactory.getLogger(MemberDao.class);
	
	@Resource
	private SqlSessionTemplate sst;
	
	//mid 객체
	public MemberDtoTest getMember(int mid) {
		logger.info("mid 객체 다오");
		MemberDtoTest member = sst.selectOne("members.getMember", mid);
		return member;
	}
	
	
	//인설트로 행을 추가하여 리턴
	public int joininsert(MemberDtoTest mdt) {
		logger.info("회원가입다오");
		int rows = sst.insert("members.joininsert", mdt);
		return rows;
	}
	
	//맴버_아이디 받아와서 리턴
	public MemberDtoTest login(String memail) {
		logger.info("로그인다오");
		MemberDtoTest member = sst.selectOne("members.login", memail);
		return member;
	}

	public int loginId(String memail) {
		logger.info("멤버 아이디 다오");
		int mid = sst.selectOne("members.memberId", memail);
		return mid;
	}

	public MemberDtoTest emailselect(MemberDtoTest memail) {
		logger.info("이메일 확인 다오");
		MemberDtoTest email = sst.selectOne("members.login", memail);
		return email;
	}





}
