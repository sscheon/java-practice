<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border-collapse: collapse;
		width: 500px;
		height: 500px;
		margin: auto;
	}
	td, th {		
		border: 1px solid gray;
	}
	tbody > tr > td:nth-child(1) {
		width: 50%;
	}
	tbody > tr > td:nth-child(2) {
		width: 50%;
	}
	div {
		margin: 20px;		
		display: flex;
		justify-content: center;
	}
	
</style>
</head>
<body>

<%--
	quiz-form.jsp에서 넘어온
	파라미터를 <table>태그를 이용하여 각각 출력
 --%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String repw = request.getParameter("repw");
	String name = request.getParameter("name");
	String date = request.getParameter("date");
	String sex = request.getParameter("sex");
	String email = request.getParameter("email");
	String cnum = request.getParameter("cnum");
	String pnum = request.getParameter("pnum");
	String inum = request.getParameter("inum");
%>

<table>
	<thead>
		<tr>
			<th colspan="2">회원정보</th>
		</tr>
	</thead>
	<tbody>
		<tr>			
			<td>아이디</td>
			<td><%=id %></td>		
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%=pw %></td>
		</tr>
		<tr>
			<td>비밀번호 재확인</td>
			<td><%=repw %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td><%=date %></td>
		</tr>
		<tr>
			<td>성별</td>
			<td><%=sex %></td>
		</tr>
		<tr>
			<td>본인확인 이메일</td>
			<td><%=email %></td>
		</tr>
		<tr>
			<td>휴대전화</td>
			<td><%=cnum %><%=pnum %></td>
		</tr>
		<tr>
			<td>인증번호</td>
			<td><%=inum %></td>
		</tr>			
	</tbody>
</table>
<div>
	<a href="quiz-form.jsp"><button>돌아가기</button></a>
</div>

</body>
</html>