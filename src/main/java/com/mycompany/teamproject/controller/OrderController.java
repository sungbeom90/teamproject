package com.mycompany.teamproject.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.teamproject.dto.LocationDto;
import com.mycompany.teamproject.dto.LocationPager;
import com.mycompany.teamproject.dto.NationDto;
import com.mycompany.teamproject.dto.OrderDto;
import com.mycompany.teamproject.service.OfferService;
import com.mycompany.teamproject.service.OrderService;

//지울예정

@Controller
@RequestMapping("/order")
public class OrderController {
	private static final Logger logger=
			LoggerFactory.getLogger(OrderController.class);
	
	@Resource
	private OrderService orderService;
	@Resource
	private OfferService offerService;
	
	
	@GetMapping("/costcalcurater")
	public String costcalcurater(int opeople, int oprice, Model model) {
		logger.info("실행");
		OrderDto order = new OrderDto();
		int ocost = oprice*opeople;
		order.setOpeople(opeople);
		order.setOprice(oprice);
		order.setOcost(ocost);		
		model.addAttribute("order", order);
		return "orders/estimate";
	}
	@GetMapping("/orderreserve")
	public String orderReserveForm(OrderDto order, Model model, HttpSession session){
		logger.info("실행");
		if(session.getAttribute("sessionMid")!=null) {
			int member_id = (int) session.getAttribute("sessionMid");
			order.setMember_id(member_id);
			String otitle= offerService.getOfferTitle(order.getOffer_id());
			order.setOtitle(otitle);
			model.addAttribute("order", order);
			return "orders/orderreserve";
		} else {
			return "redirect:/memberstest/login";
		}
	}
	@Transactional
	@PostMapping("/orderreserve")
	public String orderReserve(OrderDto order, HttpSession session){
		logger.info("실행");
		order.setOstatus("ready");
		/*
		int memberId = order.getMember_id();
		int offerId= order.getOffer_id();
		int partnerId = partnerService.getPartnerId(offerId);
		memberService.setDeposit()
		deposit
		withdrow
		partnerService.
		*/
		orderService.orderProcess(order);		
		return "redirect:/main/content";
	}

	@GetMapping("/orderlist")
	public String orderlist(Model model, HttpSession session) {
		logger.info("실행");
		int member_id = (int) session.getAttribute("sessionMid");
		List<OrderDto> list = orderService.getOrderList(member_id);
		for(OrderDto order : list) {
			String otitle= offerService.getOfferTitle(order.getOffer_id());
			order.setOtitle(otitle);
		}
		model.addAttribute("list",list);
		return "orders/orderlist";
	}
}
