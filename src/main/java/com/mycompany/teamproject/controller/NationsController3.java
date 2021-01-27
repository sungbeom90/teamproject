package com.mycompany.teamproject.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.Nation;
import com.mycompany.teamproject.service.NationService;

@Controller
@RequestMapping("/nations3")
public class NationsController3 {
		private static final Logger logger=
				LoggerFactory.getLogger(NationsController3.class);
		
		@Resource
		NationService nationService;


		// http://.../teamproject/nations 생략됨
		@RequestMapping("/content")
		public String content() {
			logger.info("실행");
			return "nations/content";
		}
		// 메인 -> 나라별 눌렀을때  리스트 나오는 화면. 서비스로 요청
		@GetMapping("/nationlist")
		public String nationlist(Model model) {
			logger.info("실행");
			List<Nation> list = nationService.getNationList();			
			model.addAttribute("list",list);
			return "nations/nationlist3";
		}
		
		@GetMapping("/nation")
		public String nation(Model model, int nation_id) {
			logger.info("실행");
			Nation nation = nationService.getNation(nation_id);
			model.addAttribute("nation1", nation);
			return "nations/nationlist3";
		}
		
		
		

}
