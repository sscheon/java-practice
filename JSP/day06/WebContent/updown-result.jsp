<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="day06.UpDown"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updown-result</title>
</head>
<body>

<h1>UpDown 결과</h1>

<h3>결과 : ${result }</h3>
<h3>${user }</h3>

<%	
	UpDown ud = (UpDown)application.getAttribute("ud");
	int user = Integer.parseInt(request.getParameter("user"));
%>
<%
	if(ud.getCpu() == user){
	application.removeAttribute("ud");
%>
<h3>${cnt }회 만에 맞췄습니다!!</h3>
<a href="updown-form.jsp"><button>한번 더 할래?</button></a>
<%} %>
<%
	if(ud.getCpu() != user){
%>
<a href="updown-form.jsp"><button>다시</button></a>
<%} %>
</body>
</html>