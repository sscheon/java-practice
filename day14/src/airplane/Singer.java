package airplane;

public class Singer extends Human {

	Singer(String name) {
		super(name);
	}
	
	@Override
	void show() {
		System.out.printf("이름 : %s\n", name);
	}

}
