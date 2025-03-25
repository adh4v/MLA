package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.entity.User;
import com.test.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	public void setService(UserService service) {
		this.service = service;
	}
	@GetMapping("/")
	public String homePage()
	{
		return "home";
	}
	@GetMapping("/userform")
	public String userForm(Model model,User user)
	{
		model.addAttribute("user",user);
		return "register";
	}
	@PostMapping("/reguser")
	public String SubmitUserForm(
			@Valid 
			@ModelAttribute("user") User user, BindingResult br,Model model)
	{
		if(br.hasErrors())
		{
			return "register";
		}
		
		boolean validateCity = UserService.validateCity(user);
		
		if(validateCity)
		{
			String msg = "Please check your From and To City";
			model.addAttribute("info",msg);
			return "error";
		}
		service.reservationRequest(user);
		return "Success";
		
	}
	
	
		
}
