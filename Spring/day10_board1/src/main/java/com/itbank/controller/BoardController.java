package com.itbank.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.BoardDTO;
import com.itbank.service.boardService;

@Controller
public class BoardController {
	
	@Autowired
	private boardService boardService;

	@GetMapping("/board")
	public ModelAndView list(BoardDTO dto) {
		ModelAndView mav = new ModelAndView();
		List<BoardDTO> list = boardService.getList();
		mav.addObject("list", list);
		return mav;
	}
	
	@GetMapping("/board/boardAdd")
	public String add() {
		return "boardAdd";
	}
	
	@PostMapping("/board/boardAdd")
	public String add(BoardDTO dto) {
		int row = boardService.add(dto);
		System.out.println(row != 0 ? "추가 성공" : "추가 실패");
		return "redirect:/board";		
	}
	
	@GetMapping("/board/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("view");
		BoardDTO ob = boardService.selectOne(idx);
		mav.addObject("ob", ob);
		return mav;
	}
	
	@GetMapping("/board/boardModify/{idx}")
	public ModelAndView selectOne(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("boardModify");
		BoardDTO dto = boardService.modify(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
	@PostMapping("/board/boardModify/{idx}")
	public String modify(BoardDTO dto) {
		int row = boardService.update(dto);
		System.out.println(row != 0 ? "수정 성공" : "수정 실패");
		return "redirect:/board";
	}
}
