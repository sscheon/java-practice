package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.model.ReplyDTO;
import com.itbank.service.BoardService;

@RestController
@RequestMapping("/board/reply")
public class ReplyController {

	@Autowired private BoardService boardService;
	
	@GetMapping("/{boardidx}")
	public List<ReplyDTO> getReplyList(@PathVariable("boardidx") int boardidx) {
		List<ReplyDTO> list = boardService.getReplyList(boardidx);
		return list;
	}
	
	@PostMapping("/{boardidx}")
	public int writeReply(@RequestBody ReplyDTO dto) {
		int row = boardService.writeReply(dto);
		return row;
	}
	
	@DeleteMapping("/{boardidx}/{idx}")
	public int deleteReply(@PathVariable("idx") int idx) {
		int row = boardService.deleteReply(idx);
		System.out.println("삭제할 댓글 idx : " + idx);
		return row;
	}
}
