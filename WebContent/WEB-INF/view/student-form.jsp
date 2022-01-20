<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		 <form:errors path="firstName" />
		<br />
		<br />
		Last name: <form:input path="lastName" />
		<br />
		<br />
		Age: <form:input path="age" />
		<form:errors path="age" />
		<br />
		<br />
		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" />
		<br />
		<br />		
		<input type="submit" value="submit"/>
	</form:form>
	
</body>
</html>