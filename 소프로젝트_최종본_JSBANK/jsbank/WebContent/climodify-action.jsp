<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.CliDAO"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="user" class="jsbank.CliDTO"/>
<jsp:setProperty property="*" name="user"/>
<c:set var="row" value="${dao2.update(user) }" />

<c:if test="${row != 0 }">
	<h3>수정되었습니다</h3>
	<a href="${cpath }/clilist.jsp"><button>목록으로</button></a>
</c:if>

<c:if test="${row == 0 }">	
	<h3>수정 실패</h3>
	<button onclick="history.back()">이전으로</button>
</c:if>

</body>
</html>