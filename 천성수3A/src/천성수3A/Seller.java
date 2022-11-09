package 천성수3A;

public class Seller extends Member {
	
	private String storeName;

	public Seller(String name, String id, int pw, String storeName) {
		super(id, pw, name);
		this.storeName = storeName;
	}

	@Override
	public void showInfo() {
		System.out.printf("판매자 | 회원이름 : %s, ID : %s, 비밀번호 : *******, 가게이름 : %s\t\n", name, id, storeName);		
	}
}
