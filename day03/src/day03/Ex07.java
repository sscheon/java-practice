package day03;

import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int current;
		
		Integer [] elevators = {			// 랜덤으로 정수를 2개 가지는 배열
			ran.nextInt(15) + 1,
			ran.nextInt(15) + 1,
			ran.nextInt(15) + 1,
		};
		
		List<Integer> el = Arrays.asList(elevators);	// 배열을 리스트로 변환
		System.out.println(el);
		
		System.out.println("현재 층 : ");
		current = sc.nextInt();
		
		int min = 15;		// 최소값을 저장할 변수
		int index = 0;		// 최소값은 몇번째 위치에 있는지 저장할 변수
		for (int i = 0; i<el.size(); i++) {
			int dist = Math.abs(current - el.get(i));	// 절대값을 구하여 거리를 만들어두고
			if (min > dist) {		// 거리의 최소값이 몇번째인지에 따라
				min = dist;
				index = i;			// index 변수에 i값을 저장
			}
		}
		System.out.printf("%d번째 엘리베이터가 움직입니다\n", index + 1);	// index는 0부터 시작하므로 +1
		sc.close();
	}

}
