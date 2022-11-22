<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
	background-color: #f5f6f7;
	}
    #root {            
        width: 350px;
        margin: auto;
        font-size: 12px;            
    }
    #root > div {
    margin-top: 10px;
    }
    header {            
        text-align: center;
        color: #00c850;
        font-size: 50px;
        font-weight: bold;            
    }
    #root > div > input {
    width: 100%;
    height: 32px;    
    padding: 0;
    }
    select.gender {
    width: 100%;
    height: 32px;        
    }
    select.country {
    width: 100%;
    height: 32px;
    }
    .pnum {
    display: inline-block;
    }
    .pnum > input[name="pnum"]{
    width: 220px !important;    
    }
    .pnum > input[name="인증번호받기"] {  
    width: 117px !important;         
    cursor: pointer;
    border: none;
    color: white;
    font-weight: bold;
    background-color: #03c75a
    }        
    .submit {    
    margin: 5px auto;
    }
    .submit > input {
    cursor: pointer;
    border: none;
    color: white;
    font-weight: bold;
    background-color: #03c75a    
    }            
</style>
</head>
<body>
<!-- 
	HTML과 CSS위주로 네이버 회원가입 페이지를 작성
 -->
<form action="quiz-result.jsp">
    <div id="root">
        <header>
            <div>NAVER</div>
        </header>
        
        <div class="id">
            <div>
                	아이디
            </div>
            <input type="text" name="id">
        </div>
        
        <div class="pw">
            <div>
               	비밀번호
            </div>
            <input type="password" name="pw">
        </div>
        
        <div class="repw">
            <div>
                	비밀번호 재확인
            </div>
            <input type="password" name="repw">
        </div>
        
        <div class="name">
            <div>
                	이름                
            </div>
            <input type="text" name="name">            
        </div>
        
        <div class="date">
            <div>
                	생년월일
            </div>
            <input type="date" name="date">
        </div>
        
        <div class="sex">
            <div>
                	성별
            </div>
            <select class="gender" name="sex">
            	<option value="없음">없음</option>
                <option value="남자">남자</option>
                <option value="여자">여자</option>
                <option value="선택 안함">선택 안함</option>
            </select>
        </div>
        
        <div class="email">
            <div>
                본인확인 이메일(선택)
            </div>
            <input type="email" name="email">
        </div>
        
        <div class="cnum">
            <div>
                휴대전화
            </div>
            <select class="country" name="cnum">
                <option value="kor +82 ">대한민국 +82</option>
                <option value="jp +81 ">일본 +81</option>
                <option value="cha +86 ">중국 +86</option>
            </select>
        </div>
        
        <div class="pnum">
        	<input type="number" name="pnum">
        	<input type="button" name="인증번호받기" value="인증번호 받기">
        </div>
        
        <div>
            <input type="number" name="inum">
        </div> 
               
        <div class="submit">
            <input type="submit" value="가입하기">
        </div>
    </div>
</form>
</body>
</html>