$(()=>{
		$(function(){
			$.ajax({
				url: "photolist",
				method: "get",
				success: function(data){
					$("#photoList").html(data);
				}
			});
		});
});