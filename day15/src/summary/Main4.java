package summary;

public class Main4 {
	// 4) Human의 서브클래스 Friend를 작성하세요
	//    Cat과 Dog와 Friend는 서로 다른 슈퍼클래스를 가집니다
	//    Cat과 Dog와 Friend를 하나의 인터페이스로 묶어주고 필요한 작업을 처리하세요
	
	public static void main(String[] args) {
		
		Human h1 = new Human("황정민");
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("감자");
		Friend f1 = new Friend("하정우");
		
		h1.give(c1);	// 황정민이 구름이에게 츄르를 준다
		h1.give(d1);	// 황정민이 감자에게 개껌을 준다
		h1.give(f1);	// 황정민이 하정우에게 주먹밥을 준다
	}
}
