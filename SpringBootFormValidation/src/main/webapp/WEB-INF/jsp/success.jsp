<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>User Data Submitted with Validations</h1>
	
	FirstName : ${user.fname} <br><br>
	LastName : ${user.lname} <br><br>
	Food :
	<ul>
	<c:forEach var = "food" items = "${user.food}">
		<li>${food}</li>
	</c:forEach>
	</ul>
	Leaving from : ${user.cityFrom} <br><br>
	Going To : ${user.cityTo} <br><br>
	
	Seat :
	<ul>
	<c:forEach var = "seat" items = "${user.seat}">
		<li>${seat}</li>
	</c:forEach>
	</ul> <br><br>
	<a href="userform">Click here to register</a>
	
</body>
</html>