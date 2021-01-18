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
	
	@GetMapping("/seville_offer2")
	public String seville_offer2(Model model) {
		logger.info("세비야 offer2 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("세비야 론다 별밤투어");
		board.setSubtitle("론다의 야경을 보지 못했다면 론다를 봤다고 할 수 없다!!");
		board.setSubcontent("★‘론다는 낮에도 좋은데 밤이 더 좋아’\r\n" + 
				"모든 여행객이 입을 모아 하는 이야기지요.\r\n" + 
				"이 작은 도시에 매년 많은 여행객이 찾는 이유도 론다 특유의 낭만 때문이 아닐까 싶어요." + 
				"하지만 론다에서 세비야 가는 시외버스 막차는 오후 6시 (좌절)" + 
				"론다 야경을 보기에는 불가한 일정이지요. (노을 지는 모습은 뽀나스~!)" + 
				"그렇다면 정답은? 세비야에서 출발하는 론다 별밤 투어!" + 
				"혼자 오시는 손님도 환영합니다." + 
				"혼자 오시는 분들이 많은 투어이며, 함께 여행하며 친해질 수 있어요!");
		board.setInclude("전문 가이드비, 전용 차량비, 로컬가이드비, 무선 수신기 대여비 (개인 이어폰 필수 지참)");
		board.setUninclude("개인 이어폰 지참, 저녁 식사비, 개인음료 및 간식비");
		board.setCourse("론다 시내 투어 : 타호 공원 > 투우장 > 헤밍웨이 산책길 > 론다 전망대 > 누에보다리");
		board.setAddinfo("현장으로 추가는 되지 않습니다! 당일예약도 자리가 있는 경우 가능하니 메시지 주세요!" + 
				"론다는 밤에 많이 춥습니다. 따뜻한 외투를 챙겨 와 주세요. 구글에서 ronda를 검색하면 기온을 확인할 수 있습니다");
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
	
	@GetMapping("/okinawa_offer1")
	public String okinawa_offer1(Model model) {
		logger.info("오키나와 offer1 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("오키나와 : 추라우미 엔조이 패스 (오키나와 추라우미 수족관+공통 11시설 입장)");
		board.setSubtitle("오키나와 본도를 대표하는 관광명소인 오키나와 추라우미 수족관과 그 외 지정된 공통 11시설을 패스 1장으로 즐기실 수 있습니다.");
		board.setSubcontent("[ 이 패스의 매력 포인트! ]" + 
				"- 각 시설의 입장권을 따로따로 구입할 경우와 비교하여 7,290엔이나 저렴하게 이용하실 수 있습니다." + 
				"(만 18세 이상의 성인이 모든 시설에 입장했을 경우)" + 
				"- 엔조이 패스는 교환일로부터 5일간 유효하므로, 여유있게 오키나와 본도 관광을 즐기실 수 있습니다." + 
				"오키나와 추라우미 수족관이 포함되어 있습니다. 그 외의 11곳을 마음대로 즐기실 수 있습니다");
		board.setInclude("- 오키나와 관광지 11곳의 입장");
		board.setUninclude("- 교통비" + 
				"- 시설 내의 유료 입장 시설, 유료 놀이기구 및 음식대금" + 
				"- 기타 개인 지출 비용");
		board.setCourse("오키나와 추라우미 수족관, 다이세키린잔, 고우리 오션타워, 류구조, OKINAWA 후루츠랜드, 나고 파인애플 파크, 네오파크 오키나와, 류큐무라, 무라사쿠무라 체험, 비오스의 언덕, 오키나와 월드 교쿠센도, 오키나와 평화 기념당");
		board.setAddinfo("일정은 상담을 통해 자유롭게 변경 및 조율 가능합니다.");
		model.addAttribute("content",board);
		
		return "offers/content";
		
	}
	
	@GetMapping("/okinawa_offer2")
	public String okinawa_offer2(Model model) {
		logger.info("오키나와 offer2 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("오키나와 게라마 제도 1일 투어 - 스노클링");
		board.setSubtitle("오키나와 제일의 바다라고 불리는 아름다운 게마라제도에서 1일 동안 스노클링 체험하며 즐길 수 있는 인기만점 투어");
		board.setSubcontent("- 산호초가 발달한 국립공원 게라마 제도의 바다는 그야말로 낙원 그 자체의 아름다움으로 가득합니다!" + 
				"- 나하에서 출발하여 오키나와 제일의 바다라고 불리는 아름다운 게마라제도에서 1일 동안 스노클링 체험하며 즐길 수 있는 인기만점 투어입니다." + 
				"- 나하시내의 호텔은 무료로 픽업해 드립니다.(예약시 신청필요)");
		board.setInclude("- 승선료" + 
				"- 가이드요금" + 
				"- 웨트슈트 렌탈요금" + 
				"- 장비 렌탈요금" + 
				"- 미네랄 워터" + 
				"- 목욕타월 렌탈요금(1장)");
		board.setUninclude("- 수영복" + "- 비치샌들");
		board.setCourse("오키나와 추라우미 수족관, 다이세키린잔, 고우리 오션타워, 류구조, OKINAWA 후루츠랜드, 나고 파인애플 파크, 네오파크 오키나와, 류큐무라, 무라사쿠무라 체험, 비오스의 언덕, 오키나와 월드 교쿠센도, 오키나와 평화 기념당");
		board.setAddinfo("일정은 상담을 통해 자유롭게 변경 및 조율 가능합니다.");
		model.addAttribute("content",board);
		
		return "offers/content";
		
	}
}
