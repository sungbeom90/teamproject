package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

public class Ch05Controller {
	private static final Logger logger=
			LoggerFactory.getLogger(Ch05Controller.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch05/content";
	}
}
