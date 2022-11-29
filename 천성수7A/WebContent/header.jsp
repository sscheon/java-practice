<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="phoneNumberBook.*"%>
<%
	request.setCharacterEncoding("UTF-8");
	pageContext.setAttribute("cpath", request.getContextPath());
	
	Handler hd = (Handler)application.getAttribute("handler");
	if(hd == null) {
		hd = new Handler();
		application.setAttribute("handler", hd);
	}
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전화번호부</title>
<style>
	header, aside, nav, main, section {
		margin: 0;
		padding: 0;
	}	
	header {		
		text-align: center;
		margin-bottom: 30px;
	}
	a {
		text-decoration: none;
		color: inherit;
	}
	a:hover {
		text-decoration: underline;
	}
	main {
		width: 600px;
		margin: auto;
	}	
	aside > nav > ul {
		background-color: skyblue;
		display: flex;
		justify-content: space-around;
		align-items: center;
		height: 50px;
		font-size: 20px;
		font-weight: bold;		
		list-style: none;
	}
	section {	
		display: flex;
		justify-content: center;	
		margin: 20px;		
	}
	section > img {
		width: 450px;
		height: 450px;
	}
	table {
		border-collapse: collapse;
		margin: 10px auto;		
	}
	thead th {		
		color: black;
		padding: 5px 10px;		
	}
	tbody td {		
		padding: 5px 10px;
	}
	tbody > tr:hover {
		background-color: #f5f6f7;
		cursor: pointer;
	}
	th, td {
		border: 1px solid black; 
	}
</style>
</head>
<body>

<header>
	<h1><a href="${cpath }/index.jsp">전화번호부</a></h1>
</header>

<main>
	<aside>
		<nav>
			<ul>
				<li><a href="${cpath }/list.jsp">전체목록</a>
				<li><a href="${cpath }/create.jsp">생성</a>
			</ul>
		</nav>
	</aside>
</body>
</html>