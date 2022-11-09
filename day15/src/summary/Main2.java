package summary;

public class Main2 {
	// 2) 공통 특성을 가지는 Cat과 Dog를 슈퍼클래스 Animal을 상속받게 처리하세요
	//    공통의 작업은 하나의 생성자에서 처라하게 만드세요
	//    이때, Human은 Cat과 Dog를 하나의 클래스 타입으로 처리할 수 있도록 변경하세요
	public static void main(String[] args) {
		
		Human h1 = new Human("황정민");
		
		// Cat과 Dog는 개별 클래스로 작성하세요
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("감자");
		
		h1.give(c1);	// 황정민이 구름이에게 먹이를 준다
		h1.give(d1);	// 황정민이 감자에게 먹이를 준다
	}
}
