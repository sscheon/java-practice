package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BookDTO;
import com.itbank.repository.BookDAO;

@Service
public class BookService {
	
	@Autowired
	private BookDAO dao;

	public List<BookDTO> getlist() {		
		return dao.showList();
	}

	public int insert(BookDTO dto) {
		return dao.insert(dto);
	}

	public List<BookDTO> search(String search) {
		return dao.search(search);
	}

	public BookDTO selectOne(int idx) {
		return dao.selectOne(idx);
	}

	public int update(BookDTO dto) {
		return dao.update(dto);		
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}
	
	
}
