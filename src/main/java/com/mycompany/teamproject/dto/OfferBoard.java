package com.mycompany.teamproject.dto;

import org.springframework.web.multipart.MultipartFile;

public class OfferBoard {
	private String writer;
	private String title;
	private String img;
	private String img2;
	private String subtitle;
	private String price;
	private String subcontent;
	private String include;
	private String uninclude;
	private String course;
	private String addinfo;
	private String contacttime;
	private String contactplace;
	private MultipartFile offerPhoto;
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getInclude() {
		return include;
	}
	public void setInclude(String include) {
		this.include = include;
	}
	public String getUninclude() {
		return uninclude;
	}
	public void setUninclude(String uninclude) {
		this.uninclude = uninclude;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAddinfo() {
		return addinfo;
	}
	public void setAddinfo(String addinfo) {
		this.addinfo = addinfo;
	}
	public String getSubcontent() {
		return subcontent;
	}
	public void setSubcontent(String subcontent) {
		this.subcontent = subcontent;
	}
	public String getContacttime() {
		return contacttime;
	}
	public void setContacttime(String contacttime) {
		this.contacttime = contacttime;
	}
	public String getContactplace() {
		return contactplace;
	}
	public void setContactplace(String contactplace) {
		this.contactplace = contactplace;
	}
	public MultipartFile getOfferPhoto() {
		return offerPhoto;
	}
	public void setOfferPhoto(MultipartFile offerPhoto) {
		this.offerPhoto = offerPhoto;
	}
	
	
}

