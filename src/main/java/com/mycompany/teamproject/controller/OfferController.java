package com.mycompany.teamproject.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.teamproject.dto.Offer;
import com.mycompany.teamproject.dto.OfferBoard;


@Controller
@RequestMapping("/offers")
public class OfferController {
	private static final Logger logger= LoggerFactory.getLogger(OfferController.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return "offers/content";
	}
	
	@GetMapping("/barcelona_offer1")
	public String gotoBoard(Model model) {
		logger.info("바르셀로나 offer1 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("바르셀로나 라발지구 올드바 투어 with 에이쁠투어");
		board.setSubtitle("바르셀로나의 가장 오래된 바에서 한잔 하며 숨겨진 진주 같은 라발지구의 낭만을 함께 즐겨보아요!");
		board.setSubcontent("낯설지만 흥미로운, 다가가기 쉽지 않지만 그만큼 더 매력적인 라발지구에서 저와 함께 한 잔해요!"
				+ "여러 사회적 문제들로 인해 위험한 곳으로 생각되었지만 1990년대 바르셀로나시의 라발지구 개선사업 후 새롭게 변화된 동네에 유니크한 샵들과 트렌디한 레스토랑들이 들어서면서 바르셀로나의 힙한 곳으로 떠오르고 있답니다."
				+ "개성이 넘치는 라발지구의 골목마다 숨겨진 이야기를 들어보세요. 작은 에피소드 하나로 그 거리에 대한 추억을 오랫동안 간직하실 수 있어요."
				+ "다리가 조금 지칠 때쯤 19세기 카탈루냐의 모더니즘 스타일이 그대로 남아 있는 바에서 스페인 사람들처럼 베르뭇 한 잔 해보아요."
				+ "헤밍웨이와 피카소가 자주 들렀던 바르셀로나의 가장 오래된 바에서 그들이 마셨던 압생트를 마셔보아요. 1920년대 예술가들이 카페에 모여 이야기했던 분위기를 즐길 수 있어요."
				+ "친구와 함께 동네 구경을 하는 것 처럼, 오랜만에 만난 친구와 한잔 하는 것처럼 편안하고 즐거운 분위기로 라발지구를 소개해드릴게요.");
		board.setInclude("가이드 비용");
		board.setUninclude("개인 음료와 간단한 스낵");
		board.setCourse("람블라 거리" + "바르셀로나의 중심지인 람블라 거리의 이야기를 해드릴게요.");
		board.setAddinfo("만나는 시간 : 오후 5시");
		model.addAttribute("barcellona",board);
		
		return "offers/barcelona_offer1";
		
	}
}
