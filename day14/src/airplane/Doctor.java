package airplane;

public class Doctor extends Human {
	String major;
	
	Doctor(String name, String major) {
		super(name);
		this.major = major;
	}
	
	@Override
	void show() {
		System.out.printf("%s의사 %s\n", major, name);
	}
	
	void heal(Human other) {
		System.out.printf("%s이 %s를 치료하였습니다\n", this.name, other.name);
	}
}
