$(()=>{
// packages.js 파일입니다. 위치 잘 확인하세요!
// 이곳부터 작성할것

//예시 함수
		$(function(){
			$.ajax({
				url: "photolist",
				method: "get",
				success: function(data){
					$("#photoList").html(data);
				}
			});
	});
	
	
//이곳까지 작성할것	
});