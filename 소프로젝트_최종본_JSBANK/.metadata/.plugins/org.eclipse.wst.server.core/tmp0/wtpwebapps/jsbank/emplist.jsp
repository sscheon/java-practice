<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.EmpDAO"%>
<%@ include file="header.jsp" %>

<div class="emp">
	<table class="scrolltable2">
		<thead>
			<tr>
				<th style="width:60px">사원번호</th>
				<th style="width:80px">이름</th>
				<th style="width:60px">부서</th>
				<th style="width:60px">직급</th>
				<th style="width:150px">전화번호</th>
				<th style="width:200px">이메일</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="dto" items="${dao.selectList() }">
			<tr>
				<td style="width:60px">${dto.empno }</td>
				<td style="width:80px">${dto.ename }</td>
				<td style="width:60px">${dto.dept }</td>
				<td style="width:60px">${dto.rank }</td>
				<td style="width:150px">${dto.ephonenum }</td>
				<td style="width:200px">${dto.empemail }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>