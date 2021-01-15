package com.mycompany.teamproject.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.teamproject.dto.Ch03Dto;

@Controller
@RequestMapping("/ch03")
public class Ch03Controller {
	private static final Logger logger=
			LoggerFactory.getLogger(Ch03Controller.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch03/content";
	}
	
	@RequestMapping("/method1")
	public String method1(String param1, int param2, double param3, boolean param4, @DateTimeFormat(pattern="yyyy-MM-dd") Date param5) {
		logger.info("param1:"+param1);
		logger.info("param2:"+param2);
		logger.info("param3:"+param3);
		logger.info("param4:"+param4);
		logger.info("param5:"+param5);
		return "ch03/content";
	}
	
	@RequestMapping("/method2")
	public String method2(
			@RequestParam("param1") String arg1, 
			@RequestParam("param2") int arg2, 
			@RequestParam("param3") double arg3, 
			@RequestParam("param4") boolean arg4, 
			@DateTimeFormat(pattern="yyyy-MM-dd") Date param5) {
		logger.info("param1:"+arg1);
		logger.info("param2:"+arg2);
		logger.info("param3:"+arg3);
		logger.info("param4:"+arg4);
		logger.info("param5:"+param5);
		return "ch03/content";
	}
	@RequestMapping("/method3")
	public String method3(
			String param1, 
			@RequestParam(defaultValue="0") int param2, 
			@RequestParam(defaultValue="0.0") double param3, 
			@RequestParam(defaultValue="false") boolean param4) {
		logger.info("param1:"+param1);
		logger.info("param2:"+param2);
		logger.info("param3:"+param3);
		logger.info("param4:"+param4);
		return "ch03/content";
	}
	@RequestMapping("/method4")
	public String method4(Ch03Dto dto) {
		logger.info("param1:"+ dto.getParam1());
		logger.info("param1:"+ dto.getParam2());
		logger.info("param1:"+ dto.getParam3());
		logger.info("param1:"+ dto.isParam4());
		logger.info("param1:"+ dto.getParam5());
			
		return "ch03/content";
	}
}
