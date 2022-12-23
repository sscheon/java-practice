<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="천성수9A.*"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="user" class="천성수9A.Kfc_menuDTO"/>
<jsp:setProperty property="*" name="user"/>

<c:set var="row" value="${dao.insert(user) }" />

<c:if test="${row != 0 }">
	<h3>추가성공!</h3>
	<a href="${cpath }/allList.jsp"><button>목록으로</button></a>
</c:if>

<c:if test="${row == 0 }">
	<h3>추가실패!</h3>
	<button onclick="history.back()">재시도</button>
</c:if>

</body>
</html>