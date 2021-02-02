<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!-- <form method="post" enctype="multipart/form-data" action="courseupload" > -->
<div>
	<span>${order.odate_meet}</span>
	<hr/>
	<span>${order.opeople}</span>
	<hr/>
	<span>${order.oprice}</span>
	<hr/>
	<input class="form-control" type="number" id="ocost" name="ocost" value="${order.ocost}" readonly="readonly"><br/>
	<input class="btn btn-info btn-sm" type="submit" value="결제하기"><br/>
</div>
<!-- </form> -->

