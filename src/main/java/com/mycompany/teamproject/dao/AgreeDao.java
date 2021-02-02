package com.mycompany.teamproject.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.AgreeDto;

@Repository
public class AgreeDao {
	private static final Logger logger=LoggerFactory.getLogger(AgreeDao.class);
	
	@Resource
	private SqlSessionTemplate sst;

	public int agreeInsert(AgreeDto agree) {
		int rows = sst.insert("agrees.agreeInsert", agree);
		return rows;
	}


}
