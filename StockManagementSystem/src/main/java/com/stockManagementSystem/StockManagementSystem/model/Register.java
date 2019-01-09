package com.stockManagementSystem.StockManagementSystem.model;

public class Register {

	private String username;
	private String password;
	private int age;
	private int sinceFrom;
	private String purchaseId;
	private String address;
	private String pincode;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSinceFrom() {
		return sinceFrom;
	}
	public void setSinceFrom(int date) {
		this.sinceFrom = date;
	}
	public String getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Register [username=" + username + ", password=" + password + ", age=" + age + ", address=" + address
				+ ", pincode=" + pincode + "]";
	}
	
	
	
}
