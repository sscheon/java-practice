package oop;

class Test2{
	int num;
	
	// 기본 생성자
	Test2() {
		this(0);	// 첫번째 줄에만 쓸수있는 이유는 객체의 생성이 마무리가 되어야하기 때문이다
		System.out.println("기본 생성자 호출 !!");
		
		//  1) 객체의 생성 (생성이 완료되지 않으면, 추가작업을 진행할 수 없다)
		//	2) 객체의 생성 이후 초기값 할당 및 추가 작업 진행
	}
	
	Test2(int num) {
		this.num = num;
		System.out.println("int를 전달받은 생성자 호출 !!");
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Test2 ob1 = new Test2();
		Test2 ob2 = new Test2(12);
	}
}
