package com.mycompany.teamproject.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.mycompany.teamproject.dto.AgreeDto;
import com.mycompany.teamproject.service.AgreeService;


@Controller
public class AgreeController {private static final Logger logger=LoggerFactory.getLogger(AgreeController.class);
		
		@Resource
		AgreeService agreeService;
		
	
		
		
		
}
