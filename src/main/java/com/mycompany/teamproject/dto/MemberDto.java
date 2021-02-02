package com.mycompany.teamproject.dto;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class MemberDto {
	private int member_id;
	private String memail;	
	private String mpassword;
	private String mname;
	private String mphone;
	private String mgender;
	private Date mjoin;
	private String mimageoname;
	private String mimagetype;
	
	private MultipartFile mimage;
	
	
	private int maccount;
	private int partner_id;
	
	private String aessence_1;
	private String aessence_2;
	private String aoption_1;
	private String aoption_2;
	private String apartner;
	
	
	

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

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

	public String getMimageoname() {
		return mimageoname;
	}

	public void setMimageoname(String mimageoname) {
		this.mimageoname = mimageoname;
	}

	public String getMimagetype() {
		return mimagetype;
	}

	public void setMimagetype(String mimagetype) {
		this.mimagetype = mimagetype;
	}

	public MultipartFile getMimage() {
		return mimage;
	}

	public void setMimage(MultipartFile mimage) {
		this.mimage = mimage;
	}

	public int getPartner_id() {
		return partner_id;
	}

	public void setPartner_id(int partner_id) {
		this.partner_id = partner_id;
	}

	public int getMaccount() {
		return maccount;
	}

	public void setMaccount(int maccount) {
		this.maccount = maccount;
	}

	public String getAessence_1() {
		return aessence_1;
	}

	public void setAessence_1(String aessence1) {
		this.aessence_1 = aessence1;
	}

	public String getAessence_2() {
		return aessence_2;
	}

	public void setAessence_2(String aessence2) {
		this.aessence_2 = aessence2;
	}

	public String getAoption_1() {
		return aoption_1;
	}

	public void setAoption_1(String aoption1) {
		this.aoption_1 = aoption1;
	}

	public String getAoption_2() {
		return aoption_2;
	}

	public void setAoption_2(String aoption2) {
		this.aoption_2 = aoption2;
	}

	public String getApartner() {
		return apartner;
	}

	public void setApartner(String apartner) {
		this.apartner = apartner;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
