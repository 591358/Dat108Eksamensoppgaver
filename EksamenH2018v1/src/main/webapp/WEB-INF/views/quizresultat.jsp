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
	<p>Tittel på quiz: ${gjeldendeQuiz.tittel}</p>
	<table>
	<tr>
	<th>Alternativ</th>
	<th align="left">Antall Svar</th>
	</tr>
		<c:forEach items="${gjeldendeQuiz.svarAlternativer}" var="alternativ" >
			<tr><td>${alternativ.key}</td><td>${alternativ.value}</td></tr>
		</c:forEach>
			
			
	</table>
</body>
</html>