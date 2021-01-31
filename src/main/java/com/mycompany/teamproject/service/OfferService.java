package com.mycompany.teamproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.dao.OfferDao;
import com.mycompany.teamproject.dto.CourseDto;
import com.mycompany.teamproject.dto.ImageDto;
import com.mycompany.teamproject.dto.OfferDto;

@Service
public class OfferService {
	private static final Logger logger=LoggerFactory.getLogger(OfferService.class);
	
	@Resource
	private OfferDao offerDao;

	public void textRegister(OfferDto offer) {
		logger.info("실행");		
		offerDao.inserttext(offer);
		
	}
	public void ImageRegister(ImageDto image) {
		logger.info("실행");
		offerDao.insertimage(image);
		
	}
	public void CourseRegister(CourseDto course) {
		logger.info("실행");
		offerDao.insertcourse(course);
		
	}
	public OfferDto getOffer(int offer_id) {
		logger.info("실행");
		OfferDto offer = offerDao.selectOffer(offer_id);
		return offer;
	}
	public List<ImageDto> getImageList(int offer_id) {
		logger.info("실행");
		List<ImageDto> imageList = offerDao.selectImageList(offer_id);
		return imageList;
	}
	public List<CourseDto> getCourseList(int offer_id) {
		logger.info("실행");
		List<CourseDto> CourseList = offerDao.selectCourseList(offer_id);
		return CourseList;
	}
	

		
}

	
	
	

