package com.mycompany.teamproject.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.PartnerDto;

@Repository
public class PartnerDao {
	private static final Logger logger= LoggerFactory.getLogger(PartnerDao.class);
	
	@Resource
	private SqlSessionTemplate sst;
	
	//멤버 id에 대한 파트너 모든 정보
	public PartnerDto getPartner(int mid) {
		logger.info("pid 객체 다오");
		PartnerDto partner = sst.selectOne("partners.getPartner", mid);
		return partner;
	}
	
	//멤버 id에 대한 파트너 id
	public int getPartnerId(int member_id) {
		logger.info("pid 값 얻기 다오");
		int partner = sst.selectOne("partners.getPartnerId", member_id);
		logger.info("pid : "+partner);
		return partner;
	}
	
	//지역 이름에 대한 지역id
	public int locationName(String location_name) {
		logger.info("지역 이름 가져오기 다오");
		int locationId = sst.selectOne("partners.selectByName", location_name);
		return locationId;
	}
	
	public int partnerinsert(PartnerDto partnerjoin) {
		logger.info("파트너 등록 다오");
		int rows = sst.insert("partners.partnerinsert", partnerjoin);
		return rows;
	}

	public PartnerDto partnerstatus(PartnerDto member_id) {
		logger.info("파트너 정보 다오");
		PartnerDto status = sst.selectOne("partners.partnerStatus", member_id);
		return status;
	}

	public PartnerDto partnerEmail(PartnerDto partner) {
		logger.info("파트너 이메일 다오");
		PartnerDto partnerId = sst.selectOne("partners.partnerEmail", partner);
		return partnerId;
	}

	public PartnerDto partnerupdate(PartnerDto pid) {
		logger.info("파트너 수정 정보 다오");
		PartnerDto update = sst.selectOne("partners.partnerStatus", pid);
		return update;
	}

	public int statusUpdate(PartnerDto status) {
		logger.info("파트너 정보 수정 다오");
		int update = sst.update("partners.partnerUpdate", status);
		return update;
	}

	public int partnerdelete(int partner_id) {
		logger.info("파트너 취소 다오");
		int delete = sst.delete("partners.partnerdelete", partner_id);
		return delete;
	}


	
}
