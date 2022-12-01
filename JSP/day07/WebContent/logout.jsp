<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>
<%
	// 1) 세션에서 지정한 속성(attribute)을 제거한다 / 단일 정보만 제거한다
	session.removeAttribute("login");

	// 2) 현재 세션을 폐기한다 (다음 요청은 새로운 세션을 발급받는다)
	session.invalidate();
	
	response.sendRedirect(request.getContextPath());
%>

</body>
</html>