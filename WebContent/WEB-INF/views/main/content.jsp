<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>I Love Earth</title>
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
	src="<%=application.getContextPath()%>/resources/javascript/main.js"></script>
</head>

<body>
	<div class="wrap">
		<%-- 공통 헤더 --%>
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		
		<%-- 내용 --%>
		<div class="mainCenter">
			<%-- 공통 메뉴 --%>
			<jsp:include page="/WEB-INF/views/include/menu.jsp"/>
			<div class="content container">
			
				<div class="sector">
					<%-- <div class="head"
						style="background-image:url('limage?location_id=${location.location_id}')">
						${location.lname}</div> --%>
					<div class="container-fluid">
						<div class="card-deck">
							<!-- 상품을 나타내기 위함 -->

							<c:forEach var="offer" items="${list}">
								<div class="card-deck" style="margin-left: 10px; margin-top: 40px;">
									<div class="card locationlists"
										style="width: 20rem; height: 400px; display: inline-block; margin: 20px; color: black; text-shadow: 0.1rem 0.2rem 0.5rem gray; box-shadow: 0.1rem 0.2rem 0.5rem gray;">
										<img height="180px"
											src="<%=application.getContextPath()%>/offer/oimagehead?offer_id=${offer.offer_id}"
											class="card-img-top " alt="Card image">
										<div class="card-body" style="height: 165px">
											<h5 class="card-title">${offer.otitle}</h5>
											<p class="card-title">${offer.osubtitle}</p>
										</div>
										<div class="card-footer" align="right">
											<small class="text-muted">${offer.oprice}원</small> <a
												href="<%=application.getContextPath()%>/offer/offerread?offer_id=${offer.offer_id}"
												class="btn btn-outline-primary btn-sm"
												style="margin-left: 10px;">바로가기</a>
										</div>
									</div>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>