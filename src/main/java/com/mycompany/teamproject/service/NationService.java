package com.mycompany.teamproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.dao.NationDao;
import com.mycompany.teamproject.dto.NationDto;

@Service
public class NationService {
	private static final Logger logger=LoggerFactory.getLogger(NationService.class);
	
	@Resource
	private NationDao nationDao;
	
	//나라별 리스트 불러오기. dao로 요청
	public List<NationDto> getNationList() {
		logger.info("실행");
		List<NationDto> nationList = nationDao.selectAll();		
		return nationList;
	}
	
	public NationDto getNation(int nation_id) {
		logger.info("실행");
		NationDto nation = nationDao.selectNation(nation_id);
		return nation;
	}
	
	
}
