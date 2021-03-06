package com.pck.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class seat {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="maleseat")
	private int maleseat;
	
	private int femaleseat;
	
	private String seatallocate;
	public String getSeatallocate() {
		return seatallocate;
	}
	public void setSeatallocate(String seatallocate) {
		this.seatallocate = seatallocate;
	}
	private  String Userid;
	
	public int getFemaleseat() {
		return femaleseat;
	}
	public void setFemaleseat(int femaleseat) {
		this.femaleseat = femaleseat;
	}
	public int getMaleseat() {
		return maleseat;
	}
	public void setMaleseat(int maleseat) {
		this.maleseat = maleseat;
	}
	
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}


}
