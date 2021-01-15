<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="mainHeader">
	<h3>Spring Framework</h3>
	<div class="loginBox">
		<div>
			<c:if test="${loginStatus == null}">
				<div>
					<form method="post" action="<%=application.getContextPath()%>/ch08/login">
						<input type="text" name="uid" placeholder="아이디"/><br/>
						<input type="password" name="upassword" placeholder="비밀번호"/><br/>
						<button class="btn btn-success btn-sm">로그인</button>
					</form>
				</div>
			</c:if>
			<c:if test="${loginStatus != null}">
				<div>
					<img src="<%=application.getContextPath()%>/resources/img/myphoto.png" width="50px"/>
					<a class="btn btn-danger btn-sm" href="<%=application.getContextPath()%>/ch08/logout">로그아웃</a>
				</div>
			</c:if>
		</div>		
	</div>
</div>