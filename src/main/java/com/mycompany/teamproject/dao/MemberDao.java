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

	public int joininsert(MemberDtoTest mdt) {
		logger.info("회원가입다오");
		int rows = sst.insert("members.joininsert", mdt);
		return rows;
	}
	
	public MemberDtoTest selectByPk(String uemail) {
		logger.info("로그인다오");
		MemberDtoTest member = sst.selectOne("members.selectByPk", uemail);
		return member;
	}

}
