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
	private static final Logger logger = LoggerFactory.getLogger(OfferController.class);

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
		board.setTitle("<h1><바르셀로나> 라발지구 올드바 투어 ");
		board.setPrice("<h4>가격 : 42000원부터");
		board.setImg("/resources/img/barcelona1.jpg ");
		board.setImg2("/resources/img/barcelona_bar.jpg ");
		board.setSubtitle("<h3>바르셀로나의 가장 오래된 바에서 한잔 하며 숨겨진 진주 같은 라발지구의 낭만을 함께 즐겨보아요!</h3>");
		board.setSubcontent("<p>낯설지만 흥미로운, 다가가기 쉽지 않지만 그만큼 더 매력적인 라발지구에서 저와 함께 한 잔해요!</p>"
				+ "<p>여러 사회적 문제들로 인해 위험한 곳으로 생각되었지만 1990년대 바르셀로나시의 라발지구 개선사업 후 새롭게 변화된 동네에 유니크한 샵들과 트렌디한 레스토랑들이 들어서면서 바르셀로나의 힙한 곳으로 떠오르고 있답니다.</p>"
				+ "<p>개성이 넘치는 라발지구의 골목마다 숨겨진 이야기를 들어보세요. 작은 에피소드 하나로 그 거리에 대한 추억을 오랫동안 간직하실 수 있어요.</p>"
				+ "<p>다리가 조금 지칠 때쯤 19세기 카탈루냐의 모더니즘 스타일이 그대로 남아 있는 바에서 스페인 사람들처럼 베르뭇 한 잔 해보아요.</p>"
				+ "<p>헤밍웨이와 피카소가 자주 들렀던 바르셀로나의 가장 오래된 바에서 그들이 마셨던 압생트를 마셔보아요. 1920년대 예술가들이 카페에 모여 이야기했던 분위기를 즐길 수 있어요.</p>"
				+ "<p>친구와 함께 동네 구경을 하는 것 처럼, 오랜만에 만난 친구와 한잔 하는 것처럼 편안하고 즐거운 분위기로 라발지구를 소개해드릴게요.</p>");
		board.setInclude("<li>가이드 비용</li>");
		board.setUninclude(
				"<li>개인 음료와 간단한 스낵</li><li>가이드 음료</li><li>베르뭇, 맥주, 와인과 같은 음료는 1.5~2.5 유로입니다.</li><li>압생트는 5유로 입니다.</li><li>그룹으로 함께 먹은 안주는 N분의 1로 계산합니다.</li>");
		board.setCourse(
				"<ol><li>람블라 거리</li><li>바르셀로나 현대 미술관</li><li>까사 알미라이</li><li>산타 크레우 병원</li><li>보테로 고양이</li><li>바 마르세야</li></ol>");
		board.setContacttime("<p>오후 5시</p>");
		board.setContactplace("<p>카탈루냐 광장 맞은편 하바나</p>");
		model.addAttribute("content", board);

		return "offers/content";

	}

	@GetMapping("/barcelona_offer2")
	public String barcelona_offer2(Model model) {
		logger.info("바르셀로나 offer2 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("<h1><바르셀로나> 벨 항구에서 일몰 항해투어<h1>");
		board.setPrice("<h4>가격 : 50000원부터");
		board.setImg("/resources/img/spain_sunset.jpg ");
		board.setImg2("/resources/img/spain_sunset2.jpg ");
		board.setSubtitle("<h3>낭만적인 시간을 보내고 싶다면 태양으로 붉게 물든 바르셀로나의 바다에서 하루를 마무리해보세요!</h3>");
		board.setSubcontent("<p>본 투어는 영어로 진행되며  다국적 여행자들과 함께하는 단체 투어로 진행됩니다.</p>"
				+ "<p>소규모 그룹으로 진행되어 개인적인 서비스를 제공해드려요.</p>" + "<p>무료 음료, 간식을 제공합니다.</p>"
				+ "<p>커플들에게 로맨틱한 여행을 선사해드립니다.</p>"
				+ "<p>구시가지 항구(Old Harbour)로 잘 알려져 있는 포트벨(Port Vell)에서 전문 선장을 만나 특별한 항해를 경험해보세요! 배를 타고 바르셀로나의 고급 요트가 정박된 아름다운 항구 선착장을 지나가며 투어를 시작합니다!.</p>"
				+ "<p>우선 보안사항을 검토 받고 보트 여행 일정에 대한 설명을 듣게 됩니다. 이후 2시간 동안 항구와 바르셀로나의 해안을 항해하며 여행 일정에 따라 올림픽 항구, 이카리아 해변 및 도시의 대성당과 같은 도시의 주요 명소들을 보실 수 있답니다.</p>"
				+ "<p>붉게 지는 태양 아래 멋진 경관을 감상하고 음료를 마시며 하루를 마무리해보세요. 친구나 가족과 함께 특별한 순간을 사진으로 남기는 것도 잊지 마세요! 투어가 끝나면 포트벨로 다시 돌아갑니다.</p>");
		board.setInclude("<li>전문 선장이 운항하는 2시간의 항해 여행</li>" + "<li>간식,음료수</li>" + "<li>스패니쉬 기타연주</li>");
		board.setUninclude("<li>호텔 픽업 및 샌딩</li>" + "<li>기타 음식 및 음료</li>");
		board.setCourse("<p>바르셀로나 포트벨 일몰항해투어 : 붉게 물든 바다 위에서 바르셀로나의 석양을 즐겨 보세요!</p>");
		board.setAddinfo("<p>- 여행확인증이 아닌, 영어로 된 바우처를 지참하셔야 합니다.</p>" + "<p>- 바우처 형태 : 모바일 제시 / 출력본 제시</p>"
				+ "<p>- 투어 전, 업체로부터 예약 확인 관련한 이메일을 확인해주셔야 합니다.</p>"
				+ "<p>- 상품페이지와 바우처 상의 정보가 다를 경우, 반드시 바우처 상의 정보를 확인 부탁드립니다.</p>"
				+ "<p>- 투어 당일 문제 발생 시에는 반드시 바우처 상의 업체 연락처로 연락해주셔야 합니다.</p>"
				+ "<p>- 성인 2명 이상이 투어를 신청하셨을 경우에만 어린이도 이용가능합니다.</p>"
				+ "<p>- 당일 현지 상황에 따라 투어내용이 변경/조정 될 수 있습니다. 상품페이지와 다른 내용으로 진행되었을 경우 마이리얼트립으로 연락 부탁드립니다.</p>");
		board.setContacttime("<p>예약시 선택한 날짜에 따라 만나는 시간이 상이합니다.</p>");
		board.setContactplace("<p>원 오션 클럽</p>");
		model.addAttribute("content", board);

		return "offers/content";

	}

	@GetMapping("/seville_offer1")
	public String seville_offer1(Model model) {
		logger.info("세비야 offer1 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("<h1>스페인광장부터 대성당까지 한번에 둘러보는 워킹투어</h1>");
		board.setPrice("<h4>가격 : 30000원부터</h4>");
		board.setImg("/resources/img/seville_gwangjang.jpg");
		board.setImg2("/resources/img/seville_gwangjang2.jpg");
		board.setSubtitle("<h3>600개가 넘는 후기로 검증된 세비야 대표투어! 이제 대성당까지 함께 입장합니다</h3>");
		board.setSubcontent("<p>스페인 광장부터 세비야 대성당 내부까지!" + "<p>세비야의 주요 명소를 명쾌한 해설과 함께 둘러보는 시간!"
				+ "<p>저희와 함께 세비야의 매력에 푹 빠져보세요!" + "<p>탄탄한 구성! 단 한 번의 투어로 세비야 주요 명소를 알차게 만나보세요."
				+ "<p>알록달록 예쁜 건물, 거리를 수놓은 오렌지 나무,파란 하늘과 깨끗한 공기, 친절하고 밝은 사람들..."
				+ "<p>세비야는 누가 봐도 예쁘고 사랑스러운 도시임에 틀림없습니다. 하지만 그저 화려한 겉모습만 보고 가기에는 너무 아쉬울 정도로, 세비야는 흥미로운 이야기로 가득 차있습니다."
				+ "<p>로마 제국부터 시작된 세비야의 전성기는 이슬람 지배기를 거치며 문화적, 예술적으로 무르익고, 대항해시대를 통해 그 화려한 꽃을 피웠습니다."
				+ "<p>수세기를 넘나드는 시간 여행 속에서 세비야, 그리고 스페인의 역사가 깔끔히 정리되는 상쾌한 기분을 맛보세요. 세비야에서 탄생한 오페라의 음악과 스토리를 들으며 감성을 충전하고, 거장들의 그림을 통해 세비야에 가득 찬 예술혼 또한 느끼게 해 드릴게요!"
				+ "<p>단 한 번의 투어를 통해 세비야 필수 명소를 제대로 만나보세요. 투어 후에는 분명 세비야가 '다르게' 보일 거에요 :)"
				+ "<p>본 투어는 총 3부 19가지 테마로 구성되어 있습니다. 재밌게 쓰인 책 한 권을 읽는다는 마음으로 오시면 됩니다.");
		board.setInclude("<li>가이드 비용 (현지인 공인 가이드 비용 포함)" + "<li>무선 수신기 대여료");
		board.setUninclude("대성당 입장료" + "<li>성인 : 10유로" + "<li>학생 (국제학생증 소지, 만 25세 이하) : 5유로"
				+ "<li>경로 (여권 소지, 만 65세 이상) : 5유로" + "<li>어린이 (여권 소지, 만 14세 이하) : 무료" + "<li>개별 구매한 입장권 사용 가능");
		board.setCourse("<p>거대한 역사 교과서, 스페인 광장" + "<p>스페인의 거대한 역사 교과서라 불릴 만큼, 스페인 역사에 대한 방대한 이야기를 품고 있는 곳입니다."
				+ "<p>처음에는 웅장하고 화려한 외관에 감동하고, 알면 알수록 스페인 사람들의 섬세함에 감탄하게 됩니다");
		board.setAddinfo("<p>- 투어 공지 및 세부 안내 사항은 마이리얼트립 메시지를 통해 전달됩니다. 메시지를 꼭 확인해 주세요."
				+ "<p>- 수신기 사용을 위한 이어폰은 꼭 지참해 주세요." + "<p>- 약속시간을 지켜 주세요. 늦으시면 기다려 드릴 수 없습니다."
				+ "<p>- 핫팬츠, 민소매, 모자, 슬리퍼 등의 옷차림은 대성당 입장이 제한될 수 있습니다.");
		board.setContacttime("<p>오전 8시 30분</p>");
		board.setContactplace("<p>스페인 광장, 중앙분수</p>");
		model.addAttribute("content", board);

		return "offers/content";

	}

	@GetMapping("/seville_offer2")
	public String seville_offer2(Model model) {
		logger.info("세비야 offer2 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("<h1>세비야 론다 별밤투어");
		board.setPrice("<h4>가격 : 30000원부터</h4>");
		board.setImg("/resources/img/seville_ronda.jpg");
		board.setImg2("/resources/img/seville_ronda2.jpg");
		board.setSubtitle("<h3>론다의 야경을 보지 못했다면 론다를 봤다고 할 수 없다!!");
		board.setSubcontent("<p>★‘론다는 낮에도 좋은데 밤이 더 좋아’" + "<p>모든 여행객이 입을 모아 하는 이야기지요."
				+ "<p>이 작은 도시에 매년 많은 여행객이 찾는 이유도 론다 특유의 낭만 때문이 아닐까 싶어요." + "<p>하지만 론다에서 세비야 가는 시외버스 막차는 오후 6시 (좌절)"
				+ "<p>론다 야경을 보기에는 불가한 일정이지요. (노을 지는 모습은 뽀나스~!)" + "<p>그렇다면 정답은? 세비야에서 출발하는 론다 별밤 투어!"
				+ "<p>혼자 오시는 손님도 환영합니다." + "<p>혼자 오시는 분들이 많은 투어이며, 함께 여행하며 친해질 수 있어요!");
		board.setInclude("<li>전문 가이드비" + "<li>전용 차량비" + "<li>로컬가이드비" + "<li>무선 수신기 대여비 (개인 이어폰 필수 지참)");
		board.setUninclude("<li>개인 이어폰 지참" + "<li>저녁 식사비" + "<li>개인음료 및 간식비");
		board.setCourse("<p>론다 시내 투어 : 타호 공원 > 투우장 > 헤밍웨이 산책길 > 론다 전망대 > 누에보다리");
		board.setAddinfo("<p>현장으로 추가는 되지 않습니다! 당일예약도 자리가 있는 경우 가능하니 메시지 주세요!"
				+ "<p>론다는 밤에 많이 춥습니다. 따뜻한 외투를 챙겨 와 주세요. 구글에서 ronda를 검색하면 기온을 확인할 수 있습니다");
		board.setContacttime("<p>예약시 선택한 날짜에 따라 만나는 시간이 상이합니다.</p>");
		board.setContactplace("<p>원 오션 클럽</p>");
		model.addAttribute("content", board);

		return "offers/content";

	}

	@GetMapping("/busan_offer1")
	public String busan_offer1(Model model) {
		logger.info("부산 offer1 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setTitle("<h1>멋진 부산의 야경구경 & 인생사진 남기기");
		board.setPrice("<h4>가격 : 30000원부터</h4>");
		board.setImg("/resources/img/busan_yabam.jpg");
		board.setImg2("/resources/img/busan_yabam2.jpg");
		board.setSubtitle("<h3>부산에서 인생사진 남기기");
		board.setSubcontent("<p>출발하기전 사진 찍는 방법을 먼저 안내드릴 거예요." + "<p>날씨가 좋은 날에는 배수지 전망대에서 부산의 모든 야경을 보여드릴거에요."
				+ "<p>또 별이 보이는 날에는 별자리를 알려드릴 거구요." + "<p>휴대폰으로 이쁜 야경사진을 찍는 방법도 안내드릴 거예요."
				+ "<p>멋진 음악이 준비되며, 함께 한다면 홍콩보다 더 아름다운 부산의 야경을 즐길 수 있어요."
				+ "<p>부산의 야경을 배경으로 배수지 전망대에서 조명과 카메라를 설치하면 바로 그곳이 야외스튜디오가 됩니다. 부산 야경을 배경으로 인생사진을 같이 찍어봐요~ 물론 전망대는 부산 사람도 잘 모르는 곳이랍니다~"
				+ "<p>2~3시간 정도 소요되며, 촬영한 사진은 메일 또는 메신저로 전송해 드립니다!" + "<p>투어 종료 후 숙소까지 모셔다 드릴 거예요~"
				+ "<p>예쁜 사진을 찍기 위해서는 무조건 밝은 계열의 옷을 입고 오셔야 합니다!!");
		board.setInclude("<li>사진촬영" + "<li>투어 가이드" + "<li>숙소 샌딩");
		board.setUninclude("<li>개인 경비");
		board.setCourse(
				"<p>숨겨진 부산의 야경명소를 소개합니다!" + "<p>부산에서의 야경이 가장 아름다운 장소로 갈 거예요" + "<p>부산사람도 잘 모르는 야경 장소인 배수지 전망대로 출발합니다."
						+ "<p>전망대에서는 부산항이 잘보이는 곳으로 갑니다." + "<p>전망대에는 사람이 많이 없어 사진 찍기가 엄청 편하답니다~");
		board.setAddinfo("<p>최대 승차인원은 4인입니다." + "<p>필요 시 여행자보험에 가입 후 참여하실 것을 권장합니다." + "<p>1인만 예약해도 투어 진행이 가능합니다");
		board.setContacttime("<p>기본 오후 9시 30분에 진행하나, 예약 시 문의주시면 조율 도와드리겠습니다.</p>");
		board.setContactplace("<p>부산 서면 OR 부산진역");
		model.addAttribute("content", board);

		return "offers/content";

	}

	@GetMapping("/busan_offer2")
	public String busan_offer2(Model model) {
		logger.info("부산 offer2 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setPrice("<h4>가격 : 75000원부터</h4>");
		board.setTitle("<h1>해운대: 와우 요트투어");
		board.setImg("/resources/img/busan_yort.jpg");
		board.setImg2("/resources/img/busan_yort2.jpg");
		board.setSubtitle("<h3>부산 중심에 위치한 와우요트가 고객님들께 아름다운 낭만과 잊지못할 추억을 선사합니다.");
		board.setSubcontent("<p>별도의 사전 예약 없이 이용하시는 경우 만석으로 이용이 어려울 수 있으니 업체에 사전 유선 예약 진행 필요합니다."
				+ "<p>명품브랜드 Lagoon 카타마란 요트를 타고 해운대 광안리 요트 투어를 즐기자!" + "<p>무료 음료, 간식을 제공합니다.");
		board.setInclude("<li>투어 시 간단한 스낵, 음료, 맥주, 멀미약 등은 무료로 제공됩니다.");
		board.setUninclude("<li>구매 옵션별 포함사항 제외한 일체");
		board.setCourse("<p>수영만 요트경기장 -> 마린시티 ->누리마루 ->광안대교 -> 광안리 해수욕장 -> 수영만 요트경기장"
				+ "사람들이 가장 좋아하는 추천운항코스를 단독으로 자유롭게 변경가능한 요트투어입니다.");
		board.setAddinfo("");
		board.setContacttime("<p>일정은 상담을 통해 자유롭게 변경 및 조율 가능합니다." + "<p>주간투어 : [13:00] [14:00] [15:00] [16:00] [17:00]\""
				+ "<p>야간투어 : [18:00] [19:00] [20:00] [21:00] [22:00]");
		board.setContactplace("<p>부산광역시 해운대구 우동 해운대해변로 84 요트경기장 본관 1층 110호</p>");
		model.addAttribute("content", board);

		return "offers/content";

	}

	@GetMapping("/okinawa_offer1")
	public String okinawa_offer1(Model model) {
		logger.info("오키나와 offer1 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setPrice("<h4>가격 : 33000원부터</h4>");
		board.setTitle("<h1>오키나와 : 추라우미 엔조이 패스 (오키나와 추라우미 수족관+공통 11시설 입장)");
		board.setImg("/resources/img/okinawa1.jpg ");
		board.setImg2("/resources/img/okinawa_sujok.jpg ");
		board.setSubtitle("<h3>오키나와 본도를 대표하는 관광명소인 오키나와 추라우미 수족관과 그 외 지정된 공통 11시설을 패스 1장으로 즐기실 수 있습니다.</h3>");
		board.setSubcontent("<p>[ 이 패스의 매력 포인트! ]"
				+ "<p>- 각 시설의 입장권을 따로따로 구입할 경우와 비교하여 7,290엔이나 저렴하게 이용하실 수 있습니다.(만 18세 이상의 성인이 모든 시설에 입장했을 경우)"
				+ "<p>- 엔조이 패스는 교환일로부터 5일간 유효하므로, 여유있게 오키나와 본도 관광을 즐기실 수 있습니다."
				+ "<p> 오키나와 추라우미 수족관이 포함되어 있습니다. 그 외의 11곳을 마음대로 즐기실 수 있습니다");
		board.setInclude("<li>오키나와 관광지 11곳의 입장");
		board.setUninclude("<li>교통비" + "<li>시설 내의 유료 입장 시설, 유료 놀이기구 및 음식대금" + "<li>기타 개인 지출 비용");
		board.setCourse(
				"<ol><li>오키나와 추라우미 수족관 <li>다이세키린잔 <li> 고우리 오션타워<li> 류구조<li> OKINAWA 후루츠랜드<li> 나고 파인애플 파크<li> 네오파크 오키나와<li> 류큐무라<li> 무라사쿠무라 체험<li> 비오스의 언덕<li> 오키나와 월드 교쿠센도<li> 오키나와 평화 기념당");
		board.setAddinfo("<p>이용일 1일 전 취소 및 환불은 무료로 가능합니다." + "<p>- 이용일 당일에 취소 및 환불은 불가합니다."
				+ "<p>- 이용하실 비행기가 결항된 경우, 그 내용을 투어 출발 전까지 연락해 주시기바랍니다. 또한, 환불로 진행될 가능성이 있으므로, 결항증명서를 예약하신 판매점에 제출해 주시기 바랍니다. 이후, 환불여부에 대해 회답을 드립니다.");
		board.setContacttime("<p>일정은 상담을 통해 자유롭게 변경 및 조율 가능합니다.");
		board.setContactplace("<p>오키나와 나하 공항 영업소</p>");
		model.addAttribute("content", board);

		return "offers/content";

	}

	@GetMapping("/okinawa_offer2")
	public String okinawa_offer2(Model model) {
		logger.info("오키나와 offer2 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setPrice("<h4>가격 : 85000원부터</h4>");
		board.setTitle("<h1>오키나와 게라마 제도 1일 투어 - 스노클링");
		board.setImg("/resources/img/okinawa_gerema.jpg ");
		board.setImg2("/resources/img/okinawa_gerema2.jpg ");
		board.setSubtitle("<h3>오키나와 제일의 바다라고 불리는 아름다운 게마라제도에서 1일 동안 스노클링 체험하며 즐길 수 있는 인기만점 투어");
		board.setSubcontent("<p>- 산호초가 발달한 국립공원 게라마 제도의 바다는 그야말로 낙원 그 자체의 아름다움으로 가득합니다!"
				+ "<p>- 나하에서 출발하여 오키나와 제일의 바다라고 불리는 아름다운 게마라제도에서 1일 동안 스노클링 체험하며 즐길 수 있는 인기만점 투어입니다."
				+ "<p>- 나하시내의 호텔은 무료로 픽업해 드립니다.(예약시 신청필요)"
				+ "<p>참가 조건은 6세 이상으로 건강에 문제가 없는 고객입니다. 5세 이하의 아동, 간질, 과호흡 증후군, 임산부는 안정상의 이유로 참가하실 수 없으므로 이점 양해해 바랍니다.");
		board.setInclude(
				"<li>승선료" + "<li>가이드요금" + "<li>웨트슈트 렌탈요금" + "<li>장비 렌탈요금" + "<li>미네랄 워터" + "<li>목욕타월 렌탈요금(1장)");
		board.setUninclude("<li>수영복" + "<li>비치샌들");
		board.setCourse("<h5>오키나와 게라마 제도 1일 투어</h5>" + "<p>07:30-08:00 고객께서 지정하신 나하 시내 호텔로 픽업(예약 시에 선택한 호텔)" +

				"<p>08:00-09:00 마린하우스 시사 나하점 접수" +

				"<p>09:00 게라마 제도로 출항" +

				"<p>10:30 스노클링" +

				"<p>12:30 런치 타임" +

				"<p>14:00 스노클링" +

				"<p>15:00 나하로 이동" +

				"<p>16:00-16:30 항구 도착 후, 픽업했던 호텔로 샌딩/해산");
		board.setAddinfo("<p>- 수영복과 비치샌들을 지참해 주십시오. 보트내의 탈의실에서 수영복으로 갈아 입을 수 있습니다."
				+ "<p>- 또한, 수영복과 비치샌들 등의 판매와 대여는 없습니다." + "<p>- 베지테리언식을 희망하시는 고객은 예약시에 신청해 주세요."
				+ "<p>- 날씨로 인해 배가 흔들리는 경우가 있습니다. 참가하시기 불안한 고객은 예약전에 마린하우스 시사로 연락하여 상담해 주세요."
				+ "<p>- 우천시에도 결행합니다. 다만, 태풍 등의 날씨로 인해 당일 중지되는 경우 및 개시시간이 변경되는 경우가 있습니다.");
		board.setContacttime("<p>07:30~08:00사이에 나하 시내의 고객 지정 호텔로 픽업이 진행됩니다</p>");
		board.setContactplace("<p>숙소에서 픽업해드립니다.</p>");
		model.addAttribute("content", board);

		return "offers/content";
	}

	@GetMapping("/newyork_offer1")
	public String newyork_offer1(Model model) {
		logger.info("뉴욕 offer1 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setPrice("<h4>가격 : 69000원부터</h4>");
		board.setTitle("<h1>뉴욕 메트로폴리탄 미술관 - 서양미술사 공부하는 미술관 투어");
		board.setImg("/resources/img/newyork_museum.jpg ");
		board.setImg2("/resources/img/newyork_museum2.jpg ");
		board.setSubtitle("<h3>그리스로마-중세-고전-근대의 흐름으로 이어지는 대화 중심의 미술사 투어");
		board.setSubcontent(
				"<p>메트로폴리탄 미술관은 전 세계에서 4번째로 큰 미술관이며, 서양미술사의 역사 순서대로 정리가 잘 되어있다는 장점이 있습니다. <p>그리고 미국이라는 나라가 근대에 발전한 나라이기 때문에 고전 시대의 걸작은 적은 편이지만, 마네, 모네, 고흐, 고갱, 세잔과 같은 근대 화가의 작품이 많은 편입니다."
						+ "<p>이 MET의 장점을 살려서 관람하는 것은, 우선 미술사의 순서대로 관람하는 것을 기본으로 하고 <p>그리고 인상주의 이후의 근대 미술에 대한 강의를 따로 짧게라도 듣고 나서 근대 미술을 관람하는 것이라고 생각합니다."
						+ "<p>가이드는 주로 대화 위주의 형식으로 진행할 계획입니다. 그리고 가이드가 끝나면 자유롭게 관람하시면 됩니다.");
		board.setInclude("<li>입장료는 포함 되어 있습니다.");
		board.setUninclude("<li>각종 개인 경비");
		board.setCourse("<p>1 그리스로마 미술" + "<p>2 중세 미술" + "<p>3 카페나 편안한 곳에 앉에서 인상주의 이후 근대미술에 대한 강의가 30분 정도 진행됩니다"
				+ "<p>4 고전미술(유러피안 페인팅European Paintings)" + "<p>5 근대미술" + "<p>6 모더니즘 페인팅 이후 미니멀리즘");
		board.setAddinfo("<p>-메트로폴리탄 미술관은 기본적으로 음식물, 음료수 반입 금지입니다. 중간에 휴식겸 강의 진행할 때 구내 까페에서 진행할 예정입니다."
				+ "<p>-자녀와 동행하는 경우, 최소 중학교 3학년 이상은 되어야 강의를 이해할 수 있을 것으로 생각 됩니다."
				+ "<p>-3시간동안 걷는다는 것은 생각보다 체력소모가 큽니다. 가급적 무거운 가방을 들고 미술관 관람을 하시는 것은 피하시기를 권장합니다."
				+ "<p>-인원은 3인 이하로 진행 되고, 두팀일 경우 4명이하로 진행합니다. 1명일 경우 취소될 수도 있습니다." + "<p>-미술관 투어는 기상에 상관 없이 진행합니다."
				+ "<p>-원하시는 경우 마지막에 현대미술 파트도 짦게 가이드 해 드릴 수 있습니다.");
		board.setContacttime(
				"<p>월요일은 아침 12시, 금요일 토요일은 2시반에서 3시사이에 진행하겠습니다.<p>(예약하실때 따로 문의하시면 시간 조정은 가능합니다만 금,토는 기본적으로 2시반 이후에 진행 가능합니다)");
		board.setContactplace("<p>Metropolitan Museum of Art 미술관 앞</p>");
		model.addAttribute("content", board);

		return "offers/content";
	}

	@GetMapping("/newyork_offer2")
	public String newyork_offer2(Model model) {
		logger.info("뉴욕 offer2 실행");
		OfferBoard board = new OfferBoard();
		board.setWriter("작성자");
		board.setPrice("<h4>가격 : 54100원부터</h4>");
		board.setTitle("<h1>뉴욕: 자유의 여신상 & 엘리스섬 가이드투어");
		board.setImg("/resources/img/newyork_liberty.jpg ");
		board.setImg2("/resources/img/newyork_liberty2.jpg ");
		board.setSubtitle("<h3>뉴욕 필수 코스! 페리를 타고 자유의여신상과 엘리스섬을 방문해보세요.");
		board.setSubcontent("<p>[ 이 투어의 매력 포인트! ]" + 
				"<p>- 유익하고, 친절하며, 전문적인 설명을 들으실 수 있어요." + 
				"<p>- 티켓 하나에 모든 입장료가 포함되어 있습니다." + 
				"<p>- 페리 위에서 자유의 여신상의 실물을 직접 눈으로 담아보세요!"+
				"<p>맨해튼 배터리 파크에 있는 캐슬 클린턴에서 가이드를 만나 리버티 섬으로 가는 페리에 타 투어를 시작해볼까요? 자유의 여신상에 관한 역사적 사실들을 더 즐겨보세요. 전 세계 사람들에게 자유의 여신상이 의미하는 바를 알 수 있답니다." + 		 
				"<p>리버티 섬에서 내려 뉴욕의 스카이라인을 감상하고 가이드의 투어에 따라 주변을 탐험해보세요. 자유의 여신상 받침대까지 관람하실 수 있는 입장료가 티켓에 포함되어있으니 상징적인 명소의 건축물과 건축양식이 전시된 박물관들을 놓치지 말고 꼭 구경해보세요!" + 
				"<p>그 다음 페리를 타고 엘리스 섬으로 넘어가 가이드를 통해 미국의 공식통로에 대한 역사적인 정보들을 들으실 수 있답니다." +  
				"<p>도착하자마자 잠시 주변을 둘러보고 엘리스 섬 이민 박물관을 관람합니다. 어떻게 미국사람들이 자신들의 조상을 찾을 수 있었을까에 대한 궁금증이 생긴다면 복원된 그레이트 홀 안에서 1892년 개장한 이래 1954년에 폐쇄 될 때까지 1,200만 명이 넘는 이민자를 처리한 전 연방 출입국 관리소에 관한 이야기를 들어보세요." +  
				"<p>맨하탄으로 돌아가기 전에 아쉬움이 남지 않도록 남은 여행기간동안 혼자만의 시간을 충분히 느껴보시길 바래요.");
		board.setInclude("<li>페리 우선탑승권" + 
				"<li>리버티 섬 페데스탈 박물관, 엘리스섬 박물관 입장권" + 
				"<li>왕복 페리 티켓" + 
				"<li>전문 가이드");
		board.setUninclude("<li>호텔 픽업 및 샌딩 서비스\r\n" + 
				"<li>음식과 음료" + 
				"<li>팁 (권장)" + 
				"<li>물품보관함 (2$, 리버티 섬안에 있습니다.)");
		board.setCourse("<h5>자유의 여신상과 엘리스섬 가이드투어</h5>"+
				"<p>- 리버티 섬에서 뉴욕의 스카이라인 감상" + 
				"<p>- 자유의 여신상 받침대\r\n" + 
				"<p>- 엘리스 섬\r\n" + 
				"<p>- 엘리스 섬 이민 박물관");
		board.setAddinfo("<p>- 음식은 페리, 자유의 여신상, 엘리스 섬에서 구입가능합니다." + 
				"<p>- 모든 기상 조건에서 투어가 운영됩니다. 날씨에 맞는 적절한 옷을 입어주세요." + 
				"<p>- 이 투어는 휠체어를 이용하실 수 없습니다." + 
				"<p>- 만 3세 이하의 어린이들은 티켓을 지불한 성인과 입장가능합니다." + 
				"<p>- 배낭, 유모차 및 기타 대형 품목은 리버티 섬에 있는 물품보관함을 이용해주세요. 이 보관함은 사물함 당 2$이며, 수수료는 포함되어 있지 않습니다." + 
				"<p>- 촬영은 허가되나 삼각대와 모노포드는 갖고 들어가실 수 없습니다." + 
				"<p>- 페리에 입장하기 전 보안검사가 실시됩니다. 공원 방문객은 공항수준의 보안심사를 받아야합니다.");
		board.setContacttime("<p>- 오전 8시 30분 출발" + 
				"<p>- 오전 9시 출발" +  
				"<p>- 오전 9시 30분 출발" + 
				"<p>- 오전 10시 30분 출발");
		board.setContactplace("<p>배터리 파크</p>");
		model.addAttribute("content", board);

		return "offers/content";
	}
	
	
}
