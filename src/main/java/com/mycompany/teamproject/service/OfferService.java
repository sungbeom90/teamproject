package com.mycompany.teamproject.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.controller.RegisterController;
import com.mycompany.teamproject.dao.MemberDao;
import com.mycompany.teamproject.dao.OfferDao;
import com.mycompany.teamproject.dto.CourseDto;
import com.mycompany.teamproject.dto.ImageDto;
import com.mycompany.teamproject.dto.OfferBoardDto;

@Service
public class OfferService {
	private static final Logger logger=LoggerFactory.getLogger(OfferService.class);
	
	@Resource
	private OfferDao offerDao;

	public void saveRegister(OfferBoardDto offer) {
		offerDao.insertoffer(offer);
		
	}
	public void saveImageRegister(ImageDto image) {
		offerDao.insertimage(image);
		
	}
	public void saveCourseRegister(CourseDto course) {
		offerDao.insertcourse(course);
		
	}
	

		
}

	
	
	

