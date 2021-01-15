<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
<script
	src="<%=application.getContextPath()%>/resources/javascript/01main.js"></script>
</head>

<body>
	<div class="wrap">
		<%-- 공통 헤더 --%>
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		
		<%-- 내용 --%>
		<div class="mainCenter">
			<%-- 공통 메뉴 --%>
			<jsp:include page="/WEB-INF/views/include/menu.jsp" />
			<div class="content">
				<div class="sector">
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
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>