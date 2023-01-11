package com.itbank.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.MemberDTO;
import com.itbank.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/join")
	public ModelAndView list(MemberDTO dto) {		
		ModelAndView mav = new ModelAndView();
		List<MemberDTO> list = memberService.getList();
		mav.addObject("list", list);
		return mav;
	}
	
	@PostMapping("/join")
	public String join(MemberDTO dto) {
		int row = memberService.insert(dto);
		System.out.println(row != 0 ? "성공" : "실패");
		return "redirect:/join";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(MemberDTO user, String url, HttpSession session) {
		MemberDTO login = memberService.login(user);
		session.setAttribute("login", login);
		return "redirect:" + (url == null ? "/" : url);
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/detail")
	public ModelAndView view(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		MemberDTO ob = memberService.selectOne(dto.getIdx());
		mav.addObject("ob", ob);
		return mav;
	}
	
	@GetMapping("/modify")
	public ModelAndView selectOne(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		MemberDTO ob = memberService.selectOne(dto.getIdx());
		mav.addObject("ob", ob);
		return mav;
	}
	
	@PostMapping("/modify")
	public String modify(MemberDTO dto) {
		int row = memberService.modify(dto);
		System.out.println(row == 1 ? "수정 성공" : "수정 실패");
		return "redirect:/";
	}
	
	
	@GetMapping("/delete")
	public String delete(HttpSession session) {
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		int row = memberService.delete(dto.getIdx());
		System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
		return "redirect:/";
	}
	
}
