package com.mycompany.teamproject.controller;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
	public String barcelona_offer1(Model model) {
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
		model.addAttribute("content",board);
		
		return "offers/content";
		
	}
	
	@GetMapping("/barcelona_offer2")
	public String barcelona_offer2(Model model) {
		logger.info("바르셀로나 offer2 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("바르셀로나: 벨 항구에서 일몰 항해투어");
		board.setSubtitle("낭만적인 시간을 보내고 싶다면 태양으로 붉게 물든 바르셀로나의 바다에서 하루를 마무리해보세요!");
		board.setSubcontent("본 투어는 영어로 진행되며  다국적 여행자들과 함께하는 단체 투어로 진행됩니다."
				+ "소규모 그룹으로 진행되어 개인적인 서비스를 제공해드려요."
				+ "무료 음료, 간식을 제공합니다."
				+ "커플들에게 로맨틱한 여행을 선사해드립니다."
				+ "구시가지 항구(Old Harbour)로 잘 알려져 있는 포트벨(Port Vell)에서 전문 선장을 만나 특별한 항해를 경험해보세요! 배를 타고 바르셀로나의 고급 요트가 정박된 아름다운 항구 선착장을 지나가며 투어를 시작합니다!."
				+ "우선 보안사항을 검토 받고 보트 여행 일정에 대한 설명을 듣게 됩니다. 이후 2시간 동안 항구와 바르셀로나의 해안을 항해하며 여행 일정에 따라 올림픽 항구, 이카리아 해변 및 도시의 대성당과 같은 도시의 주요 명소들을 보실 수 있답니다."
				+ "붉게 지는 태양 아래 멋진 경관을 감상하고 음료를 마시며 하루를 마무리해보세요. 친구나 가족과 함께 특별한 순간을 사진으로 남기는 것도 잊지 마세요! 투어가 끝나면 포트벨로 다시 돌아갑니다.");
		board.setInclude("- 전문 선장이 운항하는 2시간의 항해 여행"
				+ "- 간식,음료수"
				+ "- 스패니쉬 기타연주");
		board.setUninclude("- 호텔 픽업 및 샌딩"
				+ "- 기타 음식 및 음료");
		board.setCourse("바르셀로나 포트벨 일몰항해투어" + "붉게 물든 바다 위에서 바르셀로나의 석양을 즐겨 보세요!");
		board.setAddinfo("만나는 시간 : 예약시 선택한 날짜에 따라 만나는 시간이 상이합니다.");
		model.addAttribute("content",board);
		
		return "offers/content";
		
	}
	
	@GetMapping("/seville_offer1")
	public String seville_offer1(Model model) {
		logger.info("세비야 offer1 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("스페인광장부터 대성당까지 한번에 둘러보는 워킹투어");
		board.setSubtitle("600개가 넘는 후기로 검증된 세비야 대표투어! 이제 대성당까지 함께 입장합니다");
		board.setSubcontent("본 투어는 영어로 진행되며  다국적 여행자들과 함께하는 단체 투어로 진행됩니다."
				+ "소규모 그룹으로 진행되어 개인적인 서비스를 제공해드려요."
				+ "무료 음료, 간식을 제공합니다."
				+ "커플들에게 로맨틱한 여행을 선사해드립니다."
				+ "구시가지 항구(Old Harbour)로 잘 알려져 있는 포트벨(Port Vell)에서 전문 선장을 만나 특별한 항해를 경험해보세요! 배를 타고 바르셀로나의 고급 요트가 정박된 아름다운 항구 선착장을 지나가며 투어를 시작합니다!."
				+ "우선 보안사항을 검토 받고 보트 여행 일정에 대한 설명을 듣게 됩니다. 이후 2시간 동안 항구와 바르셀로나의 해안을 항해하며 여행 일정에 따라 올림픽 항구, 이카리아 해변 및 도시의 대성당과 같은 도시의 주요 명소들을 보실 수 있답니다."
				+ "붉게 지는 태양 아래 멋진 경관을 감상하고 음료를 마시며 하루를 마무리해보세요. 친구나 가족과 함께 특별한 순간을 사진으로 남기는 것도 잊지 마세요! 투어가 끝나면 포트벨로 다시 돌아갑니다.");
		board.setInclude("1. 가이드 비용 (현지인 공인 가이드 비용 포함)"+"2.무선 수신기 대여료");
		board.setUninclude("1. 대성당 입장료" + 
				"- 성인 : 10유로" + 
				"- 학생 (국제학생증 소지, 만 25세 이하) : 5유로" + 
				"- 경로 (여권 소지, 만 65세 이상) : 5유로" + 
				"- 어린이 (여권 소지, 만 14세 이하) : 무료" + 
				"- 개별 구매한 입장권 사용 가능");
		board.setCourse("거대한 역사 교과서, 스페인 광장" + "스페인의 거대한 역사 교과서라 불릴 만큼, 스페인 역사에 대한 방대한 이야기를 품고 있는 곳입니다." + 
				"처음에는 웅장하고 화려한 외관에 감동하고, 알면 알수록 스페인 사람들의 섬세함에 감탄하게 됩니다");
		board.setAddinfo("만나는 시간 : 스페인 광장 오전 8시 30분");
		model.addAttribute("content",board);
		
		return "offers/content";
		
	}
	
	
	@GetMapping("/busan_offer1")
	public String busan_offer1(Model model) {
		logger.info("부산 offer1 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("멋진 부산의 야경구경 & 인생사진 남기기");
		board.setSubtitle("부산에서 인생사진 남기기");
		board.setSubcontent("출발하기전 사진 찍는 방법을 먼저 안내드릴 거예요." + 
				"날씨가 좋은 날에는 배수지 전망대에서 부산의 모든 야경을 보여드릴거에요." + 
				"또 별이 보이는 날에는 별자리를 알려드릴 거구요." + 
				"휴대폰으로 이쁜 야경사진을 찍는 방법도 안내드릴 거예요." + 
				"멋진 음악이 준비되며, 함께 한다면 홍콩보다 더 아름다운 부산의 야경을 즐길 수 있어요."
				+ "부산의 야경을 배경으로 배수지 전망대에서 조명과 카메라를 설치하면 바로 그곳이" + 
				"야외스튜디오가 됩니다. 부산 야경을 배경으로 인생사진을 같이 찍어봐요~" + 
				"물론 전망대는 부산 사람도 잘 모르는 곳이랍니다~"+ 
				"2~3시간 정도 소요되며, 촬영한 사진은 메일 또는 메신저로 전송해 드립니다!" +  
				"투어 종료 후 숙소까지 모셔다 드릴 거예요~" + 
				"예쁜 사진을 찍기 위해서는 무조건 밝은 계열의 옷을 입고 오셔야 합니다!!");
		board.setInclude("사진촬영" + 
				"투어 가이드" + 
				"숙소 샌딩");
		board.setUninclude("개인 경비");
		board.setCourse("숨겨진 부산의 야경명소를 소개합니다!" + 
				"부산에서의 야경이 가장 아름다운 장소로 갈 거예요" + 
				"부산사람도 잘 모르는 야경 장소인 배수지 전망대로 출발합니다." + 
				"전망대에서는 부산항이 잘보이는 곳으로 갑니다." + 
				"전망대에는 사람이 많이 없어 사진 찍기가 엄청 편하답니다~");
		board.setAddinfo("만나는 시간 : 기본 오후 9시 30분에 진행하나, 예약 시 문의주시면 조율 도와드리겠습니다.");
		model.addAttribute("content",board);
		
		return "offers/content";
		
	}
	
	@GetMapping("/busan_offer2")
	public String busan_offer2(Model model) {
		logger.info("부산 offer2 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("해운대: 와우 요트투어");
		board.setSubtitle("부산 중심에 위치한 와우요트가 고객님들께 아름다운 낭만과 잊지못할 추억을 선사합니다.");
		board.setSubcontent("별도의 사전 예약 없이 이용하시는 경우 만석으로 이용이 어려울 수 있으니 업체에 사전 유선 예약 진행 필요합니다."
				+ "명품브랜드 Lagoon 카타마란 요트를 타고 해운대 광안리 요트 투어를 즐기자!"
				+ "무료 음료, 간식을 제공합니다.");
		board.setInclude("투어 시 간단한 스낵, 음료, 맥주, 멀미약 등은 무료로 제공됩니다.");
		board.setUninclude("구매 옵션별 포함사항 제외한 일체");
		board.setCourse("수영만 요트경기장 -> 마린시티 ->누리마루 ->광안대교 -> 광안리 해수욕장 -> 수영만 요트경기장" + 
				"사람들이 가장 좋아하는 추천운항코스를 단독으로 자유롭게 변경가능한 요트투어입니다.");
		board.setAddinfo("일정은 상담을 통해 자유롭게 변경 및 조율 가능합니다."
				+ "주간투어 [13:00] [14:00] [15:00] [16:00] [17:00]"
				+ "야간투어 [18:00] [19:00] [20:00] [21:00] [22:00]");
		model.addAttribute("content",board);
		
		return "offers/content";
		
	}
}
