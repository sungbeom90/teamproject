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

	//멤버 id에 대한 파트너 모든 정보
	public PartnerDto getPartner(int mid) {
		logger.info("pid 객체 가져오기 서비스");
		PartnerDto partner = partnerDao.getPartner(mid);
		return partner;
	}
	//멤버 id에 대한 파트너 id
	public int getPartnerId(int member_id) {
		logger.info("pid 값 얻기 서비스");
		int partner = partnerDao.getPartnerId(member_id);
		logger.info("pid : "+partner);
		return partner;
	}
	
	//입력 지역에 대한 지역 id값
	public int locationname(String location_name) {
		logger.info("지역 이름 가져오기 서비스");
		int locationid = partnerDao.locationName(location_name);
		return locationid;

	}

	public int partnerinsert(PartnerDto partnerjoin) {
		logger.info("파트너 등록 서비스");
		int member = partnerDao.partnerinsert(partnerjoin);
		return member;
	}
	
	
	//파트너 정보
	public PartnerDto partnerstatus(PartnerDto member_id) {
		logger.info("파트너 정보 서비스");
		PartnerDto status = partnerDao.partnerstatus(member_id);
		return status;
	}
	//이메일에 대한 파트너 id
	public PartnerDto partnerEmail(PartnerDto partner) {
		logger.info("이메일로 파트너 id 서비스");
		PartnerDto partnerId = partnerDao.partnerEmail(partner);
		return partnerId;
	}
	public PartnerDto partnerupdate(PartnerDto pid) {
		logger.info("파트너 수정  서비스");
		PartnerDto update = partnerDao.partnerupdate(pid);
		return update;
	}

}
