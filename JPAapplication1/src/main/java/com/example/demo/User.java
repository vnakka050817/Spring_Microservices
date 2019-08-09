package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	int Id;
	String name;
	long mobilenumber;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public User(int id, String name, long mobilenumber) {
		super();
		Id = id;
		this.name = name;
		this.mobilenumber = mobilenumber;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", mobilenumber=" + mobilenumber + "]";
	}
	
}
