package com.mycompany.teamproject.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.LocationDto;
import com.mycompany.teamproject.dto.PartnerDto;
import com.mycompany.teamproject.service.LocationService;
import com.mycompany.teamproject.service.PartnerService;

@Controller
@RequestMapping("/partners")
public class PartnerController {
	private static final Logger logger= LoggerFactory.getLogger(PartnerController.class);
	
	@Resource
	private PartnerService partnerService;
	
	@Resource
	private LocationService locationService;
	
	
	
	@RequestMapping("/content")
	public String content() {
		logger.info("실행");
		return "partners/content";
	}
	
	@GetMapping("/partnerjoin")
	public String partnerJoinForm() {
		logger.info("파트너 등록 실행");
		return "partners/partnerjoin";
	}
	
	@PostMapping("/partnerjoin")
	public String partnerjoin(PartnerDto pdt, String location_name, HttpSession session) {
		logger.info("파트너 등록 페이지");
		
		int lid = partnerService.locationname(location_name);
		int mid = (int) session.getAttribute("sessionMid");
		logger.info("" + mid);
		
		pdt.setMember_id(mid);
		pdt.setLocation_id(lid);
		partnerService.partnerinsert(pdt);
		return "partners/content";
				
	}
}
