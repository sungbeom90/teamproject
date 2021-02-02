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
					<input class="form-control" type="hidden" id="offer_id" name="offer_id" value="${sessionOffer_id}">					
					<div id="courselist">					
						<c:forEach var="course" items="${courseList}">
							<div>
								<input class="form-control" type="number" id="course_no_array[${course.course_no}]" name="course_no_array[${course.course_no}]" value="${course.course_no}" readonly="readonly"><br/>
								<input class="form-control" type="text" id="cplace_array[${course.course_no}]" name="cplace_array[${course.course_no}]" value="${course.cplace}"><br/>
								<input class="form-control" type="text" id="cdetail_array[${course.course_no}]" name="cdetail_array[${course.course_no}]" value="${course.cdetail}"><br/>
								<input class="form-control" type="text" id="ctime_array[${course.course_no}]" name="ctime_array[${course.course_no}]" value="${course.ctime}"><br/>
								<div id="${course.cimageoname}" style="display:flex; align-items:center; margin-bottom:5px;">					
									<img src="../offer3/cimage?offer_id=${course.offer_id}&cimageoname=${course.cimageoname}" alt="${course.cimageoname}" width="40px" height="40px" class="rounded-circle" style="margin-left:30px; margin-right: 30px; margin-top:20px; margin-bottom: 30px;"/>
									<a href="javascript:cimagedelete('${course.cimageoname}')">삭제</a>
								</div>
								<input class="form-control" type="file" id="cimage_array[${course.course_no}]" name="cimage_array[${course.course_no}]" placeholder="첨부파일${course.course_no}"><br/>
							</div>				
						</c:forEach>								
					</div>
					<button class="btn btn-info btn-sm">완료</button>
				</form>
				<script type="text/javascript">
							function cimagedelete (cimageoname) {
								var offer_id = $("#offer_id").val();							
								$.ajax({
									url: "cimagedelete",
									method: "get",
									data:{offer_id,cimageoname},
									success: function(data){
										$("div[id='" + cimageoname + "']").remove();
									}
								});
							};
					</script>					
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
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>