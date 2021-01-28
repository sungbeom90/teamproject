package com.mycompany.teamproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.CourseDto;
import com.mycompany.teamproject.dto.ImageDto;
import com.mycompany.teamproject.dto.OfferBoardDto;




@Repository
public class OfferDao {
	private static final Logger logger 
			= LoggerFactory.getLogger(OfferDao.class);
	
	@Resource
	private SqlSessionTemplate sst;
	
	
	public OfferBoardDto selectByPk(int offer_id) {
		OfferBoardDto offer = sst.selectOne("offers.selectByPk",offer_id);
		return offer;
	}


	public int insertoffer(OfferBoardDto offer) {
		int rows = sst.insert("offers.insertoffer",offer);
		return rows;
	}
	
	public int insertimage(ImageDto iamge) {
		int rows = sst.insert("offers.insertimage",iamge);
		return rows;
	}
	public int insertcourse(CourseDto course) {
		int rows = sst.insert("offers.insertcourse",course);
		return rows;
	}
}
