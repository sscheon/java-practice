package restaurant;

import java.sql.Date;

//	IDX       NOT NULL NUMBER        
//	CATEGORY  NOT NULL VARCHAR2(100) 
//	STORENAME NOT NULL VARCHAR2(100) 
//	ADDRESS   NOT NULL VARCHAR2(255) 
//	PHONENUM  NOT NULL VARCHAR2(100) 
//	PARKING   NOT NULL VARCHAR2(10)  
//	JOINDATE           DATE

public class RestaurantDTO {
	
	private int idx;
	private String category;
	private String storeName;
	private String address;
	private String phoneNum;
	private String parking;
	private Date joinDate;
	
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
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	
}
