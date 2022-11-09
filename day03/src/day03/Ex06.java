package day03;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// if 문제
		
		// 1) 세 정수 중에서 최소값을 찾아서 출력하세요
		Random ran = new Random();
		int n1 = ran.nextInt(100) + 1;
		int n2 = ran.nextInt(100) + 1;
		int n3 = ran.nextInt(100) + 1;
		int min;		
		System.out.printf("%d, %d, %d", n1, n2, n3);
				
		min = n1;
		if (n1 <= n2 && n2 <= n3 ) {
			min = n1;
		}
		else if (n2 <= n1 && n1 <= n3) {
			min = n2;
		}
		else if (n3 <= n2 && n2 <= n1) {
			min = n3;
		}
		System.out.printf("최소값", + min);
		
		// 2) 정수를 입력받아서, 정수의 절대값을 출력하는 코드를 작성하세요
		
		Scanner sc = new Scanner(System.in);
		int n4;
		System.out.println("정수 입력 : ");
		n4 = sc.nextInt();
		if (n4 >= 0) {
			System.out.printf("%d", n4);
		}
		else {
			System.out.printf("%d", -n4);
		}
			
		// 3) 정수를 입력받아서, 입력받은 수가 홀수인지 짝수인지 판별하여 결과를 문자열로 출력하세요
		
		System.out.print("정수 입력 : ");
		int n5 = sc.nextInt();
		System.out.printf("%d는 %s입니다", n5, n5 % 2 == 0? "짝수" : "홀수");
		
	}

}
