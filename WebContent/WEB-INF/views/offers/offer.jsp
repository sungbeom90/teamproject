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
		<div class="mainCenter mt-5">
			<%-- 공통 메뉴 --%>
			<jsp:include page="/WEB-INF/views/include/menu.jsp" />
				<div class="content container d-flex">
					<div class="sector">				
					<h1>${offer.otitle}</h1>					
					<!-- 이미지 -->
					<hr/>
					<div class="d-flex flex-wrap">
						<c:forEach var="image" items="${imageList}">						
							<img class="rounded p-2 border" src="oimage?offer_id=${offer.offer_id}&iimageoname=${image.iimageoname}" alt="${image.iimageoname}"
							style="width: 23rem; height: 23rem;"/>											
						</c:forEach>
					</div>
					<hr/>				
					<h2>${offer.osubtitle}</h2>
					<div style="white-space:pre;">${offer.obody}</div>
					<hr/>
					<h4>상품 정보</h4>
					<h5>포함 사항</h5>
					<p>${offer.oinclude}</p>
					<h5>불포함 사항</h5>
					<p>${offer.ouninclude}</p>
					<hr/>
					<h4>코스 소개</h4>
					<c:forEach var="course" items="${courseList}">
						<div class="bg-secondary d-flex justify-content-between align-content-center pt-2 pb-2 pl-2 pr-2 ">
							<div class="flex-fill">
								<p>${course.cplace}</p>
								<p>${course.cdetail}</p>
								<p>${course.ctime}</p>							
							</div>
							<div class="flex-fill">											
								<img src="cimage?offer_id=${offer.offer_id}&cimageoname=${course.cimageoname}" alt="${image.iimageoname}"
								class="Thumbnail d-block" style="width:50%; height:100%"/>
							</div>
							
						</div>		
					</c:forEach>				
					<h5>만나는 장소</h5>
					<p>${offer.oplace_meet}</p>
					<h5>만나는 시간</h5>
					<p class="space mb-5">${offer.otime_meet}</p>					
				</div>
				
				<div class="sector" style="width:40rem;">					
						<div class="input-group mb-3">
							<div class="input-group-prepend">
						    	<span class="input-group-text">1인</span>
						    </div>
							<input class="form-control" type="number" id="oprice" name="oprice" value="${offer.oprice}" readonly="readonly">
							<div class="input-group-append">
					        	<span class="input-group-text">원</span>
					     	</div>
					    </div>
						<form method="get" action="<%=application.getContextPath()%>/order/orderreserve" >
							<input class="form-control" type="hidden" id="offer_id" name="offer_id" value="${offer.offer_id}"><br/>							
							<input class="form-control" type="date" id="odate_meet" name="odate_meet"><br/>												
							<input class="form-control" type="number" id="opeople" name="opeople" placeholder="인원을 선택해주세요."><br/>
							<a class="btn btn-danger btn-sm d-block" href="javascript:costcalcurater()">금액조회하기</a><br/>
							<div id="estimate"></div>
						</form>
						<div class="d-inlineblock">작성자들어갈곳</div>
						<a class="btn btn-sm btn-outline-warning ml-1 mr-1" href="offerupdate?offer_id=${offer.offer_id}">수정하기(텍스트만)</a>
					
				</div>
				<script type="text/javascript">
							function costcalcurater () {
								var opeople = $("#opeople").val();
								var oprice =  $("#oprice").val();
								$.ajax({
									url: "<%=application.getContextPath()%>/order/costcalcurater",
									method: "get",
									data:{opeople, oprice},
									success: function(data){
										$("#estimate").html(data);
									}
								});
							};
					</script>
					
			</div>
		</div>
		<%-- 공통 풋터 --%>
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
</body>
</html>