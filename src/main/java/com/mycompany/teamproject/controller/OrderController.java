package com.mycompany.teamproject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.Exception.AccountInsufficientException;
import com.mycompany.teamproject.dto.MemberDto;
import com.mycompany.teamproject.dto.OrderDto;
import com.mycompany.teamproject.dto.PartnerDto;
import com.mycompany.teamproject.service.MemberService;
import com.mycompany.teamproject.service.OfferService;
import com.mycompany.teamproject.service.OrderService;
import com.mycompany.teamproject.service.PartnerService;

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
	@Resource
	private MemberService memberService;
	@Resource
	private PartnerService partnerService;
	
	
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
			int maccount = memberService.getMaccount(member_id);
			model.addAttribute("maccount", maccount);
			model.addAttribute("order", order);
			return "orders/orderreserve";
		} else {
			return "redirect:/memberstest/login";
		}
	}
	@Transactional
	@PostMapping("/orderreserve")
	public String orderReserve(OrderDto order, HttpSession session, HttpServletResponse response) throws Exception{
		logger.info("실행");
		order.setOstatus("ready");
		String result;
		
		int member_id = order.getMember_id();
		int offer_id = order.getOffer_id();
		int partner_id = offerService.getPartnerId(offer_id);
		int ocost = order.getOcost();		
		try {
			orderService.setAccount(ocost, member_id, partner_id);
			orderService.orderProcess(order);
			result = "success";
		} catch (AccountInsufficientException e) {
			result = e.getMessage();			
		}
		return "redirect:/order/orderlist";
		
		/*
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();			
		JSONObject root = new JSONObject();
		root.put("result", result);
		pw.println(root.toString());
		pw.flush();
		pw.close();
		*/
		
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
