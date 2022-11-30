<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updown2-action</title>
</head>
<body>

<%@ page import="practice.Updown2" %>
<%
	Updown2 ud2 = (Updown2)session.getAttribute("ud2");
	if(ud2 == null){
		ud2 = new Updown2();
		session.setAttribute("ud2", ud2);
	}
	
	int user = Integer.parseInt(request.getParameter("user"));	
	String check = ud2.checkInput(user);
	
	if(check.equals("정답")){
		String msg = ud2.getResult();
		request.setAttribute("msg", msg);
		session.removeAttribute("ud2");
		request.getRequestDispatcher("updown2-result.jsp").forward(request, response);
	}
	else {
		request.setAttribute("msg", String.format("%d %s", user, check));
		request.getRequestDispatcher("updown2-form.jsp").forward(request, response);
	}
%>
</body>
</html>