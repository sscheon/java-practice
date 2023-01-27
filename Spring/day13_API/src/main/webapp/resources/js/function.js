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