package day03;

import java.util.Random;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n1 = ran.nextInt(15) + 1;
		int n2 = ran.nextInt(15) + 1;
		int n3 = ran.nextInt(15) + 1;
		int current;
		
		System.out.printf("1번 엘베 : %d, 2번 엘베 : %d, 3번 엘베 : %d\n", n1, n2, n3);
		/*
		 * 1층에서 15층 사이의 엘리베이터가 3개가 있습니다 사용자에게 현재 층을 입력받아서 가장 가까운 엘리베이터가 이동할 수 있도록 출력문을
		 * 만들어서 출력해주세요
		 */
		
		// 가장 가까운 엘리베이터
		// 거리가 최소값인 엘리베이터
		// 절대값(현재층 - 대상층)중에서 최소값을 가지는 엘리베이터
		
		System.out.println("1~ 15중 현재 층 수 입력 : ");
		current = sc.nextInt();

		n1 = n1 - current;
		n2 = n2 - current;
		n3 = n3 - current;

		if (n1 < 0) {
			n1 *= -1;
		}
		if (n2 < 0) {
			n2 *= -1;
		}
		if (n3 < 0) {
			n3 *= -1;
		}
		
		if (n1 <= n2 && n2 <= n3) {
			System.out.println("1번 엘베");
		}
		else if (n2 <= n1 && n1 <= n3) {
			System.out.println("2번 엘베");
		}
		else if (n3 <= n2 && n2 <= n1) {
			System.out.println("3번 엘베");
		}
		sc.close();

	}

}
