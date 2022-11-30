<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updown-form</title>
</head>
<body>

<h1>UpDown</h1>
<hr>

<h2>1~100사이의 정수 하나를 입력하세용</h2>
<form action="updown-action.jsp" method="POST">
	<input type="number" name="user" placeholder="1~100" min="1" max="100" required autofocus>
	<input type="submit" value="확인">
</form>

</body>
</html>