<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
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
						<h2>회원정보</h2>					
							<form>
								<input type="hidden" id="member_id" name="member_id" value="${mstatus.member_id}"/>
									<ul>
										<li><label for="mimage">프로필 사진</label><br/>
											<c:if test="${mstatus.mimageoname != null}">
												<img class="rounded" src="mimage?memail=${mstatus.memail}" width="200px;"/>
											</c:if>
											<c:if test="${mstatus.mimageoname == null}">
												<img class="rounded" src="mimage?memail=${mstatus.memail}" width="200px;"/>
											</c:if>
										</li>
										
										<li><label for="mname">이름</label>
										<input type="text" value="${mstatus.mname}" id="mname" name="mname" readonly/>
										</li>
										
										<li><label for="memail">이메일</label>
				 						<input type="email" value="${mstatus.memail}" id="memail" name="memail" readonly/>
										</li>
										
										<li>
										<label for="mphone">전화번호</label>
										<input type="number" value="${mstatus.mphone}" id="mphone" name="mphone" readonly/>
										</li>
										
										<li>
										<div id="maccountnow">잔여 금액
										<input type="number" value="${mstatus.maccount}" name="maccountnow" readonly/>
										</div>
										<input type="number"  id="maccount" name="maccount" placeholder="충전 할 금액을 입력해주세요." /><br/>
										<a href="javascript:maccountupdate()">충전</a>
										</li>
										
										<li><label for="mdate">가입 날짜</label>
							   			 <input type="date" 
												value='<fmt:formatDate value="${mstatus.mjoin}" pattern="yyyy-MM-dd"/>'
												 readonly class="form-control" id="mdate" name="mdate"/>
										 </li>
										
									</ul>
									
									<a href="memberupdate?member_id=${mstatus.member_id}" class="btn btn-warning">수정</a>
									<a href="memberdelete?member_id=${mstatus.member_id}" class="btn btn-danger">탈퇴</a>
								
							</form>
							
						</div>
	
					</div>
					
					<script>
						function maccountupdate(){
							var maccount = $("#maccount").val();
							var member_id = $("#member_id").val();
							$.ajax({
								url:"maccountupdate",
								method:"get",
								data:{member_id,maccount},
								success: function(data){
									$("#maccountnow").html(data);
								}
								
							});
							
							
						}
					
					
					</script>
				<jsp:include page="/WEB-INF/views/include/footer.jsp" />
			</div>			
		</div>
	</body>
</html>