package com.mycompany.teamproject.dto;

public class LocationDto {	
	private int location_id;
	private String lname;
	private String limagesname;
	private String limageoname;
	private String limagetype;
	private String lclimate;
	private String ldetail;
	private int nation_id;
	public int getNation_id() {
		return nation_id;
	}
	public void setNation_id(int nation_id) {
		this.nation_id = nation_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLimagesname() {
		return limagesname;
	}
	public void setLimagesname(String limagesname) {
		this.limagesname = limagesname;
	}
	public String getLimageoname() {
		return limageoname;
	}
	public void setLimageoname(String limageoname) {
		this.limageoname = limageoname;
	}
	public String getLimagetype() {
		return limagetype;
	}
	public void setLimagetype(String limagetype) {
		this.limagetype = limagetype;
	}
	public String getLclimate() {
		return lclimate;
	}
	public void setLclimate(String lclimate) {
		this.lclimate = lclimate;
	}
	public String getLdetail() {
		return ldetail;
	}
	public void setLdetail(String ldetail) {
		this.ldetail = ldetail;
	}
	
	
}
