<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일본</title>
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
	src="<%=application.getContextPath()%>/resources/javascript/cities.js"></script>
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
					<div>
						<img style="width:00%" src="<%=application.getContextPath()%>/resources/img/newyork_head.jpg">
						<span style="font-size: 400%; font-weight: bold;">일 본</span>
					</div>
					<div class="card-deck">
							<div class="card img-fluid cities">
							    <img class="card-img-top img_center" src="<%=application.getContextPath()%>/resources/img/newyork3.jpg" alt="Card image" style="width:100%">
							    <div class="card-img-overlay">
							      <h4 class="card-title">오 키 나 와</h4>
							      <p class="card-text"> Some example text some example text.</p>
							      <a href="<%=application.getContextPath()%>/cities/okinawa" class="btn btn-primary">See Profile</a>
							    </div>
							  </div>
							  
							 <div class="card img-fluid cities">
							    <img class="card-img-top img_center" src="<%=application.getContextPath()%>/resources/img/photo1.jpg" alt="Card image" style="width:100%">
							    <div class="card-img-overlay">
							      <h4 class="card-title">후 쿠 오 카</h4>
							      <p class="card-text"> Some example text some example text.</p>
							      <a href="<%=application.getContextPath()%>/cities/fukuoka" class="btn btn-primary">See Profile</a>
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