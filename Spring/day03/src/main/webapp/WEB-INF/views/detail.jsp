<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<fieldset>
	<div>도서 순번 : ${dto.idx }</div>
	<div>도서 제목 : ${dto.name }</div>
	<div>저자 : ${dto.author }</div>
	<div>출판사 : ${dto.publisher }</div>
	<div>출판일 : ${dto.publishDate }</div>
	<div>가격 : ${dto.price }원</div>
	<div>내용 : ${dto.memo }</div>
	<div>평점 : ${dto.score }</div>
	<div><a href="${cpath }/modify?idx=${dto.idx}"><button>수정</button></a></div>
	<div><a href="${cpath }/delete?idx=${dto.idx}"><button>삭제</button></a></div>
</fieldset>
<br>
<a href="${cpath }/list"><button>목록으로</button></a>

</body>
</html>