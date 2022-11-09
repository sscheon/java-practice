package oop;

class Circle{
	double radius;		// 반지름
	double pi = 3.14;	// 클래스의 멤버 필드는 초기값을 미리 지정할 수 있다
	double area;		// 원의 넓이 (반지름 * 반지름 * pi)
	double length;		// 원의 둘레 (반지름 * 2 * pi)
	
	// 생성자 : 객체를 생성하는 메서드(method : 방식)
	// 생성자 오버로딩 : 객체를 생성하는 여러방식을 제공하겠다
	
	// 생성자 내부에서 또다른 생성자를 호출하려면 항상 첫번째줄에서만 가능하다
	
	// 1) 반지름을 전달받지 않으면, 기본값 3을 적용한다
	Circle() {
//		Circle(3.0)		// 생성자 내부에서 또다른 생성자를 호출할 때는  this키워드를 사용
//		radius = 3;
		this(3.0);
	}
	// 2) 반지름을 정수로 전달받으면, 생성자에서 둘레와 면적을 계산하여 저장한다
	Circle(int radius) {
		this((double)radius);
//		this.radius = radius;
//		area = pi * pi * radius;
//		length = 2 * pi * radius;
	}
	// 3) 반지름을 실수로 전달받으면, 생성자에서 둘레와 면적을 계산하여 저장한다
	Circle(double radius) {
		this.radius = radius;
		area = pi * pi * radius;
		length = 2 * pi * radius;
	}
	
	void show() {
		System.out.printf("반지름 : %.2fcm\n", radius);
		System.out.printf("원의 넓이 : %.2fcm^2\n", area);
		System.out.printf("원의 둘레 : %.2fcm\n", length);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Circle ob1 = new Circle();
		Circle ob2 = new Circle(4);
		Circle ob3 = new Circle(2.4);
		
		ob1.show();
		ob2.show();
		ob3.show();
	}
}
