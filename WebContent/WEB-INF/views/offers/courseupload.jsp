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
		<div class="mainCenter mt-5">
			<div class="content container">
				<div class="sector">
				<form method="post" enctype="multipart/form-data" action="courseupload" >
					<input class="form-control" type="hidden" id="offer_id" name="offer_id" value="${sessionOffer_id}">
					<div id="courselist"></div>
					
					<div class="d-flex">
						<a class="btn btn-primary btn-sm flex-fill" href="javascript:courseplus()">코스 추가</a>
						<input class="btn btn-info btn-sm flex-fill" type="submit" value="완료"><br/>
						<input class="btn btn-danger btn-sm flex-fill" type="reset" value="취소"><br/>
					</div>
				</form>
					
				</div>
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
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>