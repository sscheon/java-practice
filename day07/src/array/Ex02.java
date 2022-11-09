package array;

import java.util.Scanner;

public class Ex02 {
	static void show(String[] arr) {
		System.out.printf("arr[%d] : { ", arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(i == arr.length - 1 ? " }\n" : ", ");
		}
	}
	
	public static void main(String[] args) {
		
		// null. 은 성립하지 않는다
		// . 왼쪽에 null이 오면 NullPointerException
//		System.out.println(arr[i] == null); 		// 대상이 null인지 확인하기
//		System.out.println("".equals(arr[i]));		// 대상의 내용이 ""인지 확인하기
//		System.out.println("Hello".equals(arr[i]));	// 대상의 내용이 "Hello"인지 확인하기
		
		Scanner sc = new Scanner(System.in);
		int length = 2;
		String[] arr = new String[length];
		String[] tmp;
		String str;		
		
		show(arr);
		
		while(true) {
			System.out.print("문자 입력 : ");
			str = sc.nextLine();	// next()는 엔터키만 입력한 경우 입력으로 처리하지 않는다
			if (str.equals("")) {	// 입력했는데도 내용이 없으면 ""
				break;
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == null) {
					arr[i] = str;
					break;
				}
			}
			show(arr);
			
			if (arr[arr.length - 1] != null) {
				tmp = new String[arr.length + length];
				for (int i = 0; i <  arr.length; i++) {
					tmp[i] = arr[i];
				}
				arr = tmp;
			}
		}
		System.out.println("끝");
		sc.close();
	}
}
