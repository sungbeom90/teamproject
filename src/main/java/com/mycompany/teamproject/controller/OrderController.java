package com.mycompany.teamproject.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.OrderDto;

//지울예정

@Controller
@RequestMapping("/order")
public class OrderController {
	private static final Logger logger=
			LoggerFactory.getLogger(OrderController.class);
	
	@GetMapping("/rcmoffer")
	public String rcmoffer(Model model) {
		logger.info("실행");
		return "locations/rcmofferlist";
	}
	
	@GetMapping("/costcalcurater")
	public String costcalcurater(int opeople, int oprice, Model model) {
		OrderDto order = new OrderDto();
		int ocost = oprice*opeople;
		order.setOpeople(opeople);
		order.setOprice(oprice);
		order.setOcost(ocost);		
		model.addAttribute("order", order);
		logger.info("실행");
		return "orders/estimate";
	}
	@Transactional
	@PostMapping("/orderreserve")
	public String orderreserve(OrderDto order, Model model){
		logger.info("실행");
		
		
		return "main/content";
	}
	
}
