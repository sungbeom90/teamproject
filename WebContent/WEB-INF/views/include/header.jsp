<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<header class="container">	
		<nav class="navbar navbar-expand-lg bg-light navbar-light">
			<a class="navbar-brand" href="main.html"> <img
				src="../data/myrealtrip.png" alt="logo" style="width: 10rem;"></a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavbar">
				<ul class="navbar-nav flex-direction:column">
					<c:if test="${loginStatus == null}">
						<li class="nav-item logOff"><a class="nav-link"
							href="join.html">회원가입</a></li>
						<li class="nav-item logOff"><a class="nav-link"
							href="login.html">로그인</a></li>
					</c:if>
					<c:if test="${loginStatus != null}">
						<li class="nav-item logOn"><a class="nav-link" href="#">로그아웃</a></li>
						<li class="nav-item logOn"><a class="nav-link" href="#">내정보</a></li>
						<li class="nav-item logOn"><a class="nav-link"
							href="register.html">상품등록</a></li>
					</c:if>
				</ul>
			</div>
		</nav>
		<br/> <br/> <br/>
</header>
