<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${nation.nname}</title>
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
					<div class="head" style="background-image:url('nimage?nation_id=${nation.nation_id}')">
						${nation.nname}
					</div>
					<div class="card-deck">
						<!-- 도시들을 보여주기 위함 -->
						<p>nation3</p>
						<c:forEach var="location" items="${list}">
							<div class="card img-fluid locations">
							    <img class="card-img-top img_center" src="<%=application.getContextPath()%>/locations/limage?location_id=${location.location_id}" alt="Card image">
							    <div class="card-img-overlay">
							      <h4 class="card-title">${location.lname}</h4>
							      <p class="card-text"></p>
							      <a href="<%=application.getContextPath()%>/locations/locationread?location_id=${location.location_id}" class="btn btn-outline-light btn-sm stretched-link">바로가기</a>
							    </div>
							  </div>
						 </c:forEach>
							 
					</div>			
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>