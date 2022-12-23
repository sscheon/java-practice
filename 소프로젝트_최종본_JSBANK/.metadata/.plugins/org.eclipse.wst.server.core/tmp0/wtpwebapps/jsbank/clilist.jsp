<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.CliDAO"%>
<%@ include file="header.jsp" %>


<table class="scrolltable">
	<thead>
		<tr>
			<th style="width:80px">고객번호</th>
			<th style="width:80px">고객이름</th>
			<th style="width:120px">주민번호</th>
			<th style="width:120px">전화번호</th>
			<th style="width:140px">계좌번호</th>
			<th style="width:120px">집주소</th>
			<th style="width:250px">이메일</th>
			<th style="width:80px">상품번호</th>
			<th style="width:80px">신용등급</th>
			<th style="width:100px">가입일</th>
			<th style="width:80px">담당자</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="dto" items="${dao2.selectList() }">
		<tr>
			<td style="width:80px">${dto.clino }</td>
			<td style="width:80px">${dto.cname }</td>
			<td style="width:120px">${dto.regnum }</td>
			<td style="width:120px">${dto.cphonenum }</td>
			<td style="width:140px">${dto.acntnum }</td>
			<td style="width:120px">${dto.address }</td>
			<td style="width:250px">${dto.cliemail }</td>
			<td style="width:80px">${dto.bpno }</td>
			<td style="width:80px">${dto.grade }</td>
			<td style="width:100px">${dto.bpdate }</td>
			<td style="width:80px">${dto.empno }</td>
		</tr>
	</c:forEach>
	</tbody>
</table>


</body>
</html>