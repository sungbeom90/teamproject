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
					<form method="post" enctype="multipart/form-data" action="offerupload">
								<input style=" border: none; " type="text" name="utitle" placeholder="제목"><br/>
								<hr/>
								<input style=" border: none; " type="text" name="usubtitle" placeholder="부제목"><br/>
								<input style=" border: none; " type="text" name="usubcontents" placeholder="부제목의 내용을 입력하세요"><br/>
								<hr/>
								<h4 style="margin-left: 0.6em ;">상품 정보</h4>
								<h5 style="font-weight: bold; margin-left: 0.6em;">포함 사항</h5>
								<input style=" border: none; " type="text" name="uinclude" placeholder="포함 사항을 입력하세요"><br/>
								<h5 style="font-weight: bold; margin-left: 0.6em;">불포함 사항</h5>
								<input style=" border: none; " type="text" name="uuninclude" placeholder="불포함 사항을 입력하세요"><br/>
								<hr/>
								<h4 style="margin-left: 0.6em;">코스 소개</h4>
								<input style=" border: none; " type="text" name="ucourse" placeholder="코스 내용을 입력하세요"><br/>
								<hr/>
								<h5 style="font-weight: bold; margin-left: 0.6em;">추가 정보</h5>
								<input style=" border: none; " type="text" name="uaddinfo" placeholder="추가 정보를 입력하세요"><br/>
								<input type="file" name="uphoto"><br/>
								<input class="btn btn-danger btn-sm" type="reset" value="취소"/>
								<input class="btn btn-primary btn-sm" type="submit" value="저장"/>
					</form>	
	
						<!-- <h1>register 필드</h1>
						<h2>ch03, ch06, ch09를 참고하여 파일 등록 구현하자</h2>
						<h2>제목,본문 내용은 필수로 받자</h2>
						<h2>글쓴이와 날짜는 자동으로 저장되도록 구현해보자</h2>
						<h2>사진은 ch09를 적용해보자</h2>
						<h2>등록 완료 이후에는 ch06 리다이렉트를 적용하여 상품페이지로 돌아가보자</h2> -->					
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>