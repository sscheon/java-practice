<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="dao2" class="jsbank.CliDAO" />

<c:set var="row" value="${dao2.delete(param.clino) }" />

<c:if test="${row != 0 }">
	<h3>삭제 성공</h3>
	<c:redirect url="/climodify.jsp" />	
</c:if>

<c:if test="${row == 0 }">
	<h3>삭제 실패</h3>
	<button onclick="history.back()">이전으로</button>
</c:if>


</body>
</html>