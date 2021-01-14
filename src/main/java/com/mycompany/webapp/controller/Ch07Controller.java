package com.mycompany.webapp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.webapp.dto.Ch07Board;

@Controller
@RequestMapping("/ch07")
public class Ch07Controller {
	private static final Logger logger= LoggerFactory.getLogger(Ch07Controller.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch07/content";
	}
	
	@GetMapping("/method1")
	public String method1(Model model) {
		logger.info("실행");
		model.addAttribute("name", "스프링");
		model.addAttribute("age", "26");
		model.addAttribute("job", "인공지능 개발자");		
		return "ch07/el";
	}
	
	@GetMapping("/method2")
	public String method2(Model model) {
		logger.info("실행");	
		Ch07Board board = new Ch07Board();
		board.setNo(1);
		board.setTitle("너무 추워요");
		board.setContent("과제하면 덜 추워요. 과제 내 주세요");
		board.setWriter("감자바");
		board.setDate(new Date());
		model.addAttribute("board1",board);		
		
		return "ch07/el";
	}
	
	@GetMapping("/method3")
	public String method3(Model model) {
		logger.info("실행");	
		List<Ch07Board> list = new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			Ch07Board board = new Ch07Board();
			board.setNo(i);
			board.setTitle("온도가"+i+"도 만큼 추워요");
			board.setContent("과제하면 덜 추워요. 과제 "+i+"개 주세요");
			board.setWriter("기호 "+i+"번 감자바");
			board.setDate(new Date());
			list.add(board);
		}
		model.addAttribute("boardList",list);
		return "ch07/el";
	}

}
