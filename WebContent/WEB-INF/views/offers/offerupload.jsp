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
					<form method="post" enctype="multipart/form-data" action="offerupload" >
						<input class="form-control" type="text" id="otitle" name="otitle" placeholder="제목"><br/>
						<input class="form-control" type="text" id="osubtitle" name="osubtitle" placeholder="부제목"><br/>
						<input class="form-control" type="number" id="oprice" name="oprice" placeholder="가격"><br/>
						<textarea  class="form-control" rows="10" cols="50" id="obody" name="obody" placeholder="본문"></textarea><br/>
						<input class="form-control" type="text" id="oinclude" name="oinclude" placeholder="포함사항"><br/>
						<input class="form-control" type="text" id="ouninclude" name="ouninclude" placeholder="불포함사항"><br/>						
						<input class="form-control" type="text" id="oplace_meet" name="oplace_meet" placeholder="만나는 장소"><br/>
						<input class="form-control" type="text" id="otime_meet" name="otime_meet" placeholder="만나는 시간"><br/>
						<input class="form-control" type="file" id="offerImage" name="offerImage" placeholder="첨부파일" multiple><br/>
						<input class="btn btn-info btn-sm" type="submit" value="입력"><br/>
						<input class="btn btn-danger btn-sm" type="reset" value="취소"><br/>
					</form>
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>