<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
					<h1>users 필드</h1>
					<h2>sign_in 필드</h2>
					<h2>ch06를 적용해보자</h2>
					<h2>로그인 구현은 했으나 디테일이 좀 더 필요함.</h2>
					<h2>기존에 작성했던 이메일 방식으로 바꿔볼것.</h2>
					<h2>로그인 이후에는 ch06 리다이렉트를 적용해보자</h2>
					
				</div>
				<div class="sector">
					<h5>HttpSession 객체를 이용한 로그인</h5>
					<h5>id:admin@naver.com</h5>
					<h5>password:12345</h5>
					<div>
						<c:if test="${loginStatus == null}">
							<div>
								<form method="post" action="login">
									<label for="uid">이메일 * </label><br/>
									<input type="email" name="uid" placeholder="ID@example.com" /><br/>
									<label for="upassword">비밀번호 * </label><br/>
									<input type="password" name="upassword" placeholder="비밀번호" /><br/>
									<button class="btn btn-success btn-sm">로그인</button>
									<a class="btn btn-danger btn-sm" href="password">비밀번호 찾기</a><br/>
									<span>아직 회원이 아니신가요?</span>	<a class="btn btn-primary btn-sm" href="sign_up">회원가입</a>
								</form>
							</div>
						</c:if>
						<c:if test="${loginStatus != null}">
							<div>
								<a class="btn btn-danger btn-sm" href="logout">로그아웃</a>
							</div>
						</c:if>
					</div>
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>