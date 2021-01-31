package com.mycompany.teamproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.CourseDto;
import com.mycompany.teamproject.dto.ImageDto;
import com.mycompany.teamproject.dto.OfferDto;




@Repository
public class OfferDao {
	private static final Logger logger 
			= LoggerFactory.getLogger(OfferDao.class);
	
	@Resource
	private SqlSessionTemplate sst;

	public int inserttext(OfferDto offer) {
		logger.info("실행");
		int rows = sst.insert("offers.insertoffer",offer);
		return rows;
	}
	
	public int insertimage(ImageDto iamge) {
		logger.info("실행");
		int rows = sst.insert("offers.insertimage",iamge);
		return rows;
	}
	public int insertcourse(CourseDto course) {
		int rows = sst.insert("offers.insertcourse",course);
		return rows;
	}

	public OfferDto selectOffer(int offer_id) {
		logger.info("실행");		
		OfferDto offer = sst.selectOne("offers.selectOffer", offer_id);
		return offer;
	}

	public List<ImageDto> selectImageList(int offer_id) {
		logger.info("실행");	
		List<ImageDto> imageList = sst.selectList("offers.selectImageList", offer_id); 
		return imageList;
	}

	public List<CourseDto> selectCourseList(int offer_id) {
		logger.info("실행");
		List<CourseDto> CourseList = sst.selectList("offers.selectCourseList", offer_id);
		return CourseList;
	}
}
