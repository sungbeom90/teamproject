<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/main.css">
		<script	src="<%=application.getContextPath()%>/resources/javascript/users.js"></script>
	</head>
	
	<body>
		<div class="wrap">
			<%-- 공통 헤더 --%>
			<jsp:include page="/WEB-INF/views/include/header.jsp"/> 
			
			<%-- 내용 --%>
			<div class="mainCenter">
				<%-- 공통 메뉴 --%>
				<jsp:include page="/WEB-INF/views/include/menu.jsp"/>
				<div class="content container">					
					<div class="sector container user_in border rounded">
						<h2>회원가입</h2>					
							<form method="post" enctype="multipart/form-data" action="join">
								<label for="memail">이메일</label>
				 				<input type="email" id="memail" name="memail" placeholder="ID@example.com"/><br>
				 							 				
				 				<label for="mpassword">비밀번호</label>
				 				<input type="password" id="mpassword" name="mpassword" placeholder="비밀번호를 입력하세요."/><br/>
				 				
				 				<label for="mpassword_re">비밀번호 확인</label>				
								<input type="password" id="mpassword_re" name="mpassword_re" placeholder="비밀번호를 다시 입력하세요."/> <br/>
								
								<label for="mname">이름</label>
								<input type="text" id="mname" name="mname" placeholder="이름 입력하세요."><br/>
								
								<label for="mphone">전화번호</label>
								<input type="text" id="mphone" name="mphone" placeholder="전화번호를 입력하세요."><br/>
								
								
								<br/>
								<h5>선택 입력 사항</h5>								
								<label for="mgender">성별</label>
								<input type="radio" id="mgender1" name="mgender" value="male"/> 남성
								<input type="radio" id="mgender2" name="mgender" value="female"/> 여성
								<br/>								
								
								<fmt:formatDate value="${date.mjoin}" pattern="yyyy-MM-dd"/>
									
								
								<!-- form 추가 -->
					 			<h5>회원 가입 약관</h5>
					 			<input type="checkbox" id="uagree_all" name="uagree_all" value="all" /> 전체 약관 동의<br/>
								<input type="checkbox" id="uagree_e1" name="uagree_e1" value="essential1"/> 회원 가입 및 운영약관 동의 (필수)<br/>
								<input type="checkbox" id="uagree_e2" name="uagree_e2" value="essential2"/> 개인정보 수집 및 이용 (필수)<br/>
								<input type="checkbox" id="uagree_o1" name="uagree_o1" value="option1"> 위치정보 이용약관 (선택)<br/>
								<input type="checkbox" id="uagree_o2" name="uagree_o2" value="option2"/> 특가 항공권 및 할인 혜택 안내 동의  (선택)<br/>
								
								<br/>
								<p>*선택 항목을 동의하지 않아도 서비스를 이용하실 수 있습니다.</p>
								<p>*회원 가입 시 본인이 만 14세 이상임에 동의하게 됩니다.</p>
								<div class="container justify-content-center">
								<input type="submit" class="btn btn-primary d-block mb-1" id="sign_up_btn" value="회원가입" style="width:100%;"/>
								</div>
							</form>
						</div>
	
					</div>
				<jsp:include page="/WEB-INF/views/include/footer.jsp" />
			</div>			
		</div>
	</body>
</html>