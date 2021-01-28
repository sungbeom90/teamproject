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
	
	public int partnerinsert(PartnerDto partnerjoin) {
		int rows = sst.insert("partners.partnerinsert", partnerjoin);
		return rows;
	}
}
