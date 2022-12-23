<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.EmpDAO"%>
<%@ include file="emplist.jsp" %>

	<form method="POST" action="empadd-action.jsp">
	<fieldset>
	<legend class="legend">직원 추가</legend>
		<p>이름 : <input type="text" name="ename" placeholder="이름" required autofocus></p>
		<p>부서 : 	
			<select name="dept" required>
				<option value="">==선택하세요==</option>
				<option>임원진</option>
				<option>인사</option>
				<option>영업</option>
				<option>전략기획</option>
				<option>여신심사</option>
				<option>IT개발</option>
				<option>투자상품</option>
				<option>자금운용</option>
			</select>
		</p>
		<p>직급 : 	
			<select name="rank" required>
				<option value="">==선택하세요==</option>
				<option>회장</option>
				<option>사장</option>
				<option>부사장</option>
				<option>상무</option>
				<option>이사</option>
				<option>부장</option>
				<option>차장</option>
				<option>과장</option>
				<option>대리</option>
				<option>주임</option>
				<option>사원</option>
				<option>인턴</option>
			</select>
		</p>
		<p>전화번호 : <input type="text" name="ephonenum" placeholder="전화번호" required></p>
		<p>이메일 : <input type="text" name="empemail" placeholder="이메일" required ></p>
		<p><input style="width:70px; height:40px; font-size:15px; font-weight:bold;"  type="submit" value="추가"></p>
		
	</fieldset>
	</form>
</div>
</body>
</html>