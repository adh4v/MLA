package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.User;
import com.test.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	private static List<User> tempData = new ArrayList<>();
	
	static 
	{
		String[] food = {"BreakFast","Lunch","Dinner"};
		String[] seat = {"M!","M2","L1","L2","U1","u2"};
		
		tempData.add(new User(1,"Rohith","Sharma","adhav@gmail.com","2003-09-08","Male",food,"Chennai","Banglore",seat));
	}
	public User reservationRequest(User user)
	{
		tempData.add(user);
		return repo.save(user);
	}
	public static boolean validateCity(User user)
	{
		boolean ft=user.validate(user.getCityFrom(),user.getCityTo());
		return ft;
	}

}
