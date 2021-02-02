<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


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
			<h2>예약내역</h2>
				<div class="sector">
					<table class="table table-bordered">
						<thead>
					    	<tr>
								<th>주문번호</th>
								<th>패키지이미지</th>
							    <th>패키지명</th>
							    <th>예약날짜</th>
							    <th>예약인원</th>
							    <th>예약상태</th>
					    	</tr>
					  	</thead>
					  	<tbody>
					  		<c:forEach var="order" items="${list}">
					  			<tr>
									<td>${order.order_id}</td>
									<td><img class="rounded-circle"src="<%=application.getContextPath()%>/offer/oimagehead?offer_id=${order.offer_id}" width="30px"/></td>
									<td><a class="text-warning text-decoration-none" href="<%=application.getContextPath()%>/offer/offerread?offer_id=${order.offer_id}">${order.otitle}</a></td>
									<td><fmt:formatDate value="${order.odate_meet}" pattern="yyyy.MM.dd"/></td>
									<td>${order.opeople}</td>
									<td>${order.ostatus}</td>
								</tr>						  		
					  		</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>