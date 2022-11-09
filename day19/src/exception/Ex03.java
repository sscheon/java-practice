package exception;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		int index;
		
		System.out.print("몇번째 정수를 출력할까요 : ");
		try {
			index = sc.nextInt();
			
			System.out.printf("arr[%d] : %d\n", index, arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("입력 범위를 벗어났습니다");
			System.err.println("0에서 4사이의 값을 입력하세요");
		}
		sc.close();
	}
}
