<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!-- <form method="post" enctype="multipart/form-data" action="courseupload" > -->
<div>
	<div class="input-group mb-3">
		<div class="input-group-prepend">
			<span class="input-group-text">코스번호</span>
		</div>
		<input class="form-control" type="number" id="course_no_array[${sessionNo}]" name="course_no_array[${sessionNo}]" value="${sessionNo}" readonly="readonly"><br/>
	</div>
	<div class="input-group mb-3">
		<div class="input-group-prepend">
			<span class="input-group-text">코스위치</span>
		</div>
	<input class="form-control" type="text" id="cplace_array[${sessionNo}]" name="cplace_array[${sessionNo}]" placeholder="코스위치${sessionNo}를 입력해주세요.">
	</div>
	<div class="input-group mb-3">
		<div class="input-group-prepend">
			<span class="input-group-text">코스설명</span>
		</div>
	<input class="form-control" type="text" id="cdetail_array[${sessionNo}]" name="cdetail_array[${sessionNo}]" placeholder="코스설명${sessionNo}를 입력해주세요.">
	</div>
	<div class="input-group mb-3">
		<div class="input-group-prepend">
			<span class="input-group-text">코스소요시간</span>
		</div>
	<input class="form-control" type="text" id="ctime_array[${sessionNo}]" name="ctime_array[${sessionNo}]" placeholder="코스소요시간${sessionNo}을 입력해주세요.">
	</div>
	<div class="input-group mb-3">
		<div class="input-group-prepend">
			<span class="input-group-text">코스이미지</span>
		</div>
	<input class="form-control" type="file" id="cimage_array[${sessionNo}]" name="cimage_array[${sessionNo}]" placeholder="첨부파일${sessionNo}을 입력해주세요.">
	</div>
</div>
<!-- </form> -->

