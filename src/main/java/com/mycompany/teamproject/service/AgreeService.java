package com.mycompany.teamproject.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mycompany.teamproject.dao.AgreeDao;
import com.mycompany.teamproject.dto.AgreeDto;

@Service
public class AgreeService {

	@Resource
	AgreeDao agreeDao;
	
	public int agreeInsert(AgreeDto agree) {
		int rows = agreeDao.agreeInsert(agree);
		return rows;
	}

}
