<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="jsbank.EmpDAO"%>
<%@ include file="emplist.jsp" %>

<jsp:useBean id="dao" class="jsbank.EmpDAO" />
<c:set var="dto" value="${dao.selectOne(param.empno) }" />


	<form method="POST" action="empmodify-action.jsp">
	<fieldset>
	<legend class="legend">직원 수정</legend>
		<p><input type="hidden" name="empno" value="${dto.empno }"></p>
		<p>이름 : <input type="text" name="ename" value=${dto.ename } required></p>
		<p>부서 : 
			<select name="dept" required>
				<option value="">==선택하세요==</option>
				<option ${dto.dept == '임원진' ? 'selected' : '' }>임원진</option>
				<option ${dto.dept == '인사' ? 'selected' : '' }>인사</option>
				<option ${dto.dept == '영업' ? 'selected' : '' }>영업</option>
				<option ${dto.dept == '전략기획' ? 'selected' : '' }>전략기획</option>
				<option ${dto.dept == '여신심사' ? 'selected' : '' }>여신심사</option>
				<option ${dto.dept == 'IT개발' ? 'selected' : '' }>IT개발</option>
				<option ${dto.dept == '투자상품' ? 'selected' : '' }>투자상품</option>
				<option ${dto.dept == '자금운용' ? 'selected' : '' }>자금운용</option>
			</select>
		</p>
		<p>직급 : 
			<select name="rank" required>
				<option value="">==선택하세요==</option>
				<option ${dto.rank == '회장' ? 'selected' : '' }>회장</option>
				<option ${dto.rank == '사장' ? 'selected' : '' }>사장</option>
				<option ${dto.rank == '부사장' ? 'selected' : '' }>부사장</option>
				<option ${dto.rank == '상무' ? 'selected' : '' }>상무</option>
				<option ${dto.rank == '이사' ? 'selected' : '' }>이사</option>
				<option ${dto.rank == '부장' ? 'selected' : '' }>부장</option>
				<option ${dto.rank == '차장' ? 'selected' : '' }>차장</option>
				<option ${dto.rank == '과장' ? 'selected' : '' }>과장</option>
				<option ${dto.rank == '대리' ? 'selected' : '' }>대리</option>
				<option ${dto.rank == '주임' ? 'selected' : '' }>주임</option>
				<option ${dto.rank == '사원' ? 'selected' : '' }>사원</option>
				<option ${dto.rank == '인턴' ? 'selected' : '' }>인턴</option>
			</select>
		</p>
		<p>전화번호 : <input type="text" name="ephonenum" value="${dto.ephonenum }" required></p>
		<p>이메일 : <input type="text" name="empemail" value="${dto.empemail }" required ></p>
		<p><input style="width:70px; height:40px; font-size:15px; font-weight:bold;" type="submit" value="수정"></p>
	</fieldset>
	</form>
</div>
</body>
</html>