package com.itbank.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service	// 요청/응답, DB에 상관없는 비즈니스 로직을 구현하는 부
public class UpdownService {

	private int answer;
	
	public void initialize() {
		Random ran = new Random();
		answer = ran.nextInt(100) + 1;
	}
	
	public String getStatus(int user) {
		String status = null;
		if(answer == user) {
			status = "Correct";
			initialize();
		}
		else if(answer > user) {
			status = "UP";
		}
		else {
			status = "DOWN";
		}
		return status;
	}

}
