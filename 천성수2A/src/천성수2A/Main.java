package 천성수2A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		Todo ob;
		int select, row;
		String result, title, day, fin = "", find;
		
		do {
			System.out.println("\n\n\t Simple Todo List (작성자 : 천성수)\n");
			System.out.println("1. 목록 | 2. 추가 | 3. 완료처리 | 4. 삭제 | 0. 종료");
			System.out.print("메뉴 선택 >>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:		// 목록
				result = hd.list();
				System.out.println(result);
				break;
				
			case 2:		// 추가
				System.out.print("할 일 입력 : ");	title = sc.nextLine();
				System.out.print("날짜 입력 (yyyy.MM.dd) : ");	day = sc.nextLine();
				ob = new Todo(title, day, fin);
				row = hd.add(ob);
				if(row == 1)	System.out.println("추가 성공");
				if(row == 0)	System.out.println("추가 실패");
				break;
				
			case 3:		// 완료처리
				System.out.print("완료 처리할 일정의 이름 입력 : ");
				title = sc.nextLine();
				row = hd.update(title);
				if(row == 1)	System.out.println("수정 성공");
				if(row == 0)	System.out.println("수정 실패");
				break;
				
			case 4:		//삭제
				System.out.print("삭제할 일정의 이름 입력 : ");
				find = sc.nextLine();
				row = hd.delete(find);
				if(row == 1)	System.out.println("삭제 성공");
				if(row == 0)	System.out.println("삭제 실패");
				break;
			}
		}while (select != 0);
		System.out.println("프로그램 종료");
		sc.close();
	}
}
