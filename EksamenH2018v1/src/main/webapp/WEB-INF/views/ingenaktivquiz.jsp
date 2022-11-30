<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Det er ingen aktiv quiz</h1>
	<form action="quiz" method="post">
		<button type="button">Start ny quiz med tittelen</button>
		<input type="text" name="nyQuiz">
	</form>
</body>
</html>