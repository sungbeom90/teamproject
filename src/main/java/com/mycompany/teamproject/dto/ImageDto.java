package com.mycompany.teamproject.dto;

import org.springframework.web.multipart.MultipartFile;

public class ImageDto {
	private int offer_id;
	private int img_no;
	private MultipartFile oattach;
	private String oattachsname;
	private String oattachoname;
	private String oattachtype;
	
	public int getOffer_id() {
		return offer_id;
	}
	public void setOffer_id(int offer_id) {
		this.offer_id = offer_id;
	}
	public int getImg_no() {
		return img_no;
	}
	public void setImg_no(int img_no) {
		this.img_no = img_no;
	}
	
	public MultipartFile getOattach() {
		return oattach;
	}
	public void setOattach(MultipartFile oattach) {
		this.oattach = oattach;
	}
	public String getOattachsname() {
		return oattachsname;
	}
	public void setOattachsname(String oattachsname) {
		this.oattachsname = oattachsname;
	}
	public String getOattachoname() {
		return oattachoname;
	}
	public void setOattachoname(String oattachoname) {
		this.oattachoname = oattachoname;
	}
	public String getOattachtype() {
		return oattachtype;
	}
	public void setOattachtype(String oattachtype) {
		this.oattachtype = oattachtype;
	}
	
	
}
