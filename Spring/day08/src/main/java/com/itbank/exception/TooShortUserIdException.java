package com.itbank.exception;

public class TooShortUserIdException extends Exception {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "ID의 길이는 8글자 이상이어야 합니다.";
	}
	 
}
