<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>추천 상품</title>
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
	src="<%=application.getContextPath()%>/resources/javascript/packages.js"></script>
</head>

<body>
	<div class="wrap">
		<%-- 공통 헤더 --%>
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		
		<%-- 내용 --%>
		<div class="mainCenter">
			<%-- 공통 메뉴 --%>
			<jsp:include page="/WEB-INF/views/include/menu.jsp" />
			<div class="content container">
				<div class="sector">
					<h1>원하는 여행지를 골라보세요</h1>
					<div class="card-deck">
						<div class="card img-fluid packages">
					    	<img class="card-img-top img_packages" src="<%=application.getContextPath()%>/resources/img/fukuoka1.jpg" alt="Card image">
							    <div class="card-img">
								    <div class="text_box">
								      <h4 class="card-title">벳푸 온천체험</h4>
								      <p class="card-text">::다양한 지옥 온천 체험::</p>
								      <a href="<%=application.getContextPath()%>/offers/fukuoka_offer1" class="btn btn-outline-light btn-sm text-dark stretched-link">바로가기</a>
								    </div>
							    </div>
						</div>
						<div class="card img-fluid packages">
					    	<img class="card-img-top img_packages" src="<%=application.getContextPath()%>/resources/img/hawaii1.jpg" alt="Card image">
							    <div class="card-img">
							    	<div class="text_box">
								      <h4 class="card-title">다이아몬드헤드 투어</h4>
								      <p class="card-text">::일출보러 가기::</p>
								      <a href="<%=application.getContextPath()%>/offers/hawaii_offer1" class="btn btn-outline-light btn-sm text-dark stretched-link">바로가기</a>
								    </div>
							    </div>
						</div>
						<div class="card img-fluid packages">
					    	<img class="card-img-top img_packages" src="<%=application.getContextPath()%>/resources/img/seville1.jpg" alt="Card image">
							    <div class="card-img">
							    	<div class="text_box">
								      <h4 class="card-title">스페인 광장 투어</h4>
								      <p class="card-text">::걸어서 광장 가기::</p>
								      <a href="<%=application.getContextPath()%>/offers/barcelona_offer1" class="btn btn-outline-light btn-sm text-dark stretched-link">바로가기</a>
								    </div>
							    </div>
						</div>
						<div class="card img-fluid packages">
					    	<img class="card-img-top img_packages" src="<%=application.getContextPath()%>/resources/img/sokcho1.jpg" alt="Card image">
							    <div class="card-img">
							   		<div class="text_box">
								      <h4 class="card-title">설 악 산</h4>
								      <p class="card-text">::트래킹 하러가기::</p>
								      <a href="<%=application.getContextPath()%>/offers/sokcho_offer1" class="btn btn-outline-light btn-sm text-dark stretched-link">바로가기</a>
								    </div>
							    </div>
						</div>
					</div>
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>