package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.BookDTO;

public interface BookDAO {

	@Select("select * from book3 order by idx")
	List<BookDTO> showList();

	@Insert("insert into book3 (name, author, publisher, publishDate, price, memo, score) values (#{name}, #{author}, #{publisher}, #{publishDate}, #{price}, #{memo}, #{score}) ")
	int insert(BookDTO dto);

	@Select("select * from book3 where name like '%${search}%'")
	List<BookDTO> search(String search);

	@Select("select * from book3 where idx=#{idx}")
	BookDTO selectOne(int idx);

	@Update("update book3 set name=#{name}, author=#{author}, publisher=#{publisher}, publishDate=#{publishDate}, price=#{price}, memo=#{memo}, score=#{score} where idx=#{idx}")
	int update(BookDTO dto);

	@Delete("delete book3 where idx=#{idx}")
	int delete(int idx);
	
	
}

