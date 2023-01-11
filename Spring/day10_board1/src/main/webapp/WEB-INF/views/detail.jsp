<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>회원 정보</h3>

<div class="detail">
	<div class="id">아이디 : ${ob.userid }</div>
	<div class="pw">비밀번호 : ${ob.userpw }</div>
	<div class="name">이름 : ${ob.userName }</div>
	<div class="birth">생일 : ${ob.birth }</div>
	<div class="gender">성별 : ${ob.gender }</div>
	<span><a href="${cpath }/modify"><button>정보 수정</button></a></span>
	<span><a href="${cpath }/delete"><button>회원 탈퇴</button></a></span>
</div>

</body>
</html>