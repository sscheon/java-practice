<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>
	<table>
		<thead>
			<tr>
				<th>이름</th>
				<th>전화번호</th>
			</tr>			
		</thead>
		<tbody>
		<%
			for(PhoneNumberBook phoneNumberBook : hd.getList()) {
			pageContext.setAttribute("phoneNumberBook", phoneNumberBook);			
		%>
			<tr>
				<td>${phoneNumberBook.name }</td>
				<td>${phoneNumberBook.phoneNum }</td>
				<td><a href="${cpath }/modify.jsp?idx=${phoneNumberBook.idx}"><button>수정</button></a></td>
				<td><a href="${cpath }/delete.jsp?idx=${phoneNumberBook.idx}"><button>삭제</button></a></td>
			</tr>		
		<% } %>
		</tbody>
	</table>
</section>
</main>
</body>
</html>