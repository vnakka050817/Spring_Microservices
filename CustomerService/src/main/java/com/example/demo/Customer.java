package com.example.demo;

public class Customer {
	
	private int CustId;
	private String Name;
	private String Address;
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int custId) {
		CustId = custId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Customer(int custId, String name, String address) {
		super();
		CustId = custId;
		Name = name;
		Address = address;
	}
	
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	

}
