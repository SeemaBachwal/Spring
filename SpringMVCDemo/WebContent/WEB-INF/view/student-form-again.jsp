<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Student Registration Form</h1>
	<form:form action="processForm" modelAttribute="student">
	
	First Name : <form:input path="firstName" />

		<br>
		<br>	

	Last Name : <form:input path="lastName" />

		<br>
		<br>
	Country :
<%-- 	<form:select path="country" >
		<form:option value="Brazil" label="Brazil"/>
		<form:option value="United Kingdom" label="United Kingdom"/>
		<form:option value="United States of America" label="United States of America"/>
		<form:option value="India" label="India"/>
		<form:option value="Germany" label="Germany"/>
		<form:option value="France" label="France"/>
	</form:select> --%>
	
	<form:select path="country">
		<form:options items="${student.countryOptions}"/>	
	</form:select>
	
		<br>
		<br>
	
	Favorite Languages :
	<form:radiobutton path="favLang" value="Java"/>Java
	<form:radiobutton path="favLang" value="Python"/>Python
	<form:radiobutton path="favLang" value="C++"/>C++
	<form:radiobutton path="favLang" value="Ruby"/>Ruby
	<form:radiobutton path="favLang" value="Csharp"/>Csharp
	<form:radiobutton path="favLang" value="PHP"/>PHP
		
		<br>
		<br>
	
	<input type="submit" value="Register" />

	</form:form>
</body>
</html>