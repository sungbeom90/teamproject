<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="mainHeader">
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

<header>
		<div class="container-sm">
			<nav class="navbar navbar-expand-lg bg-light navbar-light">
				<a class="navbar-brand" href="main.html"> <img src="../data/myrealtrip.png"
					alt="logo" style="width: 10rem;"></a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#collapsibleNavbar">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="collapsibleNavbar">
					<ul class="navbar-nav">
						<li class="nav-item logOff"><a class="nav-link" href="join.html">회원가입</a></li>
						<li class="nav-item logOff"><a class="nav-link" href="login.html">로그인</a></li>
						<li class="nav-item logOn"><a class="nav-link" href="#">로그아웃</a></li>
						<li class="nav-item logOn"><a class="nav-link" href="#">내정보</a></li>
						<li class="nav-item logOn"><a class="nav-link" href="register.html">상품등록</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</header>