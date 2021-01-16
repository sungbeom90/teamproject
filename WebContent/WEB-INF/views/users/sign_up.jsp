<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
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
						<h2>sign_up 필드</h2>
						<h2>ch07 또는 ch08을 이용하여 회원가입 구현</h2>
						<h2>객체를 이용해서 데이터를 받아보자</h2>
						<h2>이전에 작성했던 회원가입 방식을 적용해보자(비밀번호 확인, 빈란 알려주기)</h2>
						<h2>가입 이후에는 ch06 리다이렉트를 적용해보자</h2>
						
						
					<h2>회원가입</h2>
					<c:if test="${signupStatus == null}">
						<form method="post" class="sign_up_form" action="sign_up_success">						
							<label for="uemail">이메일</label>
				 			<input type="email" id="uemail" name="uemail" placeholder="ID@example.com"/><br>
				 			<label for="upassword">비밀번호</label>
							<input type="password" id="upassword" name="upassword" placeholder="비밀번호를 입력하세요."/> <br/>
							<label for="upassword_re">비밀번호 확인</label>
							<input type="password" id="upassword_re" name="upassword_re" placeholder="비밀번호를 다시 입력하세요."/> <br/>							
							<br/>
							<p>개인정보사항</p>
				 			<label for="uname">이름</label>
				 			<input type="text" id="uname" name="uname" placeholder="이름을 입력하세요"/><br>		 			
				 			<label for="usex">성별</label>
							<input type="radio" class="custom-control-input" id="usex" name="usex" value="male" checked/> 남성
							<input type="radio" class="custom-control-input" id="usex" name="usex" value="female"/> 여성
							<input type="radio" class="custom-control-input" id="usex" name="usex" value="other"/> 그외
							<input type="file" name="uselfy"/><br/>					
							<br/>					
				 			<input type="checkbox" id="uagree_all" name="uagree_all" value="all"/> 전체 약관 동의<br/>
							<input type="checkbox" id="uagree_e1" name="uagree_e1" value="essential1"/> 회원 가입 및 운영약관 동의 (필수)<br/>
							<input type="checkbox" id="uagree_e2" name="uagree_e2" value="essential2"/> 개인정보 수집 및 이용 (필수)<br/>
							<input type="checkbox" id="uagree_o1" name="uagree_o1" value="option1"/> 위치정보 이용약관 (선택)<br/>
							<input type="checkbox" id="uagree_o2" name="uagree_o2" value="option2"/> 특가 항공권 및 할인 혜택 안내 동의  (선택)<br/>
							
							<p>*선택 항목을 동의하지 않아도 서비스를 이용하실 수 있습니다.</p>
							<p>*회원 가입 시 본인이 만 14세 이상임에 동의하게 됩니다.</p>
							<input type="submit" class="btn btn-primary btn-sm" id="sign_up_btn" value="회원가입"/>
						</form>
					</c:if>
					
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>