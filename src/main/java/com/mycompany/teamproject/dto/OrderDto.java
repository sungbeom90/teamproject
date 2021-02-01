package com.mycompany.teamproject.dto;

import java.util.Date;

public class OrderDto {
	private int order_id;
	private int opeople;
	private int ocost;
	private Date odate_com;
	private Date odate_meet;
	private String ostatus;
	private int member_id;
	private int offer_id;
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getOpeople() {
		return opeople;
	}
	public void setOpeople(int opeople) {
		this.opeople = opeople;
	}
	public int getOcost() {
		return ocost;
	}
	public void setOcost(int ocost) {
		this.ocost = ocost;
	}
	public Date getOdate_com() {
		return odate_com;
	}
	public void setOdate_com(Date odate_com) {
		this.odate_com = odate_com;
	}
	public Date getOdate_meet() {
		return odate_meet;
	}
	public void setOdate_meet(Date odate_meet) {
		this.odate_meet = odate_meet;
	}
	public String getOstatus() {
		return ostatus;
	}
	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public int getOffer_id() {
		return offer_id;
	}
	public void setOffer_id(int offer_id) {
		this.offer_id = offer_id;
	}
	
	
	
}
