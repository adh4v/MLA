<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Declaration Tag -->
	
	<%! 
		int x=10;
		int y=20;
		public int add()
		{
			return x+y;
		}
	%>
	<!-- Expression Tag -->
	<%= add() %>
	
	<!-- Scriplet Tag -->
	
	<%
		out.println(add());

		out.println("<br><br> Current System Date : ");
	%>

</body>
</html>