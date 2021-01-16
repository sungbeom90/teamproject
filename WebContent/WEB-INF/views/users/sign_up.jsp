<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
					<form method="post" class="sign_up" action="sign_up_success">
						<div class="sign_up_box">
							<label for="ujoinname">이름 * </label><br/>
							<input class="join" type="text" placeholder="이름을 입력하세요" /><br/>
							<label for="ujoinid">이메일 * </label><br/>
							<input class="join" type="email" placeholder="ID@example.com" /><br/>
							<label for="ujoinpassword">비밀번호 * </label><br/>
							<input class="join" type="password" placeholder="비밀번호를 입력하세요." /><br/>
							<label for="ujoinpassword_re">비밀번호 확인 * </label><br/>
							<input class="join" type="password" placeholder="다시 입력하세요." /><br/>
							
							
						
								<label for="sign_up_allagree"></label>
								<input type="checkbox" name="sign_up_allagree" />전체 약관 동의
								<ul class="sign_up_ul">
									<li>
										<label for="uagree1">
										<input class="sign_up_check" type="checkbox" name="uagree1">회원 가입 및 운영약관 동의 (필수)<br/>
										</label>
									</li>
										
									<li>
										<label for="uagree2">
										<input class="sign_up_check" type="checkbox" name="uagree2">개인정보 수집 및 이용 (필수)<br/>
										</label>
									</li>
										
									<li>
										<label for="uagree3">
										<input class="sign_up_check" type="checkbox" name="uagree3">위치정보 이용약관 (선택)<br/>
										</label>
									</li>
										
									<li>
										<label for="uagree4">
										<input class="sign_up_check" type="checkbox" name="uagree4">특가 항공권 및 할인 혜택 안내 동의  (선택)
										</label>
									</li>
								</ul>
							<div class="joinspan">
								<span>*선택 항목을 동의하지 않아도 서비스를 이용하실 수 있습니다.</span><br/>
								<span>*회원 가입 시 본인이 만 14세 이상임에 동의하게 됩니다.</span><br/>
								<button class="btn btn-primary btn-sm">회원가입</button>
							</div>
							
						</div>
					</form>
						
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>