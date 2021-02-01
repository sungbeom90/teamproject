package com.mycompany.teamproject.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.NationDto;
import com.mycompany.teamproject.dto.WishListDto;
import com.mycompany.teamproject.service.WishListService;

//지울예정

@Controller
@RequestMapping("/wishes")
public class WishListController {
	private static final Logger logger=
			LoggerFactory.getLogger(WishListController.class);
	
	@Resource
	private WishListService wishlistService;
	
	@GetMapping("/wishlist")
	public String wishlist(Model model) {
		logger.info("실행");
		List<WishListDto> list = wishlistService.getWishListList();
		model.addAttribute("list",list);
		return "wishes/wishlist";
	}
	
}
