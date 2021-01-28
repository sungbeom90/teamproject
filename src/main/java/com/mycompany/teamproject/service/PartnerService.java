package com.mycompany.teamproject.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.dao.PartnerDao;
import com.mycompany.teamproject.dto.PartnerDto;

@Service
public class PartnerService {
	private static final Logger logger= LoggerFactory.getLogger(PartnerService.class);
	
	@Resource
	private PartnerDao partnerDao;
	
	public int partnerinsert(PartnerDto pdt) {
		int member = partnerDao.partnerinsert(pdt);
		return member;
	}
	
	
}
