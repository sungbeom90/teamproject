$(()=>{
	//상품 페이지 타이틀
	$("#title_link").load("../data/package/newyork/package1.txt #link_country,#link_city");
	$("#title_name").load("../data/package/newyork/package1.txt h1");
	
	$("#main_img").load("../data/package/newyork/package1.txt .contents");
	$("#package_description").load("../data/package/newyork/package1.txt #description_title,#description_body");
	$("#package_infomation").load("../data/package/newyork/package1.txt #infomation_body");
	$("#package_adguide").load("../data/package/newyork/package1.txt #adguide_body");
	$("#package_cost").load("../data/package/newyork/package1.txt #cost");
	$("#package_wish").load("../data/package/newyork/package1.txt #wish");
    
	
	
					
});