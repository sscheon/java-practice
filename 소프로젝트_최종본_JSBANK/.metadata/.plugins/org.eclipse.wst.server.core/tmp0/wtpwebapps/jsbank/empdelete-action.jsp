<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="dao" class="jsbank.EmpDAO" />

<c:set var="row" value="${dao.delete(param.empno) }" />


<c:if test="${row != 0 }">
	<c:redirect url="/empmodify.jsp" />	
</c:if>

<c:if test="${row == 0 }">
	<h3>삭제 실패</h3>
	<button onclick="history.back()">이전으로</button>
</c:if>


</body>
</html>