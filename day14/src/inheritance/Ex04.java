package inheritance;

// 클래스의 상속관계를 이용하여 공통 속성은 슈퍼클래스에
// 개별 속성은 각각의 서브 클래스에 만들어준다


class Human{
	String name;
	int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.printf("이름 : %s, 나이 : %d살\n", name, age);
	}
}

class Student extends Human{
	int score;
	
	Student(String name, int age, int score){
		super(name, age);
		this.score = score;
	}
	
	@Override
	void show() {
		System.out.printf("이름 : %s, 나이 : %d살, 점수 : %d\n", name, age, score);
	}
}

class Doctor extends Human{
	String major;
	
	Doctor(String name, int age, String major){
		super(name, age);
		this.major = major;
	}
	
	@Override
	void show() {
		System.out.printf("이름 : %s, 나이 : %d살, 전공 : %s\n", name, age, major);
	}
	
	// Doctor 클래스의 고유 기능 (치료), 오버라이딩 아님
	void heal(Human other) {
		System.out.printf("%s가 %s를 치료합니다\n", this.name, other.name);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Student st1 = new Student("이지은", 30, 95);
		Student st2 = new Student("홍진호", 41, 22);
		Doctor d1 = new Doctor("김사부", 45, "내과");
		Doctor d2 = new Doctor("전미도", 38, "신경외과");
		
		st1.show();
		st2.show();
		d1.show();
		d2.show();
		
		Human h1 = st1;	
		Human h2 = st2;
		Human h3 = d1;
		Human h4 = d2;
		
		System.out.println(h1.name);
		System.out.println(h2.name);
		System.out.println(h3.name);
		System.out.println(h4.name);
		
//		System.out.println(h1.score);
		System.out.println(((Student)h2).score);
//		System.out.println(h3.major);
		System.out.println(((Doctor)h4).major);
		
		// 다형성에 의해 서로 다른 타입으로 참조할 수 있지만, 타입에 따라 참조가능한 필드 범위기 달라진다
		
		h1.show();	// show() 메서드는 Human 타입에 정의되어있어서 호출이 가능
		h2.show();	// 각 객체의 메서드는 서브클래스에 의해 오버라이딩(덮어씌우기)되어 있다
		h3.show();	// 호출이 가능하지만, 호출한 후 실행되는 내용은 덮어씌운 내용으로 실행된다
		h4.show();	// 강제 형변환이 없어도 서브클래스의 내용대로 실행된다
		
		((Doctor)h4).heal(h2); 	// 오버라이딩이 아니어서 강제 형변환이 필요하다
		
		// 같은 자료형의 여러데이터를 묶어서 저장하는 구조 : 배열
		Human[] arr = {h1, h2, h3, h4};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
	}
}


// 자바 클래스의 구성 요소
// 1. 필드		속성을 저장하는 변수
// 2. 메서드		기능을 정의하는 함수
// 3. 생성자		객체를 생성하는 함수
// 4. 접근제한자	특성에 대한 접근 범위를 지정

// 자바 객체 지향의 특징
// 1. 캡슐화 : 서로 다른 자료형의 속성과 기능을 하나의 객체로 묶어서 처리한다
// 2. 상속 : 기존 클래스의 특성을 물려받아 새로운 클래스 작성
// - 필드와 메서드는 모두 물려받는다 (private 제외, protected)
// - 접근제한자는 동일하게 적용받는다
// - 생성자는 어떠한 형태이든 슈퍼클래스의 생성자를 호출해야 한다
// - 오버라이딩 메서드는 접근제한자의 범위를 좁힐 수 있다
// - 오버라이딩 메서드는 반환형, 함수이름, 매개변수의 타입과 개수가 모두 일치해야 한다
// - final 필드는 값을 수정할 수 있다
// - final 메서드는 오버라이딩 할 수 없다 (내용을 변경할 수 없다)

// 3. 추상화 : 객체화 할 수 없는 클래스. 객체들의 공통 속성만 뽑아서 만든다
// 4. 다형성 : 하나의 객체는 슈퍼클래스로도 참조될 수 있고, 서브클래스로도 참조될 수 있다
// - 서브클래스의 객체를 슈퍼클래스로 참조하는 행위를 up-casting 이라고 한다
// - up-casting 된 객체를 다시 원래의 서브클래스로 형변환하면 down-casting 이라고 한다
// - 서로 다른 유형의 객체를 묶어서 처리하려면 up-casting 을 수행한다
// - 각 객체의 고유 메서드를 수행하려면 down-casting 을 수행한다
// - up-casting 된 상태에서도 오버라이딩 메서드는 동일하게 호출할 수 있다
// - up-casting 된 객체가 특정 클래스의 객체가 맞는지 확인하기 위해 instanceof 연산자를 사용한다
// - 자바의 모든 객체는 Object 클래스를 상속하게 되어 있다


