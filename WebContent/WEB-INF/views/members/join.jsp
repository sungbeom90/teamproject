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
							<form name="joinForm" method="post" enctype="multipart/form-data" action="join">
								<label for="memail">이메일</label>
				 				<input type="email" id="memail" name="memail" placeholder="ID@example.com"/>
				 				<a href="javascript:emailcheck()">중복확인</a><br>
				 				
				 				<label for="mpassword">비밀번호</label>
				 				<input type="password" id="mpassword" name="mpassword" placeholder="비밀번호를 입력하세요."/><br/>
				 				
				 				<label for="mpassword_re">비밀번호 확인</label>				
								<input type="password" id="mpassword_re" name="mpassword_re" placeholder="비밀번호를 다시 입력하세요."/> <br/>
								
								<label for="mname">이름</label>
								<input type="text" id="mname" name="mname" placeholder="이름 입력하세요."><br/>
								
								<label for="mphone">전화번호</label>
								<input type="number" id="mphone" name="mphone" placeholder="전화번호를 입력하세요."><br/>
								
								
								<label for="mimage">프로필 사진</label><br/>
								<input type="file" id="mimage" name="mimage">
								
								
								<br/>
								<br/>
								<h5>선택 입력 사항</h5>								
								<label for="mgender">성별</label>
								<input type="radio" id="mmale" name="mgender" value="male"/> 남성
								<input type="radio" id="mfemale" name="mgender" value="female"/> 여성
								<br/>								
								
									
								
								<!-- form 추가 -->
					 			<h5>회원 가입 약관</h5>
					 			<input type="checkbox" id="uagree_all" name="uagree_all" value="all" /> 전체 약관 동의<br/>
								<input type="checkbox" id="aessence1" name="aessence_1" value="essential_1"/> 회원 가입 및 운영약관 동의 (필수)<br/>
								<input type="checkbox" id="aessence2" name="aessence_2" value="essential_2"/> 개인정보 수집 및 이용 (필수)<br/>
								<input type="checkbox" id="aoption1" name="aoption_1" value="option_1"> 위치정보 이용약관 (선택)<br/>
								<input type="checkbox" id="aoption2" name="aoption_2" value="option_2"/> 특가 항공권 및 할인 혜택 안내 동의  (선택)<br/>
								<input type="checkbox" id="apartner" name="apartner" value="apartner"/> 파트너 등록  (선택)<br/>
								<br/>
								<p>*선택 항목을 동의하지 않아도 서비스를 이용하실 수 있습니다.</p>
								<p>*회원 가입 시 본인이 만 14세 이상임에 동의하게 됩니다.</p>
								<div class="container justify-content-center">
								<input type="submit" class="btn btn-primary d-block mb-1" id="join_btn" value="회원가입" style="width:100%;"/>
								</div>
							</form>
							<script>
							$(()=>{
									$("#join_btn").click(()=>{		
										if($("#memail").val() === ""){
											event.preventDefault();
											alert("사용하실 아이디를 입력하세요.");
											return;		
										}else if($("#mpassword").val().length < 8 ){
											event.preventDefault();
											alert("8자 이상을 기입하세요.");
											return;	
										}else if ($("#mpassword").val() !== $("#mpassword_re").val()){
											event.preventDefault();
											alert("동일한 비밀번호를 입력하세요.");
											return;	
										}else if ($("#mname").val() === ""){
											event.preventDefault();
											alert("이름을 입력해주세요.");
											return;	
										}else if ($("#aessence1").prop("checked") === false){
											event.preventDefault();
											alert("필수약관을 동의하세요.");
											return;	
										}else if ($("#aessence2").prop("checked") === false){
											event.preventDefault();
											alert("필수약관을 동의하세요.");
											return;	
										} else {
											var con = confirm("가입을 축하합니다.");
										}
									});
									
									$("#uagree_all").click(()=>{
										if($("#uagree_all").prop("checked") === true){
											$("#aessence1").prop("checked", true);
											$("#aessence2").prop("checked", true);
											$("#aoption1").prop("checked", true);
											$("#aoption2").prop("checked", true);
											$("#apartner").prop("checked", true);
										} else {
											$("#aessence1").prop("checked", false);
											$("#aessence2").prop("checked", false);
											$("#aoption1").prop("checked", false);
											$("#aoption2").prop("checked", false);
											$("#apartner").prop("checked", false);
										}
										
									});
									
									
							});
								//이메일 중복확인
								function emailcheck(){
									var memail = $("#memail").val();
										$.ajax({
											url:"emailcheck",
											method:"post",
											data:{memail:memail},
											success:function(data){
												if(data.memail === "sameEmail"){
													alert("이메일이 중복이에요.");
												}else{
													alert("사용해도 좋아요.");
												}
											}
											
										});
									}
							</script>
						</div>
	
					</div>
				<jsp:include page="/WEB-INF/views/include/footer.jsp" />
			</div>			
		</div>
	</body>
</html>