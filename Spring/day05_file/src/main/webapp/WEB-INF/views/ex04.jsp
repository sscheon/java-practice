<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<%@ include file="header.jsp" %>

<h3>DTO를 이용한 여러 파일 업로드</h3>

<form method="POST" enctype="multipart/form-data">
	<p><input type="text" name="name" placeholder="이름"></p>
	<p><input type="number" name="age" placeholder="나이"></p>
	<p>
		<label><input type="checkbox" name="color" value="red">빨강</label>
		<label><input type="checkbox" name="color" value="blue">파랑</label>
		<label><input type="checkbox" name="color" value="green">초록</label>
	</p>
	
	<p><input type="file" name="uploadFile" multiple></p>
	
	<p><input type="submit"></p>
</form>

<table>
	<thead>
		<tr>
			<th>name</th>
			<th>age</th>
			<th>fileName</th>
			<th>이미지 태그</th>
		</tr>
	</thead>
	<c:forEach var="dto" items="${list }">
	<tr>
		<td>${dto.name }</td>
		<td>${dto.age }</td>
		<td>${dto.fileName }</td>
		<td>
			<c:choose>
				<c:when test="${fn:contains(dto.fileName, ',') }">
					<c:forTokens var="name" items="${dto.fileName }" delims=",">
						<img src="${cpath }/upload/${name }" height="100px">					
					</c:forTokens>
				</c:when>
				
				<c:otherwise>
					<img src="${cpath }/upload/${dto.fileName }" height="100px">
				</c:otherwise>
			</c:choose>
		</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>