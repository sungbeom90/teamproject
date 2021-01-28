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
						<input class="form-control" size="118px;" style=" border: none; " type="text" name="title" placeholder="제목"><br/>
						<hr/>
						<input class="form-control" size="118px;" style=" border: none; " type="text" name="subtitle" placeholder="부제목"><br/><br/>
						<!-- <input size="118px;" style=" border: none; " type="text" name="subcontent" placeholder="부제목의 내용을 입력하세요"><br/> -->
						 <textarea class="form-control" rows="10" cols="50" name="subcontent" placeholder="내용 입력" style="resize: none; border: none;"></textarea><br/>
						<hr/>
						<h4 style="margin-left: 0.6em ;">상품 정보</h4><br/>
						<h5 style="font-weight: bold; margin-left: 0.6em;">포함 사항</h5>
						<input class="form-control" size="118px;" style=" border: none; " type="text" name="include" placeholder="포함 사항을 입력하세요"><br/><br/>
						<h5 style="font-weight: bold; margin-left: 0.6em;">불포함 사항</h5>
						<input class="form-control" size="118px;" style=" border: none; " type="text" name="uninclude" placeholder="불포함 사항을 입력하세요"><br/>

						<input class="form-control" size="118px;" style=" border: none; " type="text" name="price" placeholder="가격을 입력하세요."><br/>

						<hr/>
						<hr/>
						<h5 style="font-weight: bold; margin-left: 0.6em;">추가 정보</h5>

						<input class="form-control" size="118px;" style=" border: none; " type="text" name="addinfo" placeholder="추가 정보를 입력하세요"><br/><br/>
						<h5 style="font-weight: bold; margin-left: 0.6em;">만나는 시간</h5>
						<input class="form-control" size="118px;" style=" border: none; " type="text" name="contacttime" placeholder="만나는 시간을 입력하세요"><br/><br/>
						<h5 style="font-weight: bold; margin-left: 0.6em;">만나는 장소</h5>
						<input class="form-control" size="118px;" style=" border: none; " type="text" name="contactplace" placeholder="만나는 장소를 입력하세요"><br/>
						<input style="margin-top: 20px;" type="file" name="offerPhoto"><br/>
						<input style="margin-top: 20px;" class="btn btn-danger btn-sm" type="reset" value="취소"/>
						
					</form>
						<form method="post" enctype="multipart/form-data" onsubmit="fun1()" >
						<h4 style="margin-left: 0.6em;">코스 소개</h4>
						<input size="118px;" style=" border: none;" type="text" name="cplace" placeholder="코스  장소를 입력하세요"><br/>
						<textarea class="form-control" rows="10" cols="50" name="cdetail" placeholder="코스  설명을 입력하세요" style="resize: none; border: none;"></textarea><br/>
						<input style="margin-top: 20px;" type="file" name="offerPhoto"><br/>
						<input style="margin-top: 20px;" class="btn btn-primary btn-sm" type="submit" value="저장"/>
						</form>	
						
					

				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>