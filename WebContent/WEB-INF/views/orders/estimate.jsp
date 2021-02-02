<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!-- <form method="post" enctype="multipart/form-data" action="courseupload" > -->
<div>
	<div class="input-group mb-3">
		<div class="input-group-prepend">
	    	<span class="input-group-text">총</span>
	    </div>
		<input class="form-control" type="number" id="ocost" name="ocost" value="${order.ocost}" readonly="readonly">
		<div class="input-group-append">
        	<span class="input-group-text">원</span>
     	</div>
    </div>
    <div class="d-flex">
		<input class="btn btn-info btn-sm flex-fill" type="submit" value="결제하기"><br/>
	</div>
	
</div>
<!-- </form> -->

