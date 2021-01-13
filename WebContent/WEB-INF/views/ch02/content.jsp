<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/main.css">
	</head>
	
	<body>
		<div class="wrap">
			<%-- 공통 헤더 --%>
			<jsp:include page="/WEB-INF/views/include/header.jsp"/> <!-- 실행을하고 결과를 넣는다. -->
			<%-- <%@ include file="/WEB-INF/views/include/header.jsp" %> --%> <!-- 복사를 하고 넣는다. -->
			
			<%-- 내용 --%>
			<div class="mainCenter">
				<%-- 공통 메뉴 --%>
				<jsp:include page="/WEB-INF/views/include/menu.jsp"/>
				<div class="content">
					
					<div class="sector">
						<h5>요청 매핑</h5>
						<div>
							GET 방식 : <a class="btn btn-info btn-sm" href="getMethod">request1</a>
							<br/><br/>
							POST 방식
							<form method="post" action="postMethod" style="display: inline-block;">
								<button class="btn btn-info btn-sm" >request2</button>
							</form>							
						</div>
					</div>
					
					<div class="sector">
						<h5>요청 방식별 처리</h5>
						<div>
							GET 방식 : <a class="btn btn-info btn-sm" href="join">회원가입</a>
						</div>
					</div>	
					
					<div class="sector">
						<h5>비동기 처리</h5>
						<div>
							GET 방식 : <a class="btn btn-info btn-sm" href="javascript:fun1()">회원가입</a>
							<script type="text/javascript">
								function fun1() {
									$.ajax({
										url: "joinAsync",
										method: "get",
										success: function(data) {
											$("#joinForm").html(data);
										}
									});
								};
							</script>
							<div id="joinForm"></div>
						</div>
					</div>	
					
								
				</div>
			</div>
		</div>
	</body>
</html>