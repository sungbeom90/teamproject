package com.mycompany.teamproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.OfferBoardDto;




@Repository
public class OfferDao {
	private static final Logger logger 
			= LoggerFactory.getLogger(OfferDao.class);
	
	@Resource
	private SqlSessionTemplate sst;
	
	
	public OfferBoardDto selectByPk(int offer_id) {
		OfferBoardDto board = sst.selectOne("boards.selectByPk",offer_id);
		return board;
	}


	public int insert(OfferBoardDto offer) {
		int rows = sst.insert("offers.insert",offer);
		return rows;
	}
}
