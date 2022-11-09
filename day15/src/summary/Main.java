package summary;

public class Main {
	// 1) 상속 없는 클래스의 객체 생성
	public static void main(String[] args) {
		
		Human h1 = new Human("황정민");
		
		// Cat과 Dog는 개별 클래스로 작성하세요
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("감자");
		
		h1.give(c1);	// 황정민이 구름이에게 먹이를 준다
		h1.give(d1);	// 황정민이 감자에게 먹이를 준다
	}
}
