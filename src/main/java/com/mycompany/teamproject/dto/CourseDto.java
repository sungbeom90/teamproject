package com.mycompany.teamproject.dto;

import org.springframework.web.multipart.MultipartFile;

public class CourseDto {
	// 데이터베이스 컬럼 필드
	private int offer_id;
	private int course_no;
	private String cplace;
	private String cdetail;
	private String ctime;
	private String cimageoname;
	private String cimagetype;
	
	// 브라우저 -> form -> 컨트롤러 매개변수로 쓰이는 필드
	private int[] course_no_array;
	private String[] cplace_array;
	private String[] cdetail_array;
	private String[] ctime_array;
	private MultipartFile[] cimage_array;
	
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
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
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
	public int[] getCourse_no_array() {
		return course_no_array;
	}
	public void setCourse_no_array(int[] course_no_array) {
		this.course_no_array = course_no_array;
	}
	public String[] getCplace_array() {
		return cplace_array;
	}
	public void setCplace_array(String[] cplace_array) {
		this.cplace_array = cplace_array;
	}
	public String[] getCdetail_array() {
		return cdetail_array;
	}
	public void setCdetail_array(String[] cdetail_array) {
		this.cdetail_array = cdetail_array;
	}	
	public String[] getCtime_array() {
		return ctime_array;
	}
	public void setCtime_array(String[] ctime_array) {
		this.ctime_array = ctime_array;
	}
	public MultipartFile[] getCimage_array() {
		return cimage_array;
	}
	public void setCimage_array(MultipartFile[] cimage_array) {
		this.cimage_array = cimage_array;
	}
	
	
	
}
