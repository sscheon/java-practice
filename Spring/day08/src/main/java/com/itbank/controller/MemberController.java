package com.itbank.controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.apache.ibatis.type.TypeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.exception.TooShortUserIdException;
import com.itbank.exception.UserPwException;
import com.itbank.model.MemberDTO;
import com.itbank.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	@GetMapping("/ex01")
	public ModelAndView ex01() {
		ModelAndView mav = new ModelAndView();
		List<MemberDTO> list = memberService.getList();
		mav.addObject("list", list);		
		return mav;
	}
	
	// 특정 요청이 발생했을 때, 실행되는 함수
	@PostMapping("/ex01")
	public String ex01(MemberDTO dto) throws TooShortUserIdException, UserPwException {
		int row = memberService.add(dto);
		System.out.println(row != 0 ? "성공" : "실패");
		return "redirect:/ex01";
	}
	
	// 중복 아이디 가입이 발생했을 경우 예외를 처리하는 함수
	// 특정 예외가 발생했을 때, 실행되는 함수
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public ModelAndView duplicateId (SQLIntegrityConstraintViolationException e) {
		System.out.println("예외발생 : " + e);
		ModelAndView mav = new ModelAndView("error");
		mav.addObject("msg", "이미 사용중인 아이디입니다");
		return mav;
	}
	
	@ExceptionHandler(TypeException.class)
	public ModelAndView typeException(TypeException e) {
		String msg = e.getMessage();
		msg = msg.substring(msg.indexOf("property='"), msg.indexOf(","));
		msg = msg.substring(msg.indexOf("'") + 1, msg.lastIndexOf("'"));
		System.out.println(msg);
		
		String msg2 = "[%s] 값이 필수로 입력되어야 합니다";
		msg2 = String.format(msg2, msg);
		ModelAndView mav = new ModelAndView("error");
		mav.addObject("msg2", msg2);
		return mav;
	}
}
