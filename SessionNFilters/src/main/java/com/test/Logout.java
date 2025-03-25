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
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		//Cookie[] ck = request.getCookies();
		
		//out.println("From Logout Page : "+ck[0].getValue());
		
		HttpSession ses = request.getSession();
		
		String name = (String)ses.getAttribute("info");
		
		out.println("From Logout page : "+name);
		
		ses.invalidate();
	}

}
