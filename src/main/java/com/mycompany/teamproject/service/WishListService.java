package com.mycompany.teamproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.controller.RegisterController;
import com.mycompany.teamproject.dao.MemberDao;
import com.mycompany.teamproject.dao.NationDao;
import com.mycompany.teamproject.dao.WishListDao;
import com.mycompany.teamproject.dto.NationDto;
import com.mycompany.teamproject.dto.WishListDto;

@Service
public class WishListService {
	private static final Logger logger=LoggerFactory.getLogger(WishListService.class);
	
	
	
	@Resource
	private WishListDao wishlistDao;
	
	//위시리스트 불러오기. dao로 요청
	public List<WishListDto> getWishListList() {
		logger.info("실행");
		List<WishListDto> list = wishlistDao.selectAll();		
		return list;
	}

	public WishListDto getWishListList(int offer_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*public NationDto getNation(int nation_id) {
		logger.info("실행");
		NationDto nation = nationDao.selectNation(nation_id);
		return nation;
	}*/
	
	
}
