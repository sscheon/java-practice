package com.itbank.model;

//	IDX              NUMBER         
//	WRITER  NOT NULL VARCHAR2(100)  
//	TITLE            VARCHAR2(255)  
//	CONTENT          VARCHAR2(2000)

public class BoardDTO {

	private int idx;
	private String writer;
	private String title;
	private String content;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}	
}
