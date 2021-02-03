package com.mycompany.teamproject.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class OfferDto {
	// 데이터베이스 컬럼 필드
	private int offer_id;
	private String otitle;
	private String osubtitle;
	private int oprice;
	private String obody;
	private String oinclude;
	private String ouninclude;
	private String oplace_meet;
	private String otime_meet;
	private int partner_id;
		
	// 브라우저 -> form -> 컨트롤러 매개변수로 쓰이는 필드
	private MultipartFile[] offerImage;
	private List<CourseDto> courseList;
	
	// 컨트롤러 -> 브라우저 매개변수로 쓰이는 필드
	private int member_id;


	public int getOffer_id() {
		return offer_id;
	}


	public void setOffer_id(int offer_id) {
		this.offer_id = offer_id;
	}


	public String getOtitle() {
		return otitle;
	}


	public void setOtitle(String otitle) {
		this.otitle = otitle;
	}


	public String getOsubtitle() {
		return osubtitle;
	}


	public void setOsubtitle(String osubtitle) {
		this.osubtitle = osubtitle;
	}


	public int getOprice() {
		return oprice;
	}


	public void setOprice(int oprice) {
		this.oprice = oprice;
	}


	public String getObody() {
		return obody;
	}


	public void setObody(String obody) {
		this.obody = obody;
	}


	public String getOinclude() {
		return oinclude;
	}


	public void setOinclude(String oinclude) {
		this.oinclude = oinclude;
	}


	public String getOuninclude() {
		return ouninclude;
	}


	public void setOuninclude(String ouninclude) {
		this.ouninclude = ouninclude;
	}


	public String getOplace_meet() {
		return oplace_meet;
	}


	public void setOplace_meet(String oplace_meet) {
		this.oplace_meet = oplace_meet;
	}


	public String getOtime_meet() {
		return otime_meet;
	}


	public void setOtime_meet(String otime_meet) {
		this.otime_meet = otime_meet;
	}


	public int getPartner_id() {
		return partner_id;
	}


	public void setPartner_id(int partner_id) {
		this.partner_id = partner_id;
	}


	public MultipartFile[] getOfferImage() {
		return offerImage;
	}


	public void setOfferImage(MultipartFile[] offerImage) {
		this.offerImage = offerImage;
	}


	public List<CourseDto> getCourseList() {
		return courseList;
	}


	public void setCourseList(List<CourseDto> courseList) {
		this.courseList = courseList;
	}


	public int getMember_id() {
		return member_id;
	}


	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	

	

}
