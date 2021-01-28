package com.mycompany.teamproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.controller.RegisterController;
import com.mycompany.teamproject.dto.NationDto;

@Repository
public class NationDao {
	private static final Logger logger=LoggerFactory.getLogger(NationDao.class);
	
	@Resource
	private SqlSessionTemplate sst;

	public List<NationDto> selectAll() {
		logger.info("실행");
		List<NationDto> nationList = sst.selectList("nations.selectAll");		
		return nationList;
	}
	
	public NationDto selectNation(int nation_id) {
		logger.info("실행");
		NationDto nation = sst.selectOne("nations.selectByPk", nation_id);	
		return nation;
	}
}
