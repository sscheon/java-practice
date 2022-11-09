package airplane;

public class Main {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다 (1명은 못탐)
		// Human의 서브클래스는 여러개를 만들어도 됩니다
		// 이때, 최소 2명의 의사를 포함시킵니다
		
		Doctor d1 = new Doctor("이병건", "외과");
		Doctor d2 = new Doctor("주호민", "내과");
		Human h1 = new Human("홍진호");
		Human h2 = new Human("강호동");
		Human h3 = new Human("임요환");
		Singer s1 = new Singer("이지은");
		
		air.entrance(d1);
		air.entrance(d2);
		air.entrance(h1);
		air.entrance(h3);
		air.entrance(s1);
		air.entrance(h2);
			
		// 비행기 내부에서 의사가 있다면, 의사의 heal() 함수를 호출하여 대상을 치료하는 코드를 작성하세요
		
		int em = air.emergency();	// 응급상황이 발생하여 환자의 위치를 반환한다
		
		for (int i = 0; i < air.arr.length; i++) {
			if (air.arr[i] instanceof Doctor && air.arr[i] != air.arr[em]) {
				Doctor dt = (Doctor) air.arr[i];
				dt.heal(air.arr[em]);
				break;
			}
		}

	}
}
