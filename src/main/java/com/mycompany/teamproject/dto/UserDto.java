package com.mycompany.teamproject.dto;

import org.springframework.web.multipart.MultipartFile;

public class UserDto {
	private String uemail;
	private String upassword;
	private String uname;
	private String usex;
	private boolean uagree_e1;
	private boolean uagree_e2;
	private boolean uagree_o1;
	private boolean uagree_o2;
	private MultipartFile uselfy;
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public boolean isUagree_e1() {
		return uagree_e1;
	}
	public void setUagree_e1(boolean uagree_e1) {
		this.uagree_e1 = uagree_e1;
	}
	public boolean isUagree_e2() {
		return uagree_e2;
	}
	public void setUagree_e2(boolean uagree_e2) {
		this.uagree_e2 = uagree_e2;
	}
	public boolean isUagree_o1() {
		return uagree_o1;
	}
	public void setUagree_o1(boolean uagree_o1) {
		this.uagree_o1 = uagree_o1;
	}
	public boolean isUagree_o2() {
		return uagree_o2;
	}
	public void setUagree_o2(boolean uagree_o2) {
		this.uagree_o2 = uagree_o2;
	}
	public MultipartFile getUselfy() {
		return uselfy;
	}
	public void setUselfy(MultipartFile uselfy) {
		this.uselfy = uselfy;
	}
	
	
	
	
	
	
	
}
