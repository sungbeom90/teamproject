<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
					<form method="post" enctype="multipart/form-data" action="offerupdate" >
						<input class="form-control" type="hidden" id="offer_id" name="offer_id" value="${offer.offer_id}">
						<input class="form-control" type="hidden" id="partner_id" name="partner_id" value="${offer.partner_id}">
						<input class="form-control" type="text" id="otitle" name="otitle" value="${offer.otitle}"><br/>
						<input class="form-control" type="text" id="osubtitle" name="osubtitle" value="${offer.osubtitle}"><br/>
						<input class="form-control" type="number" id="oprice" name="oprice" value="${offer.oprice}"><br/>
						<textarea  class="form-control" rows="10" cols="50" id="obody" name="obody">${offer.obody}</textarea><br/>
						<input class="form-control" type="text" id="oinclude" name="oinclude" value="${offer.oinclude}"><br/>
						<input class="form-control" type="text" id="ouninclude" name="ouninclude" value="${offer.ouninclude}"><br/>						
						<input class="form-control" type="text" id="oplace_meet" name="oplace_meet" value="${offer.oplace_meet}"><br/>
						<input class="form-control" type="text" id="otime_meet" name="otime_meet" value="${offer.otime_meet}"><br/>
						<c:forEach var="image" items="${imageList}">
							<div id="${image.iimageoname}" style="display:flex; align-items:center; margin-bottom:5px;">					
								<img src="../offer/oimage?offer_id=${offer.offer_id}&iimageoname=${image.iimageoname}" alt="${image.iimageoname}" width="40px" height="40px" class="rounded-circle" style="margin-left:30px; margin-right: 30px; margin-top:20px; margin-bottom: 30px;"/>
								<a href="javascript:oimagedelete('${image.iimageoname}')">삭제</a>
							</div>			
						</c:forEach>
						<input class="form-control" type="file" id="offerImage" name="offerImage" placeholder="첨부파일" multiple><br/>
						<input class="btn btn-info btn-sm" type="submit" value="입력"><br/>
						<input class="btn btn-danger btn-sm" type="reset" value="취소"><br/>
					</form>
					<script type="text/javascript">
							function oimagedelete (iimageoname) {
								var offer_id = $("#offer_id").val();							
								$.ajax({
									url: "oimagedelete",
									method: "get",
									data:{offer_id,iimageoname},
									success: function(data){
										$("div[id='" + iimageoname + "']").remove();
									}
								});
							};
					</script>
				</div>
			</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</div>
</body>
</html>