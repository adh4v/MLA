<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="com.test.Order"></jsp:useBean>
	
	<jsp:setProperty property="id" name="obj"/>
	<jsp:setProperty property="name" name="obj"/>
	<jsp:setProperty property="desc" name="obj"/>
	<jsp:setProperty property="qty" name="obj"/>
	
	<jsp:getProperty property="id" name="obj"/>
	<jsp:getProperty property="name" name="obj"/>
	<jsp:getProperty property="desc" name="obj"/>
	<jsp:getProperty property="qty" name="obj"/>
	
	<!--<jsp:include page="Home.jsp"></jsp:include>-->
	
	
	
		
</body>
</html>