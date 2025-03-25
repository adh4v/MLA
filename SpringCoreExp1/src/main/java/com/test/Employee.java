package com.test;

public class Employee {
	
	private int id;
	private String name;
	private String cmp;
	private String city;
	private Address adr;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String name, String cmp, String city,Address adr) {
		this.id = id;
		this.name = name;
		this.cmp = cmp;
		this.city = city;
		this.adr=adr;
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
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", cmp=" + cmp + ", city=" + city + ",Address="+ adr +"]";
	}

}
