package com.test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("user");
		
//		Cookie ck = new Cookie("info", name);	
//		response.addCookie(ck);
		
		HttpSession sesh = request.getSession();
		
		sesh.setAttribute("info", name);
		
		out.println("From Login Page : "+name);
		out.println("<br><a href = 'Logout'>Logout Here </a>");
	}

}
