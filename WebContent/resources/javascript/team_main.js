$(()=>{
	//로그인상태
	$("#login").click(()=>{
		$(".logOn").show();
		$(".logOff").hide();					
	});
	
	//로그아웃상태
	$("#logout").click(()=>{
		$(".logOff").show();
		$(".logOn").hide();			
	});	
	
	//메인페이지 도시 불러오기
	$("#city1_img").load("../data/city/busan/busan.txt #link_img");
	$("#city1_text").load("../data/city/busan/busan.txt h4,h5");
	$("#city2_img").load("../data/city/barcelona/barcelona.txt #link_img");
	$("#city2_text").load("../data/city/barcelona/barcelona.txt h4,h5");
	$("#city3_img").load("../data/city/okinawa/okinawa.txt #link_img");
	$("#city3_text").load("../data/city/okinawa/okinawa.txt h4,h5");
	$("#city4_img").load("../data/city/newyork/newyork.txt #link_img");
	$("#city4_text").load("../data/city/newyork/newyork.txt h4,h5");
	
	    
	//메인페이지 상품 불러오기    
    $("#package1_img").load("../data/package/busan/package1.txt #link_img");
	$("#package1_text").load("../data/package/busan/package1.txt h5");
	$("#package2_img").load("../data/package/barcelona/package1.txt #link_img");
	$("#package2_text").load("../data/package/barcelona/package1.txt h5");
	$("#package3_img").load("../data/package/okinawa/package1.txt #link_img");
	$("#package3_text").load("../data/package/okinawa/package1.txt h5");
	$("#package4_img").load("../data/package/newyork/package1.txt #link_img");
	$("#package4_text").load("../data/package/newyork/package1.txt h5");	
    
    //메인페이지 나라 필터링
    $("#input_country").on("keyup", function() {
    	var value = $(this).val().toLowerCase();
   		$("#all_country *").filter(function() {
      		$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    	});
  	});
  
	//메인페이지 도시 필터링  
  	$("#input_city").on("keyup", function() {
    	var value = $(this).val().toLowerCase();
    	$("#all_city *").filter(function() {
      		$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    	});
	});
	
	//회사정보 불러오기
	 $("#service").load("../data/customer_service.txt");
	 $("#information").load("../data/company_information.txt");					
});