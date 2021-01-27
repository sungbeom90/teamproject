<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
			<jsp:include page="/WEB-INF/views/include/menu.jsp" />
			<div class="content container">
				<div class="sector">
						<img src="<%=application.getContextPath()%>/resources/img/home_img.jpg" alt="logo" width="100%">
						
						
						
				</div>
				<div class="sector">
						<h5>연결 테스트</h5>
						<div>
							<a class="btn btn-success btn-sm" href="javascript:conntest()">연결 테스트</a>
							<script>
								const conntest = function() {									
									$.ajax({
										url:"conntest",
										method: "get",
										success: function (data) {
											$("#result1").html(data);											
										}
									});														
								};
							</script>
							<div id="result1"></div>
						</div>						
				</div>
				
				<div class="sector">
						<h5>봉 테스트</h5>
						<div>
							<a class="btn btn-success btn-sm" href="<%=application.getContextPath()%>/memberstest/login">로그인 테스트</a>
							<a class="btn btn-success btn-sm" href="<%=application.getContextPath()%>/memberstest/join">회원가입 테스트</a>
						</div>						
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>