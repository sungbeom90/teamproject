<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
	src="<%=application.getContextPath()%>/resources/javascript/offers.js"></script>
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
					
					<div class="d-flex">
						<div class="d-inlineblock">${content.writer}</div>
						<h1 class="d-inlineblock ml-auto">${content.price}</h1>
					</div>
					<hr/>
					
					<h1>${content.title}</h1>
					
					
					<!-- 이미지 -->
					<hr/>
					<img src="<%=application.getContextPath()%>${content.img}" width="500px" height="500px" 
					class="rounded" style="margin-left:30px; margin-right: 30px; margin-top:20px; margin-bottom: 30px;"/>
					<img src="<%=application.getContextPath()%>${content.img2}" width="500px" height="500px" 
					class="rounded" style="margin-right: 30px; margin-top:20px; margin-bottom: 30px;"/>
					<div class="space mb-3">${content.subtitle}</div>
					<div>${content.subcontent}</div>
					<hr/>
					<h4>상품 정보</h4>
					<h5>포함 사항</h5>
					<div class="space mb-5">${content.include}</div>
					<h5>불포함 사항</h5>
					<div class="space mb-5">${content.uninclude}</div>
					<h4>코스 소개</h4>
					<div class="space mb-5">${content.course}</div>
					<h4>추가 정보</h4>
					<div class="space mb-5">${content.addinfo}</div>
					<h5>만나는 시간</h5>
					<div class="space mb-5">${content.contacttime}</div>
					<h5>만나는 장소</h5>
					<div class="space mb-5">${content.contactplace}</div>
				</div>
				<script type="text/javascript">
				$("#sign_in_btn").click(()=>{		
					if($("#uemail").val() === ""){
						event.preventDefault();
						alert("로그인할 아이디를 입력하세요.");
						return;		
					}else if($("#upassword").val().length < 8 ){
						event.preventDefault();
						alert("비밀번호를 입력하세요.");
						return;		
					}else if($("#uemail").val() === ${userDto.uemail}){
						if($("#upassword").val() === ${userDto.upassword}){
							var con = confirm("어서오세요! 떠날곳을 찾아볼까요?.");
						} else {
							event.preventDefault();
							var con = confirm("입력하신 이메일과 비밀번호가 맞지 않습니다. 다시 확인하세요.");
							return;
						}
					} else {
					event.preventDefault();
					var con = alert("가입이력이 없는 이메일입니다.");
					return;
					}
				});
				
				</script>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>