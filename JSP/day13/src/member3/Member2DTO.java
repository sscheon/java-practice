package member3;

import java.sql.Date;

	//IDX        NOT NULL NUMBER        
	//USERID     NOT NULL VARCHAR2(100) 
	//USERPW     NOT NULL VARCHAR2(255) 
	//USERNAME   NOT NULL VARCHAR2(100) 
	//JOINDATE            DATE          
	//GENDER              VARCHAR2(10)  
	//PROFILEIMG          VARCHAR2(255) 

public class Member2DTO {

	private int idx;
	private String userid;
	private String userpw;
	private String username;
	private Date joindate;
	private String gender;
	private String profileimg;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfileimg() {
		return profileimg;
	}
	public void setProfileimg(String profileimg) {
		this.profileimg = profileimg;
	}
	
	
}
