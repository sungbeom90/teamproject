<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뉴욕</title>
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
				<div class="head" style="background-image:url('<%=application.getContextPath()%>${city.imgHead}')">
				${city.name}
				</div>
						<h2>${city.recommend}</h2>		 				
				<div class="card-deck">
					<div class="card img-fluid cities">
					    <img class="card-img-top img_center" src="<%=application.getContextPath()%>${city.imgPackage1}" alt="Card image">
						    <div class="card-img-overlay">
						     	<h4 class="card-title">${city.big1}</h4>
						      <p class="card-text">${city.big2}</p>
						      <a href="<%=application.getContextPath()%>${city.btn1}" class="btn btn-outline-light btn-sm stretched-link">바로가기</a>
						    </div>
					</div>
					
					<div class="card img-fluid cities">
					    <img class="card-img-top img_center" src="<%=application.getContextPath()%>${city.imgPackage2}" alt="Card image">
						    <div class="card-img-overlay">
						      <h4 class="card-title">${city.sm1}</h4>
						      <p class="card-text">${city.sm2}</p>
						      <a href="<%=application.getContextPath()%>${city.btn1}" class="btn btn-outline-dark btn-sm stretched-link">바로가기</a>
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