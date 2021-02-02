package com.mycompany.teamproject.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.MemberDto;

@Repository
public class MemberDao {
	private static final Logger logger=LoggerFactory.getLogger(MemberDao.class);
	
	@Resource
	private SqlSessionTemplate sst;
	
	//mid 객체
	public MemberDto getMember(int mid) {
		logger.info("mid 객체 다오");
		MemberDto member = sst.selectOne("members.getMember", mid);
		return member;
	}
	//이메일에 대한 pk
	public int loginId(String memail) {
		logger.info("멤버 아이디 다오");
		int mid = sst.selectOne("members.memberId", memail);
		return mid;
	}
	
	//인설트로 행을 추가하여 리턴
	public int joininsert(MemberDto mdt) {
		logger.info("회원가입 다오");
		int rows = sst.insert("members.joininsert", mdt);
		return rows;
	}
	
	
	//회원가입시, 사진을 추가하면 업데이트 방식으로 설정
	public int imageUpdate(MemberDto mdt) {
		logger.info("회원가입 사진 추가 다오");
		int rows = sst.update("members.imageUpdate", mdt);
		return rows;
	}
	
	//맴버_아이디 받아와서 리턴
	public MemberDto login(String memail) {
		logger.info("회원정보 다오");
		MemberDto status = sst.selectOne("members.login", memail);
		logger.info("회원정보 다오 : " + status.getMemail());
		return status;
	}

	//프로필 사진
	/*
	public MemberDtoTest loginimage(String mimage) {
		logger.info("회원사진 정보 다오");
		MemberDtoTest image = sst.selectOne("members.login", mimage);
		logger.info("회원사진 정보 다오 : " + image.getMemail());
		return image;
	}
	*/
	
	//이메일 중복 확인
	public MemberDto emailcheck(String memail) {
		logger.info("이메일 확인 다오");
		MemberDto email = sst.selectOne("members.email", memail);
		logger.info("이메일 : "+ email.getMemail());
		return email;
	}
	
	//회원정보 관리
	public MemberDto loginstatus(String mstatus) {
		logger.info("회원정보 관리 다오");
		MemberDto status = sst.selectOne("members.login", mstatus);
		logger.info("회원정보 관리 다오 : " + status.getMemail());
		return status;
	}
	//회원정보 수정
	public int statusUpdate(MemberDto status) {
		logger.info("회원정보 수정 다오");
		int update = sst.update("members.statusUpdate", status);
		return update;
	}
	public int memberdelete(int member_id) {
		logger.info("회원 탈퇴 다오");
		int delete = sst.delete("members.memberdelete", member_id);
		return delete;
	}
	public int MaccountPupdate(MemberDto member) {
		logger.info("입급 플러스 다오");
		int rows = sst.update("members.MaccountPupdate", member);
		return rows;
	}
	public int MaccountMupdate(MemberDto member) {
		logger.info("입금 마이너스 다오");
		int rows = sst.update("members.MaccountMupdate", member);
		return rows;
	}
	public int getMaccount(MemberDto member) {
		logger.info("최신 계좌 다오");
		int account = sst.selectOne("members.getMaccount", member);
		return account;
	}
	


	





}
