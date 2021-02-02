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
									<a class="btn btn-success btn-sm" href="<%=application.getContextPath()%>/memberstest/login">로그인</a>
									<a class="btn btn-success btn-sm" href="<%=application.getContextPath()%>/memberstest/join">회원가입</a>
								</div>						
						</c:if>
						<c:if test="${loginStatus != null}">
							<li class="nav-item dropdown">
									<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
									<img src="<%=application.getContextPath()%>/memberstest/mimage" width="50px">
									<span>프로필</span>
									</a>
								<div class="dropdown-menu">
									<a class="btn btn-danger btn-sm" href="<%=application.getContextPath()%>/memberstest/logout">로그아웃</a>
									<c:if test="${partnerId == null}">
										<a class="btn btn-primary btn-sm" href="<%=application.getContextPath()%>/partners/partnerjoin">파트너 등록</a>
										</c:if>
										<c:if test="${partnerId != null}">
										<a class="btn btn-primary btn-sm" href="<%=application.getContextPath()%>/partners/partnerstatus">파트너 정보</a>
									</c:if>
									<a class="btn btn-info btn-sm" href="<%=application.getContextPath()%>/memberstest/memberstatus">회원정보</a>
									<a class="dropdown-item" href="<%=application.getContextPath()%>/offer3/offerupload">상품등록</a>
								</div>
							</li>
						</c:if>
					</ul>
		
	</nav>
	<br /> <br /> <br />
</header>
