$(()=>{
// users.js 파일입니다. 위치 잘 확인하세요!
// 이곳부터 작성할것
	$("#sign_up_btn").click(()=>{		
		if($("#uemail").val() === ""){
			event.preventDefault();
			alert("사용하실 아이디를 입력하세요.");
			return;		
		}else if($("#upassword").val().length < 8 ){
			event.preventDefault();
			alert("8자 이상을 기입하세요.");
			return;	
		}else if ($("#upassword").val() !== $("#upassword_re").val()){
			event.preventDefault();
			alert("동일한 비밀번호를 입력하세요.");
			return;	
		}else if ($("#uname").val() === ""){
			event.preventDefault();
			alert("이름을 입력해주세요.");
			return;	
		}else if ($("#uagree_e1").prop("checked") === false){
			event.preventDefault();
			alert("필수약관을 동의하세요.");
			return;	
		}else if ($("#uagree_e2").prop("checked") === false){
			event.preventDefault();
			alert("필수약관을 동의하세요.");
			return;	
		} else {
			var con = confirm("가입을 축하합니다.");
		}
	});
	
	
	$("#sign_in_btn").click(()=>{		
		if($("#uemail").val() === ""){
			event.preventDefault();
			alert("로그인할 아이디를 입력하세요.");
			return;		
		}else if($("#upassword").val().length < 8 ){
			event.preventDefault();
			alert("비밀번호를 입력하세요.");
			return;
		}
	});
	
	$("#password_compare_btn").click(()=>{		
		if($("#email_compare").val() === ""){
			event.preventDefault();
			alert("비밀번호를 재설정 할 아이디를 입력하세요.");
			return;		
		}else if($("#name_compare").val() === ""){
			event.preventDefault();
			alert("가입한 이메일의 이름을 입력하세요.");
			return;
		}
	});
	
	
	
	$("#password_reset_btn").click(()=>{		
		if($("#password_reset1").val().length < 8 ){
			event.preventDefault();
			alert("8자 이상을 기입하세요.");
			return;		
		}else if ($("#password_reset2").val() !== $("#password_reset1").val()){
			event.preventDefault();
			alert("동일한 비밀번호를 입력하세요.");
			return;	
		} else {
			var con = confirm("비밀번호가 성공적으로 변경되었습니다.");
		}
	});

		
		$("#uagree_all").click(()=>{
			if($("#uagree_all").prop("checked") === true){
				$("#uagree_e1").prop("checked", true);
				$("#uagree_e2").prop("checked", true);
				$("#uagree_o1").prop("checked", true);
				$("#uagree_o2").prop("checked", true);
			} else {
				$("#uagree_e1").prop("checked", false);
				$("#uagree_e2").prop("checked", false);
				$("#uagree_o1").prop("checked", false);
				$("#uagree_o2").prop("checked", false);
			}
			
		});
		
	
//이곳까지 작성할것	
});

