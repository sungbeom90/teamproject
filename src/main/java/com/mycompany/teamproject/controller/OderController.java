package com.mycompany.teamproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//지울예정

@Controller
@RequestMapping("/recommandoffer")
public class OderController {
	private static final Logger logger=
			LoggerFactory.getLogger(OderController.class);
	
	@GetMapping("/rcmoffer")
	public String rcmofferlist(Model model) {
		return "locations/rcmofferlist";
	}
}
