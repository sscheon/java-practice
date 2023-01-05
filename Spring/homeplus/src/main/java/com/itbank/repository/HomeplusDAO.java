package com.itbank.repository;

import java.util.List;

import com.itbank.model.HomeplusDTO;

public interface HomeplusDAO {

	List<HomeplusDTO> selectAllList();

	int insert(HomeplusDTO dto);

	List<HomeplusDTO> selectOne();

	HomeplusDTO view(int idx);	
}
