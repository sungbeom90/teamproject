$(()=>{
// users.js 파일입니다. 위치 잘 확인하세요!
// 이곳부터 작성할것
	//sign_up_js 다시 손봐야함
	$("#sign_up_btn").click(function () {
		
		if($(".sign_up_name").val() === ""){
			alert("한 글자 이상을 기입하세요.");
			 consol
		}else if($(".sign_up_email").val() === ""){
			alert("사용하실 아이디를 입력하세요.");
			
		}else if($(".sign_up_password").val().length < 8 ){
			alert("8자 이상을 기입하세요.");
	
		}else if ($(".sign_up_password").val() !== $(".sign_up_password_ok").val()){
			alert("동일한 비밀번호를 입력하세요.");
	
		}else {
			var con = confirm("가입을 축하합니다.");
			if(con === true){
				location.href="sign_up_success"
			}
		}
	});

			
			
		$(".sign_up_allagree").click(()=>{
			if($(".sign_up_allagree").prop("checked") !== true){
				$(".sign_up_check").prop("checked", false);
			} else {
				$(".sign_up_check").prop("checked", true);
			}
			
		});


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