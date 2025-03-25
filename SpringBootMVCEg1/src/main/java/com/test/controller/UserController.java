package com.test.controller;

import java.lang.ProcessHandle.Info;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.User;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {
	/*
	@RequestMapping("/sumbituser")
	public String submitForm(HttpServletRequest request,Model model)
	{
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		User u = new User();
		u.setUser(user);
		u.setPassword(pwd);
		model.addAttribute("info",user);
		return "userdata";
	}*/
	@RequestMapping("/submituser")
	public String submitForm(@RequestParam("user") String usr,@RequestParam("pwd") String pass,Model model,User user)
	{
		user.setUser(usr);
		user.setPassword(pass);
		model.addAttribute("info",user);
		return "userdata";
	}
}	
