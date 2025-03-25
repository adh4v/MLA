package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;
import com.test.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository repo;
	public void setRepo(UserRepository repo) {
		this.repo = repo;
	}
	@PostMapping("/create")
	public User createUser(@RequestBody User user)
	{
		return repo.save(user);
				
	}
	@GetMapping("/byemail/{email}")
	public User findUserByEmail(@PathVariable("email")String email)
	{
		return repo.getUserByEmail(email);
	}
	@GetMapping("/fname/{fname}")
	public List<User> findUsersByFirstName(@PathVariable("fname")String fname)
	{
		return repo.getUserByEndsWith(fname);
	}
}
