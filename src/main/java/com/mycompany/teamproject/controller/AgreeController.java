package com.mycompany.teamproject.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.service.AgreeService;




@Controller
@RequestMapping("")
public class AgreeController {private static final Logger logger=LoggerFactory.getLogger(AgreeController.class);
		
		@Resource
		AgreeService agreesevice;
		
		
}
