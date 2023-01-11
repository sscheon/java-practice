package com.itbank.repository;

import java.util.List;

import com.itbank.model.BoardDTO;

public interface BoardDAO {

	List<BoardDTO> selectList();

	int add(BoardDTO dto);

	BoardDTO selectOne(int idx);

	int modify(BoardDTO dto);

}
