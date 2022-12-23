<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<style>
.ad {
	position: absolute;
	top: 50%;
	left: 50%;
	background: #fff;
	width: 285px;
	margin: -140px 0 0 -182px;
	padding: 40px;
	box-shadow: 0 0 3px rgba(0, 0, 0, 0.3);
}

.ad>.background {
	position: fixed;
	width: 100%;
	height: 150%;
	background-color: rgba(0, 0, 0, 0.3);
	z-index: -1;
}

body {
	background-image: url("${cpath}/img/28018.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}

input {
	outline: none;
	display: block;
	width: 100%;
	margin: 0 0 20px;
	padding: 10px 15px;
	border: 1px solid #ccc;
	color: grey;
	font-family: "Roboto";
	box-sizing: border-box;
	font-size: 14px;
	font-wieght: 400;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
	transition: 0.2s linear; &
	input: focus{
      color: #333;
	border: 1px solid #44c4e7;
}

}
h2 {
	margin: 0 0 20px;
	line-height: 1;
	color: grey;
	font-size: 18px;
	font-weight: 400;
}

button {
	cursor: pointer;
	background: #dadada;
	width: 100%;
	padding: 10px 15px;
	border: 0;
	color: #fff;
	font-family: "Roboto";
	font-size: 14px;
	font-weight: 400;
}

</style>
</head>
<body>

	<%
		String blockOneDay = request.getParameter("blockOneDay");

		if (blockOneDay != null) { // 무엇이 되었든, 값이 있다면 체크한것으로 간주함
			Cookie cookie = new Cookie("block", "true");
			cookie.setMaxAge(60 * 60 * 24); // 초 * 분 * 시간
			response.addCookie(cookie);
			response.sendRedirect("ex04.jsp");

		}
	%>



	<div class="ad">
		<div class="background"></div>
		<h2>Login to your Account</h2>
		<form action="login-action.jsp" method="POST">

			<input type="text" name="id" placeholder="아이디" required autofocus>
			<input type="password" name="pw" placeholder="비밀번호" required>

			<button id="submit">Login</button>
		</form>

	</div>


</body>
</html>