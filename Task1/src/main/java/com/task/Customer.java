package com.task;

import java.util.List;

public class Customer {
	
	private int id;
	private String name;
	private List<String> type;
	private String city;
	private int pin;
	
	public Customer()
	{
		
	}

	public Customer(int id, String name, List<String> type, String city, int pin) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.city = city;
		this.pin = pin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getType() {
		return type;
	}

	public void setType(List<String> type) {
		this.type = type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", type=" + type + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}
