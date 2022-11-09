package summary;

public class Human {
	
	String name;	// 필드
	
	Human(String name){		// 생성자
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void give(Companion com) {		// 메서드 / public : 접근제한자
		String form = "%s이 %s에게 %s을(를) %s준다\n";
		String feed = com.getFeed();
		String give = "";	// 슈퍼클래스 타입으로 묶어서 받아도 필요하면 구별할 수 있다
		if(com instanceof Animal)	give = "던져";
		if(com instanceof Human)	give = "건네";
		
		System.out.printf(form, this.name, com.getName(), feed, give);
	}
	
//	public void give(Dog dog) {		// 메서드
//		System.out.printf("%s이 %s에게 먹이를 준다\n", this.name, dog.name);
//	} // give라는 함수는 똑같지만 매개변수가 다르기 때문에 똑같이 써도 각각 작동한다 (오버로딩, overloading)
}
