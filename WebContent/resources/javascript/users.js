$(()=>{
// users.js 파일입니다. 위치 잘 확인하세요!
// 이곳부터 작성할것


	//회원가입
		$("#join_btn").click(()=>{		
			if($("#memail").val() === ""){
				event.preventDefault();
				alert("사용하실 아이디를 입력하세요.");
				return;		
			}else if($("#mpassword").val().length < 8 ){
				event.preventDefault();
				alert("8자 이상을 기입하세요.");
				return;	
			}else if ($("#mpassword").val() !== $("#mpassword_re").val()){
				event.preventDefault();
				alert("동일한 비밀번호를 입력하세요.");
				return;	
			}else if ($("#mname").val() === ""){
				event.preventDefault();
				alert("이름을 입력해주세요.");
				return;	
			}else if ($("#aessence1").prop("checked") === false){
				event.preventDefault();
				alert("필수약관을 동의하세요.");
				return;	
			}else if ($("#aessence2").prop("checked") === false){
				event.preventDefault();
				alert("필수약관을 동의하세요.");
				return;	
			} else {
				var con = confirm("가입을 축하합니다.");
			}
		});
		
		$("#uagree_all").click(()=>{
			if($("#uagree_all").prop("checked") === true){
				$("#aessence1").prop("checked", true);
				$("#aessence2").prop("checked", true);
				$("#aoption1").prop("checked", true);
				$("#aoption2").prop("checked", true);
				$("#apartner").prop("checked", true);
			} else {
				$("#aessence1").prop("checked", false);
				$("#aessence2").prop("checked", false);
				$("#aoption1").prop("checked", false);
				$("#aoption2").prop("checked", false);
				$("#apartner").prop("checked", false);
			}
			
		});
		
		

		
		//로그인 파트
		function login(){
			// 유효성 검사
			event.preventDefault();
			//에러 메세지 초기값 설정
			$("#errorEmail").html("");
			$("#errorPassword").html("");
			//입력값 설정
			var check = true;
			
			const memail = $("#memail").val();
			if(memail === ""){
				$("#errorEmail").html("이메일 주세요.");
				check = false;
			}
			
			const mpassword = $("#mpassword").val();
			if(mpassword === ""){
				$("#errorPassword").html("비밀번호 주세요.");
				check = false;
			}
			
			if(!check){
				return;
			}
			
				$.ajax({
					url:"login",
					method:"post",
					//id값에 상응하는 data를 보내줘야한다.
					data:{memail, mpassword},
					success:function(data){
						if(data.login === "loginSuccess"){
							alert("로그인 성공");
							location.href="content";
						}else if(data.login === "emptyEmail"){
							$("#errorEmail").html("이메일이 없어요.");
						}else{
							$("#errorPassword").html("비밀번호가 달라요.");
							
						}
					}
				});
			}

	
	
	$("#sign_in_btn").click(()=>{		
		if($("#uemail").val() === ""){
			event.preventDefault();
			alert("로그인할 아이디를 입력하세요.");
			return;		
		}else if($("#upassword").val().length < 8 ){
			event.preventDefault();
			alert("비밀번호를 입력하세요.");
			return;
		}else {
			var con = confirm("로그인이 성공적으로 되었습니다.");
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
		}else {
			var con = confirm("인증되었습니다. 변경하실 비밀번호를 입력하세요.");
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

		
		
		
	
//이곳까지 작성할것	
});


