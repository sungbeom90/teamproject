package com.mycompany.teamproject.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.WishDto;
import com.mycompany.teamproject.service.WishService;

//지울예정

@Controller
@RequestMapping("/wish")
public class WishController {
	private static final Logger logger=
			LoggerFactory.getLogger(WishController.class);
	
	@Resource
	private WishService wishService;
	
	@GetMapping("/wishlist")
	public String wishlist(Model model) {
		logger.info("실행");
		List<WishDto> list = wishService.getWishList();
		model.addAttribute("list",list);
		return "wishes/wishlist";
	}
	
	@GetMapping("/wishlistread")
	public String wishlistread(int offer_id, Model model) {
		logger.info("실행");
		WishDto wish = wishService.getWishList(offer_id);
		model.addAttribute("wish", wish);
		return "";
	}
	
}
