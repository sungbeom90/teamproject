<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	
<script type="text/javascript">
function onsubmit() {
	event.preventDefault();
		if($(".sign_up_name").val() === ""){
			confirm("한 글자 이상을 기입하세요.");
			console.log("확인2");
		}else if($(".sign_up_email").val() === ""){
			confirm("한 글자 이상을 기입하세요.");
			console.log("확인3");
		}else if($(".sign_up_password").val().length < 8 ){
			confirm("8자 이상을 기입하세요.");
			console.log("확인4");
		}else if ($(".sign_up_password").val() !== $(".sign_up_password_ok").val()){
			confirm("동일한 비밀번호를 입력하세요.");
			console.log("확인5");
		}
		
		$(".sign_up_form").submit();
}
</script>
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
						<div class="sign_up_box">
							<label for="ujoinname">이름 * </label><br/>
							<input class="sign_up_name" type="text" placeholder="이름을 입력하세요" /><br/>
							<label for="ujoinid">이메일 * </label><br/>
							<input class="sign_up_email" type="email" placeholder="ID@example.com" /><br/>
							<label for="ujoinpassword">비밀번호 * </label><br/>
							<input class="sign_up_password" type="password" placeholder="비밀번호를 입력하세요." /><br/>
							<label for="ujoinpassword_re">비밀번호 확인 * </label><br/>
							<input class="sign_up_password_ok" type="password" placeholder="다시 입력하세요." /><br/>
							
							
						
								<label for="sign_up_allagree"></label>
								<input class="sign_up_allagree" type="checkbox" name="sign_up_allagree" />전체 약관 동의
								<ul class="sign_up_check_ul">
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
							<div class="sign_up_span">
								<span>*선택 항목을 동의하지 않아도 서비스를 이용하실 수 있습니다.</span><br/>
								<span>*회원 가입 시 본인이 만 14세 이상임에 동의하게 됩니다.</span><br/>
								<button class="btn btn-primary btn-sm" id="sign_up_btn">회원가입</button>
							</div>
							
						</div>
					</form>
					</c:if>
						
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>