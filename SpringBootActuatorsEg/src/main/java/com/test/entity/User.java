package com.test.entity;

import org.springframework.beans.factory.annotation.Value;

public class User {
	
	
	private String fname;

	private String email;

	private String desg;
	
	

	public void setFname(String fname) {
		this.fname = fname;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setDesg(String desg) {
		this.desg = desg;
	}



	@Override
	public String toString() {
		return "User [fname=" + fname + ", email=" + email + ", desg=" + desg + "]";
	}
	
	
}
