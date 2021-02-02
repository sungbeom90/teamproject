package com.mycompany.teamproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.dao.WishDao;
import com.mycompany.teamproject.dto.WishDto;

@Service
public class WishService {
	private static final Logger logger=LoggerFactory.getLogger(WishService.class);
	
	
	
	@Resource
	private WishDao wishDao;
	
	//위시리스트 불러오기. dao로 요청
	public List<WishDto> getWishList() {
		logger.info("실행");
		List<WishDto> list = wishDao.selectAll();		
		return list;
	}

	public WishDto getWishList(int offer_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*public NationDto getNation(int nation_id) {
		logger.info("실행");
		NationDto nation = nationDao.selectNation(nation_id);
		return nation;
	}*/
	
	
}
