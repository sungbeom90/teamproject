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
		<div class="mainCenter mt-5">
			<div class="content container">
				<div class="sector">
					<form method="post" enctype="multipart/form-data" action="offerupdate" >
						<input class="form-control" type="hidden" id="offer_id" name="offer_id" value="${offer.offer_id}">
						<input class="form-control" type="hidden" id="partner_id" name="partner_id" value="${offer.partner_id}">
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">제목</span>
							</div>
							<input class="form-control" type="text" id="otitle" name="otitle" value="${offer.otitle}">
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">부제목</span>
							</div>
						<input class="form-control" type="text" id="osubtitle" name="osubtitle" value="${offer.osubtitle}">
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">가격</span>
							</div>
						<input class="form-control" type="number" id="oprice" name="oprice" value="${offer.oprice}">
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">본문</span>
							</div>
						<textarea  class="form-control" rows="10" cols="50" id="obody" name="obody">${offer.obody}</textarea>
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">포함사항</span>
							</div>
						<input class="form-control" type="text" id="oinclude" name="oinclude" value="${offer.oinclude}">
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">불포함사항</span>
							</div>
						<input class="form-control" type="text" id="ouninclude" name="ouninclude" value="${offer.ouninclude}">
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">만나는 장소</span>
							</div>
						<input class="form-control" type="text" id="oplace_meet" name="oplace_meet" value="${offer.oplace_meet}">
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">만나는 시간</span>
							</div>
						<input class="form-control" type="text" id="otime_meet" name="otime_meet" value="${offer.otime_meet}">
						</div>
						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">이미지</span>
							</div>
							<div class="d-flex align-items-center">
								<c:forEach var="image" items="${imageList}">
									<div class="flex-fill ml-2" id="${image.iimageoname}">					
										<img src="oimage?offer_id=${offer.offer_id}&iimageoname=${image.iimageoname}" alt="${image.iimageoname}"
										class="Thumbnail" style="width: 5rem; height: 5rem"/>
										<a href="javascript:oimagedelete('${image.iimageoname}')">삭제</a>
									</div>			
								</c:forEach>
							</div>
						</div>

						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<span class="input-group-text">첨부파일</span>
							</div>
						<input class="form-control" type="file" id="offerImage" name="offerImage" placeholder="첨부파일" multiple><br/>
						</div>
						<div class="d-flex">
							<input class="btn btn-info btn-sm flex-fill" type="submit" value="수정"><br/>
							<input class="btn btn-danger btn-sm flex-fill" type="reset" value="취소"><br/>
						</div>
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