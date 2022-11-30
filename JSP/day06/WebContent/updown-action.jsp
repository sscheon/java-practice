<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updown-action</title>
</head>
<body>

<%@ page import="day06.UpDown" %>

<%
	UpDown ud = (UpDown)session.getAttribute("ud");
	if(ud == null) {
		ud = new UpDown();
		application.setAttribute("ud", ud);
	}
	
	int cpu = ud.getCpu();	
	int user = Integer.parseInt(request.getParameter("user"));	
	String result = ud.getResult(cpu, user);
	int cnt = ud.getCnt();
	
	request.setAttribute("cpu", cpu);
	request.setAttribute("result", result);
	request.setAttribute("cnt", cnt);	
	
	request.getRequestDispatcher("updown-result.jsp").forward(request, response);
%>

</body>
</html>