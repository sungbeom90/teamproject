<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 재설정</title>
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
	src="<%=application.getContextPath()%>/resources/javascript/users.js"></script>
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
						<h2>비밀번호 재설정</h2>
							<form method="post" class="password_re" action="sign_in">
								<div>
									<label for="upassword_re_1">새로운 비밀번호를 입력하세요 .* </label><br/>
									<input type="password" placeholder="비밀번호를 입력하세요." name="upassword_re_1" /><br/>
									<label for="upassword_re_2">다시 입력해주세요. * </label><br/>
									<input type="password" placeholder="다시 입력하세요." name="upassword_re_2" />
								</div>
								<button>비밀번호 재설정</button>
							</form>
					</div>
				<jsp:include page="/WEB-INF/views/include/footer.jsp" />
			</div>
		</div>
	</div>
</body>
</html>