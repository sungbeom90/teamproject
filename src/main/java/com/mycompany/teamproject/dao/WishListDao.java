package com.mycompany.teamproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.controller.RegisterController;
import com.mycompany.teamproject.dto.NationDto;
import com.mycompany.teamproject.dto.WishListDto;

@Repository
public class WishListDao {
	private static final Logger logger=LoggerFactory.getLogger(WishListDao.class);
	
	@Resource
	private SqlSessionTemplate sst;

	public List<WishListDto> selectAll() {
		logger.info("실행");
		List<WishListDto> wishlistList = sst.selectList("wishes.selectAll");		
		return wishlistList;
	}
	
	/*	public NationDto selectNation(int nation_id) {
			logger.info("실행");
			NationDto nation = sst.selectOne("nations.selectByPk", nation_id);	
			return nation;
		}*/
}
