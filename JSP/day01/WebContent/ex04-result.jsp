<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>

<h1>입력값(파라미터) 받아서 처리하기</h1>
<hr>

<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	int a = Integer.parseInt(age);
	String adult = "미성년자";	
%>

<%
	if (a >= 20) {
		adult = "성인";
	}
%>

<h3><%=name %>님의 나이는 <%=age %>살이고 <%=adult %>입니다</h3>
<div>
	<a href="ex04-form.jsp"><button>돌아가기</button></a>
</div>

</body>
</html>