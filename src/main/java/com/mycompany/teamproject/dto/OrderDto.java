package com.mycompany.teamproject.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OrderDto {
	// 데이터베이스 컬럼 필드
	private int order_id;
	private int opeople;
	private int ocost;
	private Date odate_com;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date odate_meet;
	
	private String ostatus;
	private int member_id;
	private int offer_id;
	
	
	// 브라우저 -> form -> 컨트롤러 매개변수로 쓰이는 필드	
	private int oprice;
	
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
	public int getOprice() {
		return oprice;
	}
	public void setOprice(int oprice) {
		this.oprice = oprice;
	}
	
	
	
}
