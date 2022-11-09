package summary;

public class Main3 {
	// 3) 슈퍼클래스 Animal을 추상클래스로 만듭니다
	//    Animal의 서브클래스들은 타입에 맞는 먹이 종류를 지정하여 반환하는 함수(getFeed())를 가져야함
	//    
	public static void main(String[] args) {
		
		Human h1 = new Human("황정민");
		
		// Cat과 Dog는 개별 클래스로 작성하세요
		Cat c1 = new Cat("구름이");
		Dog d1 = new Dog("감자");
		
		h1.give(c1);	// 황정민이 구름이에게 츄르를 준다
		h1.give(d1);	// 황정민이 감자에게 개껌을 준다
	}
}
