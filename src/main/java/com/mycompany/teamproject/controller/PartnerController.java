package com.mycompany.teamproject.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.PartnerDto;
import com.mycompany.teamproject.service.PartnerService;

@Controller
@RequestMapping("/partners")
public class PartnerController {
	private static final Logger logger= LoggerFactory.getLogger(PartnerController.class);
	
	@Resource
	private PartnerService partnerService;
	
	@RequestMapping("/content")
	public String content() {
		logger.info("실행");
		return "partners/content";
	}
	
	//파트너 등록
	@GetMapping("/partnerjoin")
	public String partnerJoinForm() {
		logger.info("파트너 등록 실행");
		return "partners/partnerjoin";
	}
	
	@PostMapping("/partnerjoin")
	public String partnerjoin(PartnerDto pdt, String location_name, HttpSession session, Model model) {
		logger.info("파트너 등록 페이지");
		/*
		int pjoin = partnerService.partnerinsert(pdt);
		model.addAttribute("pdate", pjoin);
		*/
		
		int lid = partnerService.locationname(location_name);
		int mid = (int) session.getAttribute("sessionMid");
		logger.info("" + mid);
		
		
		pdt.setMember_id(mid);
		pdt.setLocation_id(lid);
		partnerService.partnerinsert(pdt);
		return "redirect:/partners/content";
				
	}
	
	//파트너 정보
	@GetMapping("/partnerstatus")
	public String partnerstatus(PartnerDto partner, HttpSession session) {
		logger.info("파트너 정보 관리");
		int mid = (int) session.getAttribute("sessionMid");
		logger.info("mid : " + mid);
		partner.setMember_id(mid);
		
		PartnerDto status = partnerService.partnerstatus(partner);
		logger.info("파트너 id : "+status.getPartner_id());
		session.setAttribute("partner", status);
		return "partners/partnerstatus";
	}
	
	//파트너 정보 수정
	@GetMapping("/partnerupdate")
	public String partnerupdate(PartnerDto pid, HttpSession session) {
		logger.info("파트너 정보 수정 요청");
		int mid = (int) session.getAttribute("sessionMid");
		
		pid.setMember_id(mid);
		partnerService.partnerupdate(pid);
		
		return "partners/partnerupdate";
	}
	
	@PostMapping("/partnerupdate")
	public String statusUpdate(PartnerDto status, String location_name, HttpSession session) {
		logger.info("파트너 정보 수정 보내기");
		int lid = partnerService.locationname(location_name);
		int mid = (int) session.getAttribute("sessionMid");
		
		status.setMember_id(mid);
		status.setLocation_id(lid);
		partnerService.statusUpdate(status);
		return "redirect:/partners/partnerstatus";
	}
	
	//파트너 탈퇴
	@GetMapping("/partnerdelete")
	public String partnerdelete(int partner_id) {
		logger.info("파트너 취소하기");
		partnerService.partnerdelete(partner_id);
		return "redirect:/partners/content";
	}
}
