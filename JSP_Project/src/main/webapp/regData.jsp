<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Scriplet Tag -->
	<% 
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register");
		String sql = "insert into userdetails(fname,uname,pass)values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		
		String fname = request.getParameter("fname");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		pst.setString(1, fname);
		pst.setString(2, uname);
		pst.setString(3, pass);
		
		pst.execute();
		out.println("Store User Data");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	%>
</body>
</html>