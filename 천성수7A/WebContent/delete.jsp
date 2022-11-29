<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<section>${handler.delete(param.idx) == 1 ? '삭제 성공' : '삭제 실패' }</section>
</main>

</body>
</html>