<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>글 상세보기</h3>

<div class="view">
	<div>제목 : ${ob.title }</div>
	<div>글쓴이 : ${ob.writer }</div>
	<textarea>내용 : ${ob.content }</textarea>
	<span><a href="${cpath }/boardModify"><button>글 수정</button></a></span>
	<span><a href="${cpath }/boardDelete"><button>글 삭제</button></a></span>
</div>

</body>
</html>