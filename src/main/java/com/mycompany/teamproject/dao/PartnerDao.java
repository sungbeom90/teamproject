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
	
	public int locationName(String location_name) {
		int locationId = sst.selectOne("partners.selectByName", location_name);
		return locationId;
	}
	
	public int partnerinsert(PartnerDto partnerjoin) {
		logger.info("파트너 등록 다오");
		int rows = sst.insert("partners.partnerinsert", partnerjoin);
		return rows;
	}
}
