<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>${dto.name }의 나이는 ${dto.age }살이고, ${dto.age >= 20 ? '성인' : '미자' }입니다</h3>

</body>
</html>