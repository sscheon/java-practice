package reference;

class UnitTest{
	String name;
	int atk;
	int def;
	int hp;
	
	public void attack(/*UnitTest this, */UnitTest other) {	// 클래스에 작성되는 모든 함수에는 0번째 매개변수(자기자신) this를 가진다
		other.hp -= this.atk;
	}
}

public class Test {
	public static void main(String[] args) {
		UnitTest ob1 = new UnitTest();
		ob1.name = "마린";
		ob1.atk = 5;
		ob1.def = 0;
		ob1.hp = 40;
		
		UnitTest ob2 = new UnitTest();
		ob2.name = "저글링";
		ob2.atk = 6;
		ob2.def = 0;
		ob2.hp = 35;
		
		while(ob1.hp > 0 && ob2.hp > 0) {		// 두 객체의 체력이 0이 될때까지 공격한다
						
//			ob2.hp = ob2.hp - (ob1.atk - ob2.def);	// 마린이 저글링을 공격하고 남은 체력
			ob1.attack(ob2);
			
//			ob1.hp = ob1.hp - (ob2.atk - ob1.def);	// 저글링이 마린을 공격하고 남은 체력
			ob2.attack(ob1);
			
			System.out.printf("ob1 : [%s, %d]\n", ob1.name, ob1.hp);
			System.out.printf("ob2 : [%s, %d]\n", ob2.name, ob2.hp);
			System.out.println();
		}
	}
}
