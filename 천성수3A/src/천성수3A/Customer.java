package 천성수3A;

public class Customer extends Member {
	
	private String address;

	public Customer(String name, String id, int pw, String address) {
		super(id, pw, name);
		this.address = address;
	}

	@Override
	public void showInfo() {
		System.out.printf("구매자 | 회원이름 : %s, ID : %s, 비밀번호 : *******, 배송주소 : %s\t\n", name, id, address);
	}
}
