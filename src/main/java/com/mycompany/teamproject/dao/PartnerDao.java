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
	
	public PartnerDto getPartner(int mid) {
		logger.info("pid 객체 다오");
		PartnerDto partner = sst.selectOne("partners.getPartner", mid);
		return partner;
	}
	
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

	
}
