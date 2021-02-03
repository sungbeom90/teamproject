<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보 수정</title>
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
			<div class="mainCenter mt-5">
				<%-- 공통 메뉴 --%>
				<jsp:include page="/WEB-INF/views/include/menu.jsp"/>
				<div class="content container">					
					<div class="sector container user_in border rounded">
						<div class="alert alert-warning" role="alert">
								회원정보 수정
							</div>				
							<form name="memberupdateForm" method="post" action="memberupdate">
							<!-- 아무것도변경 사항 없을때 처리하기 -->
								<input type="hidden" name="member_id" value="${update.member_id}"/>
									<ul>
										<li>
											<label for="mimage">바꾸실 사진 주세요.</label><br/>
											<c:if test="${mstatus.mimageoname != null}">
												<img class="rounded" src="mimage?memail=${update.memail}" width="200px;"/>
											</c:if>
											<c:if test="${mstatus.mimageoname == null}">
												<img class="rounded" src="mimage?memail=${update.memail}" width="200px;"/>
											</c:if>
											
										</li>
										
										<li>
											<label for="mname">바꾸실 이름 주세요.</label><br/>
											<input type="text" value="${update.mname}" id="mname" name="mname"/>
										</li>
										
										<li>
											<label for="mpassword">바꾸실 비밀번호 주세요.</label><br/>
							 				<input type="password" id="mpassword" name="mpassword"/><br/>
							 				
							 				<label for="mpassword_re">바꾸실 비밀번호 다시 주세요.</label>	<br/>			
											<input type="password" id="mpassword_re" name="mpassword_re"/>
										</li>
										
										<li>
											<label for="mphone">바꾸실 전화번호 주세요.</label><br/>
					
											<input type="number" value="${update.mphone}" id="mphone" name="mphone"/>
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