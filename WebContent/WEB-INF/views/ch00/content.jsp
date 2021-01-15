<%--

[page 지시자]
language=:.jsp 파일에서 사용되는 프로그래밍 언어(생략가능)
pageEncoding:.jsp파일로 저장할 때 사용되는 문자 셋(생략가능)
contentType: .jsp가 실행 후 만들어지는 결과물의 종류
	MIME 타입을 지정
		text/html: 문자 내용으로  html 태그로 구성된 것
		appication/json: 문자 내용으로 json 표기로 구성한 것
		image/jpeg: 이미지 내용으로 jpeg으로 인코딩 한 것
		image/png: 이미지 내용으로 png로 인코딩 한 것
	문자셋 지정
		브라우저로 전달할 때 사용되는 문자셋(문자 내용은 반드시 기술을 해야함	

 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- import 속성 --%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="<%=application.getContextPath()%>/resources/css/main.css">
<script src="<%=application.getContextPath()%>/resources/javascript/team_main.js"></script>
</head>

<body>
	<div class="wrap">
		<%-- 공통 헤더 --%>
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		<!-- 실행을하고 결과를 넣는다. -->
		<%-- <%@ include file="/WEB-INF/views/include/header.jsp" %> --%>
		<!-- 복사를 하고 넣는다. -->

		<%-- 내용 --%>
		<div class="mainCenter">
			<%-- 공통 메뉴 --%>
			<jsp:include page="/WEB-INF/views/include/menu.jsp" />
			<div class="content">
				<div class="sector">
					<div class="container d-flex flex-column">
						<br />
						<h1>어디로 떠나세요?</h1>
						<div class="container d-flex flex-wrap justify-content-around">
							<div class="contents city">
								<div id="city1_img" class="img_cover"></div>
								<div id="city1_text" class="city_text">도시</div>
							</div>
							<div class="contents city">
								<div id="city2_img" class="img_cover">도시</div>
								<div id="city2_text" class="city_text">도시</div>
							</div>
							<div class="contents city">
								<div id="city3_img" class="img_cover"></div>
								<div id="city3_text" class="city_text">도시</div>
							</div>
							<div class="contents city">
								<div id="city4_img" class="img_cover"></div>
								<div id="city4_text" class="city_text">도시</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>