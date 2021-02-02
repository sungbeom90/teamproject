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

	public int insertOffer(OfferDto offer) {
		logger.info("실행");
		int rows = sst.insert("offers.insertOffer",offer);
		return rows;
	}
	
	public int insertImage(ImageDto iamge) {
		logger.info("실행");
		int rows = sst.insert("offers.insertImage",iamge);
		return rows;
	}
	public int insertCourse(CourseDto course) {
		int rows = sst.insert("offers.insertCourse",course);
		return rows;
	}

	public OfferDto selectOffer(int offer_id) {
		logger.info("실행");		
		OfferDto offer = sst.selectOne("offers.selectOffer", offer_id);
		return offer;
	}
	

	public String selectOfferTitle(int offer_id) {
		logger.info("실행");		
		String otitle = sst.selectOne("offers.selectOfferTitle", offer_id);
		return otitle;
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

	public int deleteImage(ImageDto image) {
		logger.info("실행");
		int rows = sst.delete("offers.deleteImage", image);
		return rows;
	}

	public String selectImageonameHead(int offer_id) {
		logger.info("실행");
		String iimageonameHead = sst.selectOne("offers.selectImageonameHead", offer_id);
		return iimageonameHead;
	}

	public List<OfferDto> selectOfferList(int location_id) {
		logger.info("실행");
		List<OfferDto> list = sst.selectList("offers.selectOfferList", location_id);
		return list;
	}

	public int updateOffer(OfferDto offer) {
		logger.info("실행");
		int rows = sst.update("offers.updateOffer", offer);
		return rows;
	}

	public int updateCourseText(CourseDto course) {
		logger.info("실행");
		int rows = sst.update("offers.updateCourseText", course);
		return rows;
	}

	public int updateCourseImage(CourseDto course) {
		logger.info("실행");
		int rows = sst.update("offers.updateCourseImage", course);
		return rows;
	}

	public int deleteCourseImage(CourseDto course) {
		logger.info("실행");
		int rows = sst.delete("offers.deleteCourseImage", course);
		return rows;
	}

}
