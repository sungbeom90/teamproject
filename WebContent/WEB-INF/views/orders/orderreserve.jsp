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
			<h2>결제하기</h2>
				<div class="sector">
					<img src="<%=application.getContextPath()%>/offer/oimagehead?offer_id=${order.offer_id}" width="40px" height="40px" class="rounded-circle" style="margin-left:30px; margin-right: 30px; margin-top:20px; margin-bottom: 30px;"/>
					<form method="post" enctype="multipart/form-data" action="orderreserve" >
						<input class="form-control" type="hidden" id="offer_id" name="offer_id" value="${order.offer_id}">
						<input class="form-control" type="hidden" id="member_id" name="member_id" value="${order.member_id}">
						<%-- <input class="form-control" type="hidden" id="partner_id" name="partner_id" value="${offer.partner_id}"> --%>
						<a href="<%=application.getContextPath()%>/offer/offerread?offer_id=${order.offer_id}">"${order.otitle}"</a><br/>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">예약날짜</span>
							</div>
							<input class="form-control" type="date" id=odate_meet name="odate_meet" value="<fmt:formatDate value="${order.odate_meet}" pattern="yyyy-MM-dd"/>" readonly="readonly">
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">인원수</span>
							</div>
						<input class="form-control" type="number" id="opeople" name="opeople" value="${order.opeople}"readonly="readonly">
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">1인당 가격</span>
							</div>
						<input class="form-control" type="number" id="oprice" name="oprice" value="${order.oprice}" readonly="readonly">
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">총 금액</span>
							</div>
						<input class="form-control" type="number" id="ocost" name="ocost" value="${order.ocost}" readonly="readonly">
						</div>
						<div class="d-flex">
							<input class="btn btn-info btn-sm flex-fill" type="submit" value="결제하기"><br/>							
						</div>					
			
					</form>
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>