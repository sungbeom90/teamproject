package com.mycompany.teamproject.dto;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class MemberDtoTest {
	private String memail;	
	private String mpassword;
	private String mname;
	private String mphone;
	private String mgender;
	private Date mjoin;
	
	private MultipartFile mimage;

	
	
	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getMgender() {
		return mgender;
	}

	public void setMgender(String mgender) {
		this.mgender = mgender;
	}

	public Date getMjoin() {
		return mjoin;
	}

	public void setMjoin(Date mjoin) {
		this.mjoin = mjoin;
	}

	public MultipartFile getMimage() {
		return mimage;
	}

	public void setMimage(MultipartFile mimage) {
		this.mimage = mimage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
