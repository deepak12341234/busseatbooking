package com.pck.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
@SecondaryTable(name = "seatdetail", pkJoinColumns = @PrimaryKeyJoinColumn(name = "busnumber"))

public class admin {
private String bus_name;
@Column(name = "seat", table = "seatdetail")
private int seat;
@Column(name = "r_seat", table = "seatdetail")
private int remaining_seat;
private String dt;
private int distace;
private String date;
	
	  public String getDt() {
	return dt;
}
public void setDt(String dt) {
	this.dt = dt;
}
	public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
	public int getRemaining_seat() { return remaining_seat; } public void
	  setRemaining_seat(int remaining_seat) { this.remaining_seat = remaining_seat;
	  }
	 
public int getSeat() {
	return seat;
}
public void setSeat(int seat) {
	this.seat = seat;
}

public int getDistace() {
	return distace;
}
public void setDistace(int distace) {
	this.distace = distace;
}
private String arrival_place;
private String time;
@Id

private int bus_number;
private String dest_place;
	/*
	 * private byte[] data;
	 * 
	 * public byte[] getData() { return data; } public void setData(byte[] data) {
	 * this.data = data; }
	 */
public String getBus_name() {
	return bus_name;
}
public void setBus_name(String bus_name) {
	this.bus_name = bus_name;
}
public String getArrival_place() {
	return arrival_place;
}
public void setArrival_place(String arrival_place) {
	this.arrival_place = arrival_place;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public int getBus_number() {
	return bus_number;
}
public void setBus_number(int bus_number) {
	this.bus_number = bus_number;
}
public String getDest_place() {
	return dest_place;
}
public void setDest_place(String dest_place) {
	this.dest_place = dest_place;
} 

}
