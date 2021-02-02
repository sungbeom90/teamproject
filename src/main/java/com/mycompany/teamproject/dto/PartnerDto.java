package com.mycompany.teamproject.dto;

import java.util.Date;

public class PartnerDto {

	private int partner_id;
	private String pname;
	private Date pjoin;
	private int member_id;
	private int location_id;
	private String location_name;
	private String memail;
	
	public int getPartner_id() {
		return partner_id;
	}
	public void setPartner_id(int partner_id) {
		this.partner_id = partner_id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getPjoin() {
		return pjoin;
	}
	public void setPjoin(Date pjoin) {
		this.pjoin = pjoin;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	
	
	
	
}
