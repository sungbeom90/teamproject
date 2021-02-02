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

	public void offerRegister(OfferDto offer) {
		logger.info("실행");		
		offerDao.insertOffer(offer);
		
	}
	public void imageRegister(ImageDto image) {
		logger.info("실행");
		offerDao.insertImage(image);
		
	}
	public void courseRegister(CourseDto course) {
		logger.info("실행");
		offerDao.insertCourse(course);
		
	}
	public OfferDto getOffer(int offer_id) {
		logger.info("실행");
		OfferDto offer = offerDao.selectOffer(offer_id);
		return offer;
	}
	public String getOfferTitle(int offer_id) {
		logger.info("실행");
		String otitle = offerDao.selectOfferTitle(offer_id);
		return otitle;
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
	public void deleteImage(ImageDto image) {
		logger.info("실행");
		offerDao.deleteImage(image);		
	}
	public String getImageonameHead(int offer_id) {
		logger.info("실행");
		String iimageonameHead = offerDao.selectImageonameHead(offer_id);		
		return iimageonameHead;
	}
	public List<OfferDto> getOfferList(int location_id) {
		logger.info("실행");
		List<OfferDto> list = offerDao.selectOfferList(location_id);
		return list;
	}
	
	
	public List<OfferDto> getOfferRandomList() {
		logger.info("실행");
		List<OfferDto> list = offerDao.selectOfferRandomList();
		return list;
	}
	
	
	public void offerUpdate(OfferDto offer) {
		logger.info("실행");		
		offerDao.updateOffer(offer);		
	}
	public void courseUpdateText(CourseDto course) {
		logger.info("실행");
		offerDao.updateCourseText(course);		
	}
	public void courseUpdateImage(CourseDto course) {
		logger.info("실행");
		offerDao.updateCourseImage(course);	
	}
	public void courseDeleteImage(CourseDto course) {
		logger.info("실행");
		offerDao.deleteCourseImage(course);			
	}
	

		
}

	
	
	

