<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<header class="container">
	<nav
		class="navbar navbar-expand-sm bg-light navbar-light justify-content-end">
		<!-- Brand -->
		<a class="navbar-brand mr-auto" href="<%=application.getContextPath()%>/main">
			<img src="../data/myrealtrip.png" alt="logo" style="width: 10rem;">
		</a>

		<!-- Links -->
		<ul class="navbar-nav">
			<c:if test="${loginStatus == null}">
				<li class="nav-item"><a class="nav-link" href="<%=application.getContextPath()%>/users/sign_up">회원가입</a></li>
				<li class="nav-item"><a class="nav-link" href="<%=application.getContextPath()%>/users/sign_in">로그인</a></li>
			</c:if>
			<c:if test="${loginStatus != null}">
				<!-- Dropdown -->
				<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
						<img src="<%=application.getContextPath()%>/resources/img/myphoto.png" width="50px"/>
					</a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="<%=application.getContextPath()%>/users/logout">로그아웃</a>
						<a class="dropdown-item" href="<%=application.getContextPath()%>/register/content">상품등록</a>
					</div>
				</li>
			</c:if>
		</ul>
	</nav>
	<br /> <br /> <br />
</header>
