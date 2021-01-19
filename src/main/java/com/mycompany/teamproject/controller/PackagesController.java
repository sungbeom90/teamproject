package com.mycompany.teamproject.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.PackageDto;

@Controller
@RequestMapping("/packages")
public class PackagesController {
		private static final Logger logger=
				LoggerFactory.getLogger(PackagesController.class);


		
		@GetMapping("/content")
		public String usa(HttpSession session){
			logger.info("content 실행");
			PackageDto usadto = new PackageDto();
			usadto.setWant("원하는 여행지를 골라보세요");
			usadto.setImg1("/resources/img/fukuoka1.jpg");
			usadto.setImg2("/resources/img/hawaii1.jpg");
			usadto.setImg3("/resources/img/seville1.jpg");
			usadto.setImg4("/resources/img/sokcho1.jpg");
			usadto.setBig1("벳푸 온천 체험");
			usadto.setBig2("다이아몬드헤드 투어");
			usadto.setBig3("스페인 광장 투어");
			usadto.setBig4("설 악 산");
			usadto.setSm1("::다양한 지옥 온천 체험::");
			usadto.setSm2("::일출보러 가기::");
			usadto.setSm3("걸어서 광장 가기");
			usadto.setSm4("::트래킹 하러가기::");
			usadto.setBtn1("/offers/fukuoka_offer1");
			usadto.setBtn2("/offers/hawaii_offer1");
			usadto.setBtn3("/offers/barcelona_offer1");
			usadto.setBtn4("/offers/sokcho_offer1");
			session.setAttribute("packages", usadto);
			
			return "packages/content"; 
		}
		

}
