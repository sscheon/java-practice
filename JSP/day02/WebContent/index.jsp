<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>로그인 화면</h1>
<hr>

<form method="POST" action="login-control.jsp">
	<p><input type="text" name="id" placeholder="ID" required autofocus></p>
	<p><input type="password" name="pw" placeholder="Password" required></p>
	<p><input type="submit" value="로그인"></p>
</form>

</body>
</html>