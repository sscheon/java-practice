package accessModifier;

class Food {
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// private 필드의 getter/setter를 자동으로 작성하기
	// source - generate getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public Food() {};
}

public class Ex03 {
	public static void main(String[] args) {
		// 클래스 Food를 이용하여 서로 다른 음식의 객체를 2개 생성하고
		// 각 객체의 이름과 가격을 printf() 를 이용하여 같은 서식으로 출력하세요
		
		Food fd = new Food("된장찌개", 8000);		// 두개의 필드에 대해 setter를 호출한것과 같다
		Food fd2 = new Food("김치찌개", 9000);
		System.out.printf("%s의 가격은 %d원 입니다\n", fd.getName(), fd.getPrice());
		System.out.printf("%s의 가격은 %d원 입니다\n", fd2.getName(), fd2.getPrice());
		
		Food ob1 = new Food();	// 비어있는 객체, 값을 담을 수는 있지만 아직 없음
		
		
		ob1.setName("치킨");		// ob1.name = "치킨"
		ob1.setPrice(20000);	// ob1.price = 20000
		
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice());
		
	}
}
