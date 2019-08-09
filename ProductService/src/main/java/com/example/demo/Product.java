package com.example.demo;

public class Product {
	private Integer Id;
	private String name;
	private String description;
	
	public Product(Integer id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", description=" + description + "]";
	}


}
