<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>The Student Confirmation details :</h1>

	Student Name : ${student.firstName} ${student.lastName}
	
	<br>
	
	Belongs To : ${student.country}
	
	<br>

	Favorite Language is : ${student.favLang}
	
	
</body>
</html>