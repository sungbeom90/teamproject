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
			<div class="content container">
				<div class="sector container border sign_in mt-5 mb-5">
					<h2>비밀번호 재 설정</h2>
						<c:if test="${passwordreset == null}">	
								<form method="post" action="password_compare" class="was-validated">
									<div class="form-group">
										<input type="email" class="form-control form-control-lg" id="email_compare" name="email_compare" placeholder="ID@example.com" required/>
										<div class="valid-feedback">유효한 이메일 입니다.</div>
										<div class="invalid-feedback">이메일을 입력해주세요.</div>
									</div>
									<div class="form-group">
										<input type="text" class="form-control form-control-lg" id="name_compare" name="name_compare" placeholder="이름" required/>
										<div class="valid-feedback">유효한 이름입니다.</div>
										<div class="invalid-feedback">이름을 입력해주세요.</div>
									</div>								
									<input type="submit" class="btn btn-danger d-block" id="password_compare_btn" value="비밀번호 재설정"/>
								</form>
								</c:if>
								<c:if test="${passwordreset != null}">
									<form method="post" action="password_reset" class="was-validated">
										<div class="form-group">
											<input type="password" class="form-control form-control-lg" id="password_reset1" name="password_reset1" placeholder="새로운 비밀번호를 입력하세요" required/>
											<div class="valid-feedback">유효한 비밀번호 입니다..</div>
											<div class="invalid-feedback">새로운 비밀번호를 입력해주세요.</div>
										</div>
										<div class="form-group">
											<input type="password" class="form-control form-control-lg" id="password_reset2" name="password_reset2" placeholder="비밀번호를 다시 입력해주세요." required/>
											<div class="valid-feedback">유효한 비밀번호입니다.</div>
											<div class="invalid-feedback">비밀번호를 다시 입력해주세요.</div>
										</div>								
										<input type="submit" class="btn btn-danger d-block" id="password_reset_btn" value="비밀번호 재설정"/>
									</form>
								</c:if>
								<div class="container justify-content-center">
									<a class="btn btn-success d-block" href="sign_in">로그인페이지</a>
									<a class="btn btn-primary d-block" href="sign_up">회원가입</a>
								</div>
					</div>
					<script type="text/javascript">
						$("#password_compare_btn").click(()=>{
							if($("#email_compare").val() === ""){
								event.preventDefault();
								alert("비밀번호를 재설정 할 아이디를 입력하세요.");
								return;		
							}else if($("#name_compare").val() === ""){
								event.preventDefault();
								alert("가입한 이메일의 이름을 입력하세요.");
								return;
							}else {
								var con = confirm("인증되었습니다. 변경하실 비밀번호를 입력하세요.");
							}							
						});
</script>
			</div>
			<div class="fixed-bottom">
			<jsp:include page="/WEB-INF/views/include/footer.jsp"/></div>
		</div>
	</div>
</body>
</html>