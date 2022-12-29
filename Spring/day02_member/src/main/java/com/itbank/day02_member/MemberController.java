package com.itbank.day02_member;

import java.util.List;

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
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<MemberDTO> list = memberService.getlist();
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public String add(MemberDTO dto) {
		memberService.insert(dto);
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public void delete() {}
	
	@PostMapping("/delete")
	public String delete(int idx) {
		memberService.delete(idx);
		return "redirect:/list";
	}
	
	@GetMapping("/selectOne")
	public void selectOne() {}
		
	@PostMapping("/selectOne")
	public String selectOne(int idx) {		
		return "redirect:/modify?idx="+idx;
	}
	
	@GetMapping("/modify")
	public ModelAndView select(int idx) {
		ModelAndView mav = new ModelAndView();
		MemberDTO dto = memberService.selectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}	
	
	@PostMapping("/modify")
	public String modify(MemberDTO dto) {
		memberService.modify(dto);
		return "redirect:/list";
	}
}
