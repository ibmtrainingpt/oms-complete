package com.ibm.demo.entity;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Order {
	@Id
	private String id;
	@NotNull
	private String item;
	@NotNull
	private float price;
	@NotNull
	private float tax;
	
	public float getPrice() {
		return price;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public void setPrice(float price) {
		if (price <= 0) {
			throw new IllegalArgumentException("Price cannot be negative.");
		}
		this.price = price;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
