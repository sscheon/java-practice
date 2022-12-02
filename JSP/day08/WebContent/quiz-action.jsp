<%@page import="day08.Handler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, day08.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz-action</title>
</head>
<body>

<jsp:useBean id="user" class="day08.Member"/>
<jsp:setProperty property="*" name="user"/>

<%
	request.setCharacterEncoding("UTF-8");
	ArrayList<Member> list = (ArrayList<Member>)application.getAttribute("list");	

	Handler hd = new Handler();
	boolean login = hd.login(user);
	String storeid = request.getParameter("storeid");
	
	if(login == true && storeid != null) {
		String userid = request.getParameter("userid");
		Cookie cookie = new Cookie("userid", userid);
		cookie.setMaxAge(60 * 60);
		response.addCookie(cookie);
	}
	
	if(login == true && storeid == null) {
		Cookie cookie = new Cookie("userid", null);
		cookie.setMaxAge(0);		
		response.addCookie(cookie);		
		response.sendRedirect("quiz-form.jsp");
	}
	
	else {
		%>
		<h3>로그인 실패</h3>
		<button onclick="history.back()">뒤로 가기</button>
	<%	} %>
</body>
</html>