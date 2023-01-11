package com.itbank.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.itbank.model.MemberDTO;

@Repository
public interface MemberDAO {

	List<MemberDTO> selectList();

	int insert(MemberDTO dto);

	MemberDTO login(MemberDTO user);

	MemberDTO selectOne(int idx);

	int delete(int idx);

	int update(MemberDTO dto);

}
