<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="restaurant-header.jsp" %>

<jsp:useBean id="dao" class="restaurant.RestaurantDAO" />

<c:set var="row" value="${dao.delete(param.idx) }" />

<c:if test="${row != 0 }">
	<h3>삭제 성공!</h3>
	<c:redirect url="/list.jsp" />	
</c:if>

<c:if test="${row == 0 }">
	<h3>삭제 실패!</h3>
	<button onclick="history.back()">이전으로</button>
</c:if>
</body>
</html>