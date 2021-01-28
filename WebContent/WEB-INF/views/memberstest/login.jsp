<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
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
</head>

<body>
	<div class="wrap">
		<%-- 공통 헤더 --%>
		<jsp:include page="/WEB-INF/views/include/header.jsp" />

		<%-- 내용 --%>
		<div class="mainCenter">
			<div class="content container">
				<div class="sector container border rounded user_in mt-5 mb-5">
						<c:if test="${loginStatus == null}">
							<h2>로그인</h2>					
								<form name="loginForm" onsubmit="login()" method="post"  class="was-validated">
									<div class="form-group">
										<input type="email" class="form-control form-control-lg" id="memail" name="memail" placeholder="ID@example.com" required/>
										<small id="failEmail" class="text-danger"></small>
										<div class="valid-feedback">유효한 이메일 입니다.</div>
										<div class="invalid-feedback">이메일을 입력해주세요.</div>
									</div>
									<div class="form-group">
										<input type="password" class="form-control form-control-lg" id="mpassword" name="mpassword" placeholder="비밀번호" required/>
										<small id="wrongPassword" class="text-danger"></small>
										<div class="valid-feedback">유효한 비밀번호 입니다.</div>
										<div class="invalid-feedback">비밀번호를 입력해주세요.</div>
									</div>
									<div class="container justify-content-end">						
									<button class="btn btn-success d-block mb-1">로그인</button>		
									<a href="content">취소</a>							
									</div>
								</form>							
								<div class="container justify-content-center">
									<a class="btn btn-danger d-block mb-1" href="password">비밀번호 찾기</a>
									<a class="btn btn-primary d-block mb-1" href="join">회원가입</a>
								</div>
						</c:if>
						<c:if test="${loginStatus != null}">
								<a class="btn btn-danger btn-sm" href="logout">로그아웃</a>
						</c:if>
					</div>
					<script>
						function login(){
							
						const memail = $("#memail").val();
						const mpassword = $("#mpassword").val();
							$.ajax({
								url:"login",
								method:"post",
								//id값에 상응하는 data를 보내줘야한다.
								data:{memail, mpassword},
								success:function(data){
									if(data.login === "loginSuccess"){
										alert("로그인 성공");
										location.href="content";
									}else if(data.login === "failEmail"){
										$("#failEmail").html("이메일이 달라요.");
										location.href="login";
									}else if(data.login === "wrongPassword"){
										$("#wrongPassword").html("비밀번호가 달라요.");
										location.href="login";
									}
								}
							});
						}
					
					</script>
			</div>
			<div class="fixed-bottom">
			<jsp:include page="/WEB-INF/views/include/footer.jsp"/></div>
		</div>
	</div>
</body>
</html>