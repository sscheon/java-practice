package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BookDTO;
import com.itbank.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<BookDTO> list = bookService.getlist();
		mav.addObject("list", list);		
		return mav;
	}
	
	@GetMapping("/insert")
	public void insert() {}
	
	@PostMapping("/insert")
	public String insert(BookDTO dto) {
		bookService.insert(dto);
		return "redirect:/list";
	}
	
	@PostMapping("/list")
	public ModelAndView search(String search) {
		ModelAndView mav = new ModelAndView("/list");
		List<BookDTO> list = bookService.search(search);
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/detail")
	public ModelAndView detail(int idx) {
		ModelAndView mav = new ModelAndView();
		BookDTO dto = bookService.selectOne(idx);
		mav.addObject("dto", dto);		
		return mav;
	}
	
	@GetMapping("/modify")
	public ModelAndView select(int idx) {
		ModelAndView mav = new ModelAndView();
		BookDTO dto = bookService.selectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@PostMapping("/modify")
	public String modify(BookDTO dto) {
		bookService.update(dto);
		return "redirect:/list";
	}
	
	@PostMapping("/delete")
	public String delete(int idx) {
		bookService.delete(idx);
		return "redirect:/list";
	}
}
