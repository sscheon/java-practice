<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 선언부
	private MemberEntity[] arr = {
			new MemberEntity("test", "1234", "테스트"),
			new MemberEntity("admin", "1", "관리자"),
			new MemberEntity("iu930516", "iu", "이지은"),
	};

	private MemberEntity loginMethod(MemberEntity user) {
		MemberEntity login = null;
		for(MemberEntity mem : arr) {
			if(user.getId().equals(mem.getId())) {
				if(user.getPw().equals(mem.getPw())) {
					login = mem;
				}
			}
		}
		return login;
	}
%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	MemberEntity user = new MemberEntity();
	user.setId(id);
	user.setPw(pw);
	
	MemberEntity login = loginMethod(user);
	
%>

</body>
</html>