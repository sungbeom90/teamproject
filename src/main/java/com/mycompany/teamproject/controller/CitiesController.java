package com.mycompany.teamproject.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.CitiesDto;
import com.mycompany.teamproject.dto.CountryDto;

@Controller
@RequestMapping("/cities")
public class CitiesController {
		private static final Logger logger=
				LoggerFactory.getLogger(CitiesController.class);


		// http://.../teamproject/cities 생략됨
		@RequestMapping("/content")
		public String content() {
			logger.info("실행");
			return "cities/content";
		}
	
		
		@GetMapping("/newyork")
		public String newyork(HttpSession session){
			logger.info("newyork 실행");
			CitiesDto ctdto = new CitiesDto();
			ctdto.setImgHead("/resources/img/newyork_head.jpg");
			ctdto.setImgPackage1("/resources/img/newyork1.jpg");
			ctdto.setImgPackage2("/resources/img/newyork2.jpg");
			ctdto.setName("뉴 욕");
			ctdto.setRecommend("<h2>추천 상품</h2>");
			ctdto.setBig1("메트로폴리탄 미술관");
			ctdto.setBig2("::서양 미술사 투어::");
			ctdto.setSm1("자유의 여신상");
			ctdto.setSm2("::자유의 여신상 투어::");
			ctdto.setBtn1("/offers/newyork_offer1");
			ctdto.setBtn2("/offers/newyork_offer2");
			
			session.setAttribute("city", ctdto);
			
			return "cities/city"; 
		}
		
		@GetMapping("/hawaii")
		public String hawaii(HttpSession session){
			logger.info("hawaii 실행");
			CitiesDto ctdto = new CitiesDto();
			ctdto.setImgHead("/resources/img/hawaii_head.jpg");
			ctdto.setImgPackage1("/resources/img/hawaii1.jpg");
			ctdto.setImgPackage2("/resources/img/hawaii2.jpg");
			ctdto.setName("하 와 이");
			ctdto.setRecommend("<h2>추천 상품</h2>");
			ctdto.setBig1("다이아몬드헤드 투어");
			ctdto.setBig2("::일출보러 가기::");
			ctdto.setSm1("스쿠버 다이빙 체험");
			ctdto.setSm2("::거북이 만나러 가기::");
			ctdto.setBtn1("/offers/hawaii_offer1");
			ctdto.setBtn2("/offers/hawaii_offer2");
			
			session.setAttribute("city", ctdto);
			
			return "cities/city"; 
		}
		
		@GetMapping("/barcelona")
		public String barcelona(HttpSession session){
			logger.info("barcelona 실행");
			CitiesDto ctdto = new CitiesDto();
			ctdto.setImgHead("/resources/img/barcelona_head.jpg");
			ctdto.setImgPackage1("/resources/img/barcelona1.jpg");
			ctdto.setImgPackage2("/resources/img/barcelona2.jpg");
			ctdto.setName("바 르 셀 로 나");
			ctdto.setRecommend("<h2>추천 상품</h2>");
			ctdto.setBig1("라발지구 올드바 투어");
			ctdto.setBig2("::투어하러 가기::");
			ctdto.setSm1("벨 항구에서 일몰 요트");
			ctdto.setSm2("::일몰보며 힐링::");
			ctdto.setBtn1("/offers/barcelona_offer1");
			ctdto.setBtn2("/offers/barcelona_offer2");
			
			session.setAttribute("city", ctdto);
			
			return "cities/city"; 
		}
		
		@GetMapping("/seville")
		public String seville(HttpSession session){
			logger.info("seville 실행");
			CitiesDto ctdto = new CitiesDto();
			ctdto.setImgHead("/resources/img/seville_head.jpg");
			ctdto.setImgPackage1("/resources/img/seville1.jpg");
			ctdto.setImgPackage2("/resources/img/seville2.jpg");
			ctdto.setName("세 비 야");
			ctdto.setRecommend("<h2>추천 상품</h2>");
			ctdto.setBig1("스페인 광장 투어");
			ctdto.setBig2("::일출보러 가기::");
			ctdto.setSm1("론다 야경투어");
			ctdto.setSm2("::당일치기로 떠나는 투어::");
			ctdto.setBtn1("/offers/seville_offer1");
			ctdto.setBtn2("/offers/seville_offer2");
			
			session.setAttribute("city", ctdto);
			
			return "cities/city"; 
		}
		
		@GetMapping("/okinawa")
		public String okinawa(HttpSession session){
			logger.info("okinawa 실행");
			CitiesDto ctdto = new CitiesDto();
			ctdto.setImgHead("/resources/img/okinawa_head.jpg");
			ctdto.setImgPackage1("/resources/img/okinawa1.jpg");
			ctdto.setImgPackage2("/resources/img/okinawa2.jpg");
			ctdto.setName("오 키 나 와");
			ctdto.setRecommend("<h2>추천 상품</h2>");
			ctdto.setBig1("츄라우미 수족관");
			ctdto.setBig2("::수족관 투어::");
			ctdto.setSm1("스노쿨링 체험");
			ctdto.setSm2("::산호초 보러가기::");
			ctdto.setBtn1("/offers/okinawa_offer1");
			ctdto.setBtn2("/offers/okinawa_offer2");
			
			session.setAttribute("city", ctdto);
			
			return "cities/city"; 
		}
		
		@GetMapping("/fukuoka")
		public String fukuoka(HttpSession session){
			logger.info("fukuoka 실행");
			CitiesDto ctdto = new CitiesDto();
			ctdto.setImgHead("/resources/img/fukuoka_head.jpg");
			ctdto.setImgPackage1("/resources/img/fukuoka1.jpg");
			ctdto.setImgPackage2("/resources/img/fukuoka2.jpg");
			ctdto.setName("후 쿠 오 카");
			ctdto.setRecommend("<h2>추천 상품</h2>");
			ctdto.setBig1("벳푸 온천체험");
			ctdto.setBig2("::다양한 지옥 온천 체험::");
			ctdto.setSm1("후쿠오카 유후인 관광");
			ctdto.setSm2("::버스 투어::");
			ctdto.setBtn1("/offers/fukuoka_offer1");
			ctdto.setBtn2("/offers/fukuoka_offer2");
			
			session.setAttribute("city", ctdto);
			
			return "cities/city"; 
		}
		
		@GetMapping("/busan")
		public String busan(HttpSession session){
			logger.info("busan 실행");
			CitiesDto ctdto = new CitiesDto();
			ctdto.setImgHead("/resources/img/busan_head.jpg");
			ctdto.setImgPackage1("/resources/img/busan1.jpg");
			ctdto.setImgPackage2("/resources/img/busan2.jpg");
			ctdto.setName("부 산");
			ctdto.setRecommend("<h2>추천 상품</h2>");
			ctdto.setBig1("부산 야경 투어");
			ctdto.setBig2("::야경보러가기::");
			ctdto.setSm1("와우 요트 투어");
			ctdto.setSm2("::요트에서 힐링::");
			ctdto.setBtn1("/offers/busan_offer1");
			ctdto.setBtn2("/offers/busan_offer2");
			
			session.setAttribute("city", ctdto);
			
			return "cities/city"; 
		}
		
		@GetMapping("/sokcho")
		public String sokcho(HttpSession session){
			logger.info("sokcho 실행");
			CitiesDto ctdto = new CitiesDto();
			ctdto.setImgHead("/resources/img/sokcho_head.jpg");
			ctdto.setImgPackage1("/resources/img/sokcho1.jpg");
			ctdto.setImgPackage2("/resources/img/sokcho2.jpg");
			ctdto.setName("속 초");
			ctdto.setRecommend("<h2>추천 상품</h2>");
			ctdto.setBig1("설 악 산");
			ctdto.setBig2("::트래킹하러가기::");
			ctdto.setSm1("요 트");
			ctdto.setSm2("::선 셋 투어::");
			ctdto.setBtn1("/offers/sokcho_offer1");
			ctdto.setBtn2("/offers/sokcho_offer2");
			
			session.setAttribute("city", ctdto);
			
			return "cities/city"; 
		}
		
		

}
