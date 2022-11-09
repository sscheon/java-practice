package 천성수3A;

public abstract class Member {
	
	protected String id;
	protected String name;
	protected int pw;
	
	public Member(String id, int pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public abstract void showInfo();
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPw() {
		return pw;
	}
	
	public void setPw(int pw) {
		this.pw = pw;
	}
}
