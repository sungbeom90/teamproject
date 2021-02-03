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
	
<!-- html 폰트 아이콘 사용 -->	
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<link rel="stylesheet"
	href="<%=application.getContextPath()%>/resources/css/main.css">
<script
	src="<%=application.getContextPath()%>/resources/javascript/countries.js"></script>
</head>

<body>
	<div class="wrap">
		<%-- 공통 헤더 --%>
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		
		<%-- 내용 --%>
		<div class="mainCenter mt-5">
			<%-- 공통 메뉴 --%>
			<jsp:include page="/WEB-INF/views/include/menu.jsp" />			
			<div class="content container">
				<%-- <div class="sector">
					<p>locationlist3</p>
					<c:forEach var="location" items="${list}">
						<div class="card img-fluid nations">
						    <img class="card-img-top img_center" src="../locations3/limage?location_id=${location.location_id}" alt="Card image">
						    <div class="card-img-overlay" >
						    	<h2 class="card-title">${location.lname}</h2>
						    	<a href="locationread?location_id=${location.location_id}" class="btn btn-outline-light btn-sm stretched-link">바로가기</a>
						    </div>
						</div>					  		
					</c:forEach>				
				</div> --%>
				<div class="sector">
				<c:forEach var="location" items="${list}" >
					<div class="card locationlists" style="width: 20rem; height: 19.5rem; display: inline-block; margin: 20px; color: black; text-shadow: 0.1rem 0.2rem 0.5rem gray; box-shadow: 0.1rem 0.2rem 0.5rem gray;" >							
						<img height="160px" src="limage?location_id=${location.location_id}" class="card-img-top" alt="Card image" >
						<!-- <div class="card-img-overlay" > -->
							<div class="card-body">
								<h5  class="card-title">${location.lname}</h5>
								<p class="card-text">${location.ldetail}</p>
								<a href="locationread?location_id=${location.location_id}" class="btn btn-primary" >바로가기</a>
							</div>					
						<!-- </div> -->
					</div>
				
				</c:forEach>	
					<div style="margin-left: 400px; margin-top: 30px;">
						<a class="btn btn-outline-dark btn-sm mr-1" href="locationlist?pageNo=1">처음</a> 
						<c:if test="${pager.groupNo > 1}">
							<a class="btn btn-outline-dark btn-sm mr-1" href="locationlist?pageNo=${pager.startPageNo-1}">이전</a>
						</c:if>
						<c:forEach var="i" begin="${pager.startPageNo}" end="${pager.endPageNo}">
							<c:if test="${i == pager.pageNo}">
								<a class="btn btn-link btn-sm mr-1" href="locationlist?pageNo=${i}">${i}</a>
							</c:if>
							<c:if test="${i != pager.pageNo}">
								<a class="btn btn-link btn-sm mr-1" href="locationlist?pageNo=${i}">${i}</a>
							</c:if>
						</c:forEach>
						<c:if test="${pager.groupNo < pager.totalGroupNo}">
							<a class="btn btn-outline-dark btn-sm mr-1" href="locationlist?pageNo=${pager.endPageNo+1}">다음</a>
						</c:if>
							<a class="btn btn-outline-dark btn-sm mr-1" href="locationlist?pageNo=${pager.totalPageNo}">맨끝</a>
					</div>		
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>