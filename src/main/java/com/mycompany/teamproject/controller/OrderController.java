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

import com.mycompany.teamproject.dto.OfferDto;
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
			
			model.addAttribute("order", order);
			model.addAttribute("otitle", otitle);
			return "orders/orderreserve";
		} else {
			return "redirect:/memberstest/login";
		}
	}
	
	@PostMapping("/orderreserve")
	public String orderReserve(OrderDto order, HttpSession session){
		logger.info("실행");
		orderService.orderProcess(order);
		
		
		return "redirect:/memberstest/login";
	}
	
}
