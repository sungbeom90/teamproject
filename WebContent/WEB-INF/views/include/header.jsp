<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<header class="container">
	<nav class="navbar navbar-expand-sm bg-light navbar-light justify-content-end fixed-top">
		<!-- Brand -->
		<a class="navbar-brand mr-auto" href="<%=application.getContextPath()%>/main/content">
			<img src="<%=application.getContextPath()%>/resources/img/logo_header.jpg" alt="logo" style="width: 10rem;">
		</a>

		<!-- Links -->
		
		<ul class="navbar-nav">
						<c:if test="${loginStatus == null}">
								<div>
									<a class="btn btn-outline-success btn-sm" href="<%=application.getContextPath()%>/members/login">로그인</a>
									<a class="btn btn-outline-success btn-sm" href="<%=application.getContextPath()%>/members/join">회원가입</a>
								</div>						
						</c:if>
						<c:if test="${loginStatus != null}">
							<li class="nav-item dropdown">
									<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
									<img class="rounded" src="<%=application.getContextPath()%>/members/mimage" width="75px;" height="75px">
									<span>프로필</span>
									</a>
								<div class="dropdown-menu">
									<a class="btn btn-outline-danger btn-sm" href="<%=application.getContextPath()%>/members/logout">로그아웃</a>
									<a class="btn btn-outline-info btn-sm" href="<%=application.getContextPath()%>/members/memberstatus">회원정보</a>
									<a class="btn btn-outline-primary btn-sm" href="<%=application.getContextPath()%>/partners/partnerjoin">파트너 등록</a>
									<a class="btn btn-outline-primary btn-sm" href="<%=application.getContextPath()%>/partners/partnerstatus">파트너 정보</a>
									<a class="btn btn-outline-info btn-sm" href="<%=application.getContextPath()%>/order/orderlist">주문내역</a>
									<a class="btn btn-outline-info btn-sm" href="<%=application.getContextPath()%>/offer/offerupload">상품등록</a>
								</div>
							</li>
						</c:if>
					</ul>
		
	</nav>
	<br /> <br /> <br />
</header>
