package com.mycompany.teamproject.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.controller.RegisterController;

@Repository
public class MemberDao {
	private static final Logger logger=LoggerFactory.getLogger(RegisterController.class);
	
	@Resource
	private SqlSessionTemplate sst;
}
