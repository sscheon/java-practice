package com.itbank.exception;

public class UserPwException extends Exception {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "비밀번호는 최소 8글자 숫자 영문 대소문자로 작성해주세요";
	}
}
