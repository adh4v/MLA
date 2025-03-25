 package com.test;

public class Address {
	private String country;
	private String state;
	private int pin;
	public Address()
	{
		
	}
	
	public Address(String country, String state, int pin) {
		this.country = country;
		this.state = state;
		this.pin = pin;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", pin=" + pin + "]";
	}
	
	
}
