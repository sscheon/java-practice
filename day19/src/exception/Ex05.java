package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyExceptions extends Exception {
	
	
	private static final long serialVersionUID = -1945014608070169234L;

	@Override
	public String toString() {
		return "연산자를 입력해주세요";
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		char oper;
		int result = 0;
		
		// 두 정수와 연산자를 입력받아서 결과를 화면에 출력하는 코드를 작성하세요
		// 해당 과정에서 발생할 수 있는 예외를 최대한 많이 확인하여 try ~ catch 구문으로 작성하세요
		// 하나의 try에는 여러 catch가 연결될 수 있으며, 다형성이 적용됩니다
		// 상세한 예외부터 위에 작성하고, 포괄적인 예외는 아래쪽에 작성합니다
		try {
			
			System.out.print("정수 입력 : ");
			n1 = sc.nextInt();
			
			System.out.print("연산자 입력 : ");
			oper = sc.next().charAt(0);
			
			if (oper != '+' && oper != '-' && oper != '*' && oper != '/') {
				try {
					MyExceptions ex = new MyExceptions();
					throw ex;
				} catch (MyExceptions e) {
					System.out.println(e);
				} 
			}
			
			System.out.print("정수 입력 : ");
			n2 = sc.nextInt();
			
			if (oper == '+')	result = n1 + n2;
			if (oper == '-')	result = n1 - n2;
			if (oper == '*')	result = n1 * n2;
			if (oper == '/')	result = n1 / n2;
			
			System.out.printf("%d %s %d = %d", n1, oper, n2, result);
			
		} catch (InputMismatchException e) {
			System.err.println("정수를 입력해 주세요");
			
		} catch (NumberFormatException e) {		// 문자열을 숫자로 변환할때 발생할 수 있는 예외
			System.out.println("정수를 입력해 주세요");
			
		} catch (ArithmeticException e) {	// 정수를 0으로 나눌때 발생할 수 있는 예외
			System.err.println("0으로 나눌 수 없습니다");
			
		} catch (Exception e) {		// 모든 예외를 받아서
			e.printStackTrace();	// 예외 발생 현황을 추적하면서 출력한다 (기본값)
			
		} finally {
			sc.close();
		}
	}
}
