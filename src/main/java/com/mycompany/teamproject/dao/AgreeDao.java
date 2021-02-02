package com.mycompany.teamproject.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class AgreeDao {
	private static final Logger logger=LoggerFactory.getLogger(AgreeDao.class);
	
	@Resource
	private SqlSessionTemplate sst;


}
