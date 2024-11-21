package com.BikkadIT.MVCCurdOperation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	int sId;
	String sFname;
	String sLname;
	String sAddress;
	int mark;
	long phoneNumber;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsFname() {
		return sFname;
	}
	public void setsFname(String sFname) {
		this.sFname = sFname;
	}
	public String getsLname() {
		return sLname;
	}
	public void setsLname(String sLname) {
		this.sLname = sLname;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sFname=" + sFname + ", sLname=" + sLname + ", sAddress=" + sAddress
				+ ", mark=" + mark + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
