<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>파트너 정보 수정</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/main.css">
		<script	src="<%=application.getContextPath()%>/resources/javascript/users.js"></script>
	</head>
	
	<body>
		<div class="wrap">
			<%-- 공통 헤더 --%>
			<jsp:include page="/WEB-INF/views/include/header.jsp"/> 
			
			<%-- 내용 --%>
			<div class="mainCenter">
				<%-- 공통 메뉴 --%>
				<jsp:include page="/WEB-INF/views/include/menu.jsp"/>
				<div class="content container">					
					<div class="sector container user_in border rounded">
						<h2>파트너 정보 수정</h2>					
							<form name="memberupdateForm" method="post" action="memberupdate">
							<!-- 아무것도변경 사항 없을때 처리하기 -->
								<input type="hidden" name="partner_id" value="${partner.member_id}"/>
									<ul>
										
										<li>
											<label for="pname">바꾸실 닉네임 주세요.</label>
											<input type="text" value="${partner.pname}" id="pname" name="pname"/>
										</li>
										
										
										<li>
											<label for="location_name">지역주세요.</label>
											<input type="text" value="${partner.location_id}" id="location_name" name="location_name">
										</li>
									</ul>
									<button class="btn btn-info btn-sm">수정하기</button>
								
							</form>
							
						</div>
	
					</div>
				<jsp:include page="/WEB-INF/views/include/footer.jsp" />
			</div>			
		</div>
	</body>
</html>