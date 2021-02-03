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
					
							<div class="alert alert-warning" role="alert">
								로그인
							</div>				
								<form name="loginForm" onsubmit="login()" method="post"  class="was-validated">
									<div class="form-group">
										<input type="email" class="form-control" id="memail" name="memail" placeholder="ID@example.com"/>
										<small id="errorEmail" class="text-danger"></small>
									</div>
									<div class="form-group">
										<input type="password" class="form-control" id="mpassword" name="mpassword" placeholder="비밀번호"/>
										<small id="errorPassword" class="text-danger"></small>
									</div>
									<div class="container justify-content-end">						
									<button class="btn btn-info d-block mb-1" style="width:100%">로그인</button>		
									<a class="btn btn-warning d-block mb-1" href="<%=application.getContextPath()%>/main/content">취소</a>							
									</div>
								</form>							
								<div class="container justify-content-center">
									<a class="btn btn-danger d-block mb-1" href="#">비밀번호 찾기</a>
									<a class="btn btn-success d-block mb-1" href="join">회원가입</a>
								</div>
					
				
					</div>
					<script>
						function login(){
							// 유효성 검사
							event.preventDefault();
							//에러 메세지 초기값 설정
							$("#errorEmail").html("");
							$("#errorPassword").html("");
							//입력값 설정
							var check = true;
							
							const memail = $("#memail").val();
							if(memail === ""){
								$("#errorEmail").html("이메일 주세요.");
								check = false;
							}
							
							const mpassword = $("#mpassword").val();
							if(mpassword === ""){
								$("#errorPassword").html("비밀번호 주세요.");
								check = false;
							}
							
							if(!check){
								return;
							}
							
								$.ajax({
									url:"login",
									method:"post",
									//id값에 상응하는 data를 보내줘야한다.
									data:{memail, mpassword},
									success:function(data){
										if(data.login === "loginSuccess"){
											alert("로그인 성공");
											location.href="<%=application.getContextPath()%>/main/content";
										}else if(data.login === "emptyEmail"){
											$("#errorEmail").html("이메일이 없어요.");
										}else{
											$("#errorPassword").html("비밀번호가 달라요.");
											
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