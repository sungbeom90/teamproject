<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제하기</title>
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
			<p>order</p>
				<div class="sector">
				
				
					<%-- <div class="head" style="background-image:url('limage?location_id=${location.location_id}')">
						${location.lname}
					</div>
					<div class="card-deck">
					<!-- 상품을 나타내기 위함 -->
					
						<c:forEach var="offer" items="${list}">
							<div class="card img-fluid locations">
							    <img class="card-img-top img_center" src="../offer3/offerread?offer_id=${offer.offer_id}" alt="Card image">
							    <div class="card-img-overlay">
							      <h4 class="card-title">${offer.otitle}</h4>
							      <p class="card-text"></p>
							      <a href="../offer3/offerread?offer_id=${offer.offer_id}" class="btn btn-outline-light btn-sm stretched-link">바로가기</a>
							    </div>
							  </div>
						</c:forEach>	  
							 
					</div>	 --%>				
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>