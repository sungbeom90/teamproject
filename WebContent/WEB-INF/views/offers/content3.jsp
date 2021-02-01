<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	src="<%=application.getContextPath()%>/resources/javascript/offers.js"></script>
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
					
					<div class="d-flex">
						<div class="d-inlineblock">작성자들어갈곳</div>
						<h1 class="d-inlineblock ml-auto">${offer.oprice}</h1>
					</div>
					<hr/>					
					<h1>${offer.otitle}</h1>					
					<!-- 이미지 -->
					<hr/>
					<c:forEach var="image" items="${imageList}">						
						<img src="../offer3/oimage?offer_id=${offer.offer_id}&iimageoname=${image.iimageoname}" alt="${image.iimageoname}" width="500px" height="500px" 
						class="rounded" style="margin-left:30px; margin-right: 30px; margin-top:20px; margin-bottom: 30px;"/>											
					</c:forEach>					
					<div class="space mb-3">${offer.osubtitle}</div>
					<div>${offer.obody}</div>
					<hr/>
					<h4>상품 정보</h4>
					<h5>포함 사항</h5>
					<div class="space mb-5">${offer.oinclude}</div>
					<h5>불포함 사항</h5>
					<div class="space mb-5">${offer.ouninclude}</div>
					<h4>코스 소개</h4>
					<c:forEach var="course" items="${courseList}">
						<div class="space mb-5">${course.cplace}</div>
						<div class="space mb-5">${course.cdetail}</div>
						<div class="space mb-5">${course.ctime}</div>
						<img src="../offer3/cimage?offer_id=${offer.offer_id}&cimageoname=${course.cimageoname}" alt="${course.cimageoname}" width="500px" height="500px" 
						class="rounded" style="margin-left:30px; margin-right: 30px; margin-top:20px; margin-bottom: 30px;"/>										
					</c:forEach>
				
					<h5>만나는 장소</h5>
					<div class="space mb-5">${offer.oplace_meet}</div>
					<h5>만나는 시간</h5>
					<div class="space mb-5">${offer.otime_meet}</div>
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>