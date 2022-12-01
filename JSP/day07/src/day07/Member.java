package day07;

// 단일 데이터의 구성을 자바 빈즈로 나타내기
// 변수 중심, 값을 저장하는 것이 주 목적

public class Member {

	private String userId;
	private String userPw;
	private String userName;
	private int age;
	private String birth;	// yyyy-MM-dd
	
	public Member() {		
	}

	public Member(String userId, String userPw, String userName, int age, String birth) {		
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.age = age;
		this.birth = birth;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}	
	
}
