function getHTMLfromDTO(dto) {
	let tag = ``
	tag += `<details class="item">`
		
	for(let key in dto) {
		if(key == 'TITLE') {
			tag += `<summary class="${key}">${dto[key]}</summary>`
		}
		else if(key.includes('MAIN_IMG_NORMAL')) {
			tag += `<img src="${dto[key]}" height="200">`
		}
		else {
			tag += `<div class="${key}">${dto[key]}</div>`
		}
	}
	tag += `</details>`
	return tag
}

function getYY(date) {
	const yyyy = date.getFullYear()
	let mm = date.getMonth() + 1
	let dd = date.getDate()
	
	mm = mm < 10 ? '0' + mm : mm
	dd = dd < 10 ? '0' + dd : dd
			
	const ret = `${yyyy}-${mm}-${dd}`
	return ret
}