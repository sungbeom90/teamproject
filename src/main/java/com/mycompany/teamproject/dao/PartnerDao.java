package com.mycompany.teamproject.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.LocationDto;
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
	public int locationName(String lname) {
		logger.info("지역 이름 가져오기 다오");
		int locationId = sst.selectOne("partners.selectByName", lname);
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

	public int setPaccountP(PartnerDto partner) {
		logger.info("파트너 플러스 다오");
		int rows = sst.update("partners.setPaccountP", partner);
		return rows;
	}

	public int setPaccountM(PartnerDto partner) {
		logger.info("파트너 마이너스 다오");
		int rows = sst.update("partners.setPaccountM", partner);
		return rows;
	}

	public String getLname(int lid) {
		logger.info("지역이름 가져오기 다오");
		String name = sst.selectOne("partners.getLname", lid);
		return name;
	}

	public int getMid(int pid) {
		logger.info("mid로 pid가져오기 다오");
		int mid = sst.selectOne("partners.getMid", pid);
		return mid;
	}

	public String getPname(int pid) {
		logger.info("pid로 pname 가져오기 다오");
		String pname = sst.selectOne("partners.getPname", pid);
		return pname;
	}




	
}
