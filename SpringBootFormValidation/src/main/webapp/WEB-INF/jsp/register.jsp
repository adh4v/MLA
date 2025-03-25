<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<style type="text/css">
.error {
	color: red;
	font-style: oblique;
}
</style>
</head>
<body>
	<h1>Register Form</h1>

	<form:form action="reguser" method="post" modelAttribute="user">
		<div>
		<form:label path="id">User ID :</form:label>
		<form:input path="id" />
		<form:errors path="id" cssClass="error"></form:errors>
		</div>
		<div>
		<form:label path="fname">FullName :</form:label>
		<form:input path="fname" />
		<form:errors path="fname" cssClass="error"></form:errors>
		</div>
		<div>
		<form:label path="lname">LastName :</form:label>
		<form:input path="lname" />
		<form:errors path="lname" cssClass="error"></form:errors>
		</div>
		<div>
		<form:label path="email">E-mail :</form:label>
		<form:input path="email" />
		<form:errors path="email" cssClass="error"></form:errors>
		</div>
		<div>
		<form:label path="startDate">Start-Date :</form:label>
		<form:input path="startDate" />
		<form:errors path="startDate" cssClass="error"></form:errors>
		</div>
		<div>
		<form:label path="gender">Select Gender :</form:label>
		<form:radiobutton path="gender" value="male" label="Male"/>
		<form:radiobutton path="gender" value="female" label="Female"/>
		<form:errors path="gender" cssClass="error"></form:errors>
		</div>
		<div>
		<form:label path="food">Select Food :</form:label>
		<form:radiobutton path="food" value="Breakfast" label="Breakfast"/>
		<form:radiobutton path="food" value="Lunch" label="Lunch"/>
		<form:radiobutton path="food" value="Dinner" label="Dinner"/>
		</div>
		<div>
		<form:label path="cityFrom">City From :</form:label>
		<form:radiobutton path="cityFrom" value="Banglore" label="Banglore"/>
		<form:radiobutton path="cityFrom" value="Chennai" label="Chennai"/>
		<form:radiobutton path="cityFrom" value="Coimbatore" label="Coimbatore"/>
		</div>
		<div>
		<form:label path="cityTo">City To :</form:label>
		<form:radiobutton path="cityTo" value="Banglore" label="Banglore"/>
		<form:radiobutton path="cityTo" value="Chennai" label="Chennai"/>
		<form:radiobutton path="cityTo" value="Coimbatore" label="Coimbatore"/>
		</div>
		<div>
		<form:label path="seat">Select Seat :</form:label>
		<form:checkbox path="seat" value="L" label="L"/>
		<form:checkbox path="seat" value="B" label="B"/>
		<form:checkbox path="seat" value="M" label="M"/>
		<form:errors path="seat" cssClass="error"></form:errors>
		</div>
		
		<input type="submit" value="register">

	</form:form>

</body>
</html>