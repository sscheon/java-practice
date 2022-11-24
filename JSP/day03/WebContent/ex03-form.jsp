<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03-form</title>
</head>
<body>

<h1>다수의 파라미터 처리하기</h1>
<hr>

<!-- 파라미터를 주소창에 노출시키고 싶지 않으면, method="POST" -->
<form method="POST" action="ex03-result.jsp">
	<p><input type="text" name="id" placeholder="ID"></p>
	<p><input type="password" name="pw1" placeholder="password"></p>
	<p><input type="password" name="pw2" placeholder="password"></p>
	<p><input type="text" name="name" placeholder="name"></p>
	<p><input type="date" name="birth"></p>
	<p><input type="email" name="email" placeholder="foo@bar.com"></p>
	<p><input type="submit"></p>
	
	<p><input type="radio" name="gender" value="man">남성</p>
	<p><input type="radio" name="gender" value="woman">여성</p>
	
	<p>
		<label><input type="checkbox" name="hobby" value="sports">스포츠</label>
		<label><input type="checkbox" name="hobby" value="travel">여행</label>
		<label><input type="checkbox" name="hobby" value="coding">코딩</label>
		<label><input type="checkbox" name="hobby" value="reading">독서</label>
	</p>	
</form>

</body>
</html>