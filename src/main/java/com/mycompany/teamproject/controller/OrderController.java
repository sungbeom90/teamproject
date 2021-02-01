package com.mycompany.teamproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//지울예정

@Controller
@RequestMapping("/orders")
public class OrderController {
	private static final Logger logger=
			LoggerFactory.getLogger(OrderController.class);
	
	@GetMapping("/rcmoffer")
	public String rcmoffer(Model model) {
		logger.info("실행");
		return "locations/rcmofferlist";
	}
	
}
