package com.test.entity;

import java.util.Arrays;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
//@NamedNativeQuery(name="user5.firstName",query="select u from user5 u where u.fname = ?1",nativeQuery = true)
@Entity
@Table(name="user5")
public class User {
	@Id
	@NotNull(message = "id required")
	private int id;
	
	@NotEmpty(message = "First Name required")
	@Size(min = 5,max = 20)
	private String fname;
	
	@NotEmpty(message = "Last Name required")
	@Size(min = 5,max = 20)
	private String lname;
	
	@NotEmpty(message = "Email Required")
	@Email(message = "check email format")
	private String email;
	
	@NotNull(message = "select dob")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private String startDate;
	
	@NotEmpty(message = "gender required")
	private String gender;
	
	private String[] food;

	@NotEmpty(message = "From city is required")
	private String cityFrom;
	
	@NotEmpty(message = "To city is required")
	private String cityTo;
	
	
	@NotEmpty
	private String[] seat;
	
	public User()
	{
		
	}
	
	public User(@NotNull(message = "id required") int id,
			@NotEmpty(message = "First Name required") @Size(min = 5, max = 20) String fname,
			@NotEmpty(message = "Last Name required") @Size(min = 5, max = 20) String lname,
			@NotEmpty(message = "Email Required") @Email(message = "check email format") String email,
			@NotNull(message = "select dob") String startDate, @NotEmpty(message = "gender required") String gender,
			String[] food, @NotEmpty(message = "From city is required") String cityFrom,
			@NotEmpty(message = "To city is required") String cityTo, @NotEmpty String[] seat) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.startDate = startDate;
		this.gender = gender;
		this.food = food;
		this.cityFrom = cityFrom;
		this.cityTo = cityTo;
		this.seat = seat;
	}
	
	public boolean validate(String u1,String u2)
	{
		if(u1.equals(cityTo))
			return true;
		else
			return false;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getStartDate() {
		return startDate;
	}

	

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String[] getFood() {
		return food;
	}


	public void setFood(String[] food) {
		this.food = food;
	}


	public String getCityFrom() {
		return cityFrom;
	}


	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}


	public String getCityTo() {
		return cityTo;
	}


	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}


	public String[] getSeat() {
		return seat;
	}


	public void setSeat(String[] seat) {
		this.seat = seat;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", startDate="
				+ startDate + ", gender=" + gender + ", food=" + Arrays.toString(food) + ", cityFrom=" + cityFrom
				+ ", cityTo=" + cityTo + ", seat=" + Arrays.toString(seat) + "]";
	}
	
	
	
}
