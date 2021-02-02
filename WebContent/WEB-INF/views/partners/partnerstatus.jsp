<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>파트너 정보</title>
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
						<h2>파트너 정보</h2>					
							<form>
								<input type="hidden" id="partner_id" name="partner_id" value="${partner.partner_id}"/>
									<ul>
										
										<li>
											<label for="pname">닉네임</label>
											<input type="text" value="${partner.pname}" id="pname" name="pname" readonly/>
										</li>
										
										<li>
											<label for="lname">활동 지역</label>
											<input type="text" value="${partner.lname}" id="lname" name="lname" readonly/>
										</li>
										
										<li>
											<label for="paccountnow">잔여 금액</label>
											<input type="number" value="${partner.paccount}" name="paccountnow" readonly/>
										</li>
										
										<li>
											<label for="pjoin">가입 날짜</label>
								   			 <input type="date"
													value='<fmt:formatDate value="${partner.pjoin}" pattern="yyyy-MM-dd"/>'
													 readonly class="form-control" id="pjoin" name="pjoin"/>
										 </li>
										
									</ul>
									
									<a href="partnerupdate?partner_id=${partner.partner_id}" class="btn btn-warning">파트너 정보 수정</a>
									<a href="partnerdelete?partner_id=${partner.partner_id}" class="btn btn-danger">파트너 그만하기</a>
								
							</form>
							
						</div>
	
					</div>
				<jsp:include page="/WEB-INF/views/include/footer.jsp" />
			</div>			
		</div>
	</body>
</html>