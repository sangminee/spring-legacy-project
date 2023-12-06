<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1>Custom Login Page</h1>
<h2><c:out value="${error}"/></h2>
<h2><c:out value="${logout}"/></h2>

<form method='post' action="/login">
	<div>
		<input type='text' name='username' value='admin'>
	</div>
	<div>
		<input type='password' name='password' value='admin'>
	</div>
	<div>
		<input type='submit'>
	</div>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
</form>

</body>
</html>