package com.itbank.model;
//	
//	IDX         NOT NULL NUMBER        
//	CATEGORY    NOT NULL VARCHAR2(100) 
//	PRODUCTNAME NOT NULL VARCHAR2(100) 
//	PRICE                NUMBER        
//	SCORE                NUMBER(실수)        
//	THUMBNAIL   NOT NULL VARCHAR2(255) 파일 1개 업로드
//	REVIEWIMAGE NOT NULL VARCHAR2(255) 파일 여러개 업로드
//	REGISTDATE           DATE   

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class HomeplusDTO {
	
	private int idx;
	private String category;
	private String productName;
	private int price;
	private double score;
	private String thumbnail;
	private String reviewImage;
	private Date registDate;
	private MultipartFile fileName;
	private MultipartFile fileName2;
	
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getReviewImage() {
		return reviewImage;
	}
	public void setReviewImage(String reviewImage) {
		this.reviewImage = reviewImage;
	}
	public MultipartFile getFileName() {
		return fileName;
	}
	public void setFileName(MultipartFile fileName) {
		this.fileName = fileName;
	}
	public MultipartFile getFileName2() {
		return fileName2;
	}
	public void setFileName2(MultipartFile fileName2) {
		this.fileName2 = fileName2;
	}		
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}

}
