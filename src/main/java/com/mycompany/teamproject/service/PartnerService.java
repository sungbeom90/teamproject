package com.mycompany.teamproject.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.dao.PartnerDao;
import com.mycompany.teamproject.dto.LocationDto;
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
	public int locatioNname(String lname) {
		logger.info("지역 이름 가져오기 서비스");
		int locationid = partnerDao.locationName(lname);
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
	public void statusUpdate(PartnerDto status) {
		logger.info("파트너 정보 수정 서비스");
		partnerDao.statusUpdate(status);
	}
	public void partnerdelete(int partner_id) {
		logger.info("파트너 취소 서비스");
		partnerDao.partnerdelete(partner_id);
	}
	public int setPaccountP(PartnerDto partner) {
		logger.info("파트너 플러스 확인 서비스");
		int rows = partnerDao.setPaccountP(partner);
		return rows;
	}
	
	public int setPaccountM(PartnerDto partner) {
		logger.info("파트너 마이너스 확인 서비스");
		int rows = partnerDao.setPaccountM(partner);
		return rows;
	}
	public String getLname(int lid) {
		logger.info("지역이름 가져오기 서비스");
		String name = partnerDao.getLname(lid);
		return name;
	}
	
	public int getMid(int pid) {
		logger.info("mid로 pid가져오기 서비스");
		int mid = partnerDao.getMid(pid);
		return mid;
	}
	
	public String getPname(int pid) {
		logger.info("pid로 pname 가져오기 서비스");
		String pname = partnerDao.getPname(pid);
		return pname;
	}

	
	
	

}
