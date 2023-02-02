package com.itbank.model;

import java.sql.Date;

//	idx         number          default reply1_seq.nextval primary key,
//	boardidx    number          ,
//	writer      varchar2(100)   ,
//	content     varchar2(4000)  not null,
//	writeDate   date            default sysdate,
public class ReplyDTO {

	private int idx;
	private int boardidx;
	private String writer;
	private String content;
	private Date writeDate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getBoardidx() {
		return boardidx;
	}
	public void setBoardidx(int boardidx) {
		this.boardidx = boardidx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
}
