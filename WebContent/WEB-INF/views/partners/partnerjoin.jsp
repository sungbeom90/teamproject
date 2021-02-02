<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>파트너 등록</title>
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
						<h2>파트너 등록</h2>					
							<form name="partnerJoinForm" method="post" action="partnerjoin">
								<label for="pname">별명주세요.</label>
								<input type="text" id="pname" name="pname" placeholder="사용하실 닉네임을 주세요."><br/>
								
								<label for="location_name">지역주세요.</label>
								<input type="text" id="location_name" name="location_name" placeholder="지역주세요.">
								
								<ul class="navbar-nav">
									<li class="nav-item dropdown">
										<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
										지역 고르기</a>
										<div class="dropdown-menu">
											<a class="dropdown-item" href="#">뉴욕</a>
											<a class="dropdown-item" href="#">하와이</a>
											<a class="dropdown-item" href="#">오키나와</a>
											<a class="dropdown-item" href="#">후쿠오카</a>
											<a class="dropdown-item" href="#">바르셀로나</a>
											<a class="dropdown-item" href="#">세비야</a>
											<a class="dropdown-item" href="#">부산</a>
											<a class="dropdown-item" href="#">속초</a>
										</div>
									</li>
								</ul>
								
								<%-- <fmt:formatDate value="${pdate.pjoin}" pattern="yyyy-MM-dd"/><br/> --%>
								
								<button>등록하기</button>
							</form>
							
						</div>
	
					</div>
				<jsp:include page="/WEB-INF/views/include/footer.jsp" />
			</div>			
		</div>
	</body>
</html>