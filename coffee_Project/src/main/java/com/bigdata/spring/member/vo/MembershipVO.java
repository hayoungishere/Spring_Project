package com.bigdata.spring.member.vo;

public class MembershipVO {
	private int idx;
	private String membership_id;
	private String last_orderDate;
	private int stamp;
	private int coupon;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getMembership_id() {
		return membership_id;
	}
	public void setMembership_id(String membership_id) {
		this.membership_id = membership_id;
	}
	public String getLast_orderDate() {
		return last_orderDate;
	}
	public void setLast_orderDate(String last_orderDate) {
		this.last_orderDate = last_orderDate;
	}
	public int getStamp() {
		return stamp;
	}
	public void setStamp(int stamp) {
		this.stamp = stamp;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	
}
