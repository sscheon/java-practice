package com.itbank.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.exception.TooShortUserIdException;
import com.itbank.exception.UserPwException;
import com.itbank.model.MemberDTO;
import com.itbank.repository.MemberDAO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;

	public List<MemberDTO> getList() {		
		return dao.selectList();
	}

	public int add(MemberDTO dto) throws TooShortUserIdException, UserPwException {
		// 입력받는 나이가 0이면 예외 발생
		int age = Integer.parseInt(new SimpleDateFormat("yyyy").format(dto.getBirth()));
		age = 2023 - age;
		System.out.println(age);
		
		int tmp = 100 / age;		
		System.out.println(tmp);
		
		// 입력받은 ID가 8글자 미만이면 강제로 예외 발생시킨다
		if(dto.getUserid().length() < 8) {
			throw new TooShortUserIdException();
		}
		
		// 입력받은 PW는 8글자 이상이고 영문 대문자, 소문자, 숫자를 포함하고 특수문자는 쓸수없다
		if(isWrongPasswordRegExp(dto.getUserpw())) {
			throw new UserPwException();
		}

		return dao.insert(dto);
	}
	
	// 입력받은 PW는 8글자 이상이고 영문 대문자, 소문자, 숫자를 포함하고 특수문자는 쓸수없다
	private boolean isWrongPasswordRegExp (String userpw) {
		String regex = "^[a-zA-Z0-9]{8,}$";
		boolean flag = userpw.matches(regex) == false;
		System.out.println(flag);
		return flag;
	}

}
