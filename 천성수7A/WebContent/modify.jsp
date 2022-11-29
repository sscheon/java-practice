<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<%
		if(request.getMethod().equals("GET")) {
		int idx = Integer.parseInt(request.getParameter("idx"));
		pageContext.setAttribute("phoneNumberBook", hd.getItem(idx));
	%>
	<form method="POST">
		<input type="hidden" name="idx" value="${phoneNumberBook.idx }">
		<p><input type="text" name="name" placeholder="이름" value="${phoneNumberBook.name }" required></p>
		<p><input type="text" name="phoneNum" placeholder="전화번호" value="${phoneNumberBook.phoneNum }" required></p>		
		<p><input type="submit" value="수정" ></p>
	</form>
	
	<% } %>
	<%	if(request.getMethod().equalsIgnoreCase("POST")) {%>
	
	<jsp:useBean id="user" class="phoneNumberBook.PhoneNumberBook" scope="page" />
	<jsp:setProperty property="*" name="user" />	
	
	${handler.modify(user) >= 0 ? '수정 성공' : '수정 실패' }
	<%	} %>
</section>
</main>
</body>
</html>