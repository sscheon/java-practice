package day03;

public class Ex02 {
	public static void main(String[] args) {

		// 대문자 A부터 Z까지 한줄에 출력하세요
		// 각 글자는 ,로 구분하고 마지막에는 ,가 없어야 합니다

		char alp = 'A';
		while (true) {
			System.out.print(alp++);
			if (alp > 'Z') {
				break;
			}
			System.out.print(", ");
		}

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			String next = (ch == 'Z') ? "\n" : ", "; // char대신 String으로 쓴 이유는 ,다음에 띄어쓰기 한칸이 더 있어서이다
			System.out.print(next);
		}

	}

}
