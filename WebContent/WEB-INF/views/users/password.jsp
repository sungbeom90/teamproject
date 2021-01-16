<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>

  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>
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
						<h2>비밀번호 찾기</h2>
							<form method="post" class="password_form" action="password_re">
								<p>마이리얼트립 가입 시 사용한 이메일 주소를 입력해주시면 비밀번호를 재설정 할 수 있는 링크를 보내드립니다.</p>
								<div class="password_box">
									<label for="uid">이메일 * </label>
									<input type="email" placeholder="ID@example.com" id="uid" name="uid" /><br/>
								</div>	
								
								<div class="password_box">
									<button>비밀번호 재설정</button><br/>
								</div>
								<span>혹시 이메일이 기억났나요?</span><a class="btn btn-success btn-sm" href="sign_in">로그인</a>
							</form>
					</div>
					<jsp:include page="/WEB-INF/views/include/footer.jsp" />
				</div>
		</div>
	</div>
</body>
</html>