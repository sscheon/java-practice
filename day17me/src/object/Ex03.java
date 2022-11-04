package object;

class MyNumber extends Object{
	int num;
	
	public MyNumber(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {	// 클래스에서 불러와서 static
		return String.valueOf(num);
	}
	@Override
	public boolean equals(Object obj) {
		// this와 obj를 비교하여 일치하면 true를 반환하고, 아니면 false를 반환한다
		if (obj instanceof MyNumber) {
			return this.num == ((MyNumber)obj).num;			
		}
		return false;
	};
}

public class Ex03 {
	public static void main(String[] args) {
		MyNumber n1 = new MyNumber(10);	// new 연산자를 사용했다면 새로운 공간에 객체를 생성한다
		MyNumber n2 = new MyNumber(10);
		System.out.println("n1 : "+ n1);
		System.out.println("n2 : "+ n2);
		System.out.println("n1 == n2 : "+ (n1 == n2));	// 두 변수가 같은 대상을 바라보는가?
		System.out.println("n1.equals(n2) : "+ n1.equals(n2));
	}
}
