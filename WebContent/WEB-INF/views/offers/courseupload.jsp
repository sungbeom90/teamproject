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
	src="<%=application.getContextPath()%>/resources/javascript/register.js"></script>
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
				<form method="post" enctype="multipart/form-data" action="courseupload" >
					<input class="form-control" type="hidden" id="offer_id" name="offer_id" value="${sessionOffer_id.offer_id}">
					<div id="courselist">					
					</div>
					<button class="btn btn-info btn-sm">완료</button>
				</form>
					
				</div>					
					
				<div class="sector">
					<a class="btn btn-info btn-sm" href="javascript:courseplus()">코스 추가</a>
					<div>
						<script type="text/javascript">
							function courseplus(){
								$.ajax({
									url: "courseplus",
									method: "get",
									success: function(data){
										$("#courselist").append(data);
									}
								});
							};
						</script>
					</div>	
			
						<!-- <form method="post" enctype="multipart/form-data" onsubmit="fun1()" >
						<h4 style="margin-left: 0.6em;">코스 소개</h4>
						<input size="118px;" style=" border: none;" type="text" name="cplace" placeholder="코스  장소를 입력하세요"><br/>
						<textarea class="form-control" rows="10" cols="50" name="cdetail" placeholder="코스  설명을 입력하세요" style="resize: none; border: none;"></textarea><br/>
						<input style="margin-top: 20px;" type="file" name="offerPhoto"><br/>
						<input style="margin-top: 20px;" class="btn btn-primary btn-sm" type="submit" value="저장"/>
						</form>	 -->
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>