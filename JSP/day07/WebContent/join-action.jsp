<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<%--
	1) 객체 생성
	2) 파라미터값을 객체에 대입
	3) 핸들러를 통해 리스트에 추가
	4) list.jsp로 페이지 이동(redirect)
 --%>


<jsp:useBean id="user" class="day07.Member"/>
<jsp:setProperty property="*" name="user"/>

<%--
 	memberHandler.insert(user);
 	response.sendRedirect("list.jsp");
--%>

<h3>${memberHandler.insert(user) ? '가입 성공' : '가입 실패' }</h3>
<a href="${cpath }/list.jsp"><button>목록으로</button></a>
<button onclick="history.back()">뒤로가기</button>


</body>
</html>