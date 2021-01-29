package com.mycompany.teamproject.dto;

public class CourseDto {
	private int offer_id;
	private int course_no;
	private String cplace;
	private String cdetail;
	private String cimageoname;
	private String cimagetype;
	
	public int getOffer_id() {
		return offer_id;
	}
	public void setOffer_id(int offer_id) {
		this.offer_id = offer_id;
	}
	public int getCourse_no() {
		return course_no;
	}
	public void setCourse_no(int course_no) {
		this.course_no = course_no;
	}
	public String getCplace() {
		return cplace;
	}
	public void setCplace(String cplace) {
		this.cplace = cplace;
	}
	public String getCdetail() {
		return cdetail;
	}
	public void setCdetail(String cdetail) {
		this.cdetail = cdetail;
	}
	public String getCimageoname() {
		return cimageoname;
	}
	public void setCimageoname(String cimageoname) {
		this.cimageoname = cimageoname;
	}
	public String getCimagetype() {
		return cimagetype;
	}
	public void setCimagetype(String cimagetype) {
		this.cimagetype = cimagetype;
	}
	
}
