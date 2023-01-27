<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.item {
		position: relative;
		border: 1px solid black;
		padding: 10px;
		margin: 10px 0;
	}
	.LAT, .LNG, .MAIN_IMG_THUMB {
		display: none;
	}
	.MAIN_IMG_NORMAL {
		position: absolute;
		top: 10px;
		right: 10px;
		background-position: center center;
		background-size: auto 100%;
		width: 250px;
		height: 250px;
	}
	.TRFC_INFO {
		width: 70%;
	}
</style>
</head>
<body>

<h1>ex01.jsp</h1>
<hr>

<div id="root"></div>

<script>
	// AJAX요청은 서버의 설정에 따라서 javascript에 의해 실행되지 않을 수도 있다
	// Cross-Origin Resource Sharing (교차 출처 리소스 공유)
	// API 서버의 주소와 자바스크립트가 실행중인 문서의 주소가 서로 다르다면 자원을 응답받지 못한다
	
	
	// 어제의 경우)
	// 자바스크립트가 실행되는 문서의 주소 : http://localhost:8080/day12/homeplus
	// 자원을 제공하는 서버의 주소 또한 http://localhost:8080/day12/homeplus/dataList
	const url = 'https://apis.data.go.kr/6260000/AttractionService/getAttractionKr?serviceKey=BUqn7KhXDZy%2BSvuyPyUSFqWhhfFcBR9tNIZLD%2F1jb9lFjFyQnK4SQM42exU70wRahiqpq6wmf8c%2BH37JG7b6zw%3D%3D&pageNo=1&numOfRows=10&resultType=json'
	fetch(url)
	.then(resp => resp.json())
	.then(json =>{
		const arr = json.getAttractionKr.item
		//console.log(arr)
		
		const root = document.getElementById('root')
		
		arr.forEach(dto => {
			const item = document.createElement('div')
			item.className = 'item'
			
			for(let key in dto) {	// 대상이 js객체일때, 객체의 모든 속성이름에 접근한다
				//console.log(key, dto[key])
				const div = document.createElement('div')
				div.className = key
				div.innerText = dto[key]
				item.appendChild(div)
			}
			
			
			// 자바스크립트에서 css 속성에 접근할 때  -로 연결되는 이름은 classCase로 바꿔서 접근한다
			// font-weight -> fontWeight
			const imgNormal = item.querySelector('.MAIN_IMG_NORMAL')
			imgNormal.style.backgroundImage = 'url(' + imgNormal.innerText + ')'			
			imgNormal.innerText = ''			
			root.appendChild(item)
		})
	})
	
</script>

</body>
</html>