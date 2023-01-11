package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDTO;
import com.itbank.repository.BoardDAO;

@Service
public class boardService {

	@Autowired
	private BoardDAO dao;

	public List<BoardDTO> getList() {
		return dao.selectList();
	}

	public int add(BoardDTO dto) {
		return dao.add(dto);
	}

	public BoardDTO selectOne(int idx) {
		return dao.selectOne(idx);
	}

	public BoardDTO modify(int idx) {
		return dao.selectOne(idx);
	}

	public int update(BoardDTO dto) {
		return dao.modify(dto);
	}	
	

}
