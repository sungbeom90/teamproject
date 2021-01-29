package com.mycompany.teamproject.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.dao.PartnerDao;
import com.mycompany.teamproject.dto.PartnerDto;

@Service
public class PartnerService {
	private static final Logger logger = LoggerFactory.getLogger(PartnerService.class);

	@Resource
	private PartnerDao partnerDao;

	public int locationname(String location_name) {
		int locationid = partnerDao.locationName(location_name);
		return locationid;

	}

	public int partnerinsert(PartnerDto pdt) {
		logger.info("파트너 등록 서비스");
		int member = partnerDao.partnerinsert(pdt);
		return member;
	}

}
