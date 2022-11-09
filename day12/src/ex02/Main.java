package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 사용자 입력 > main의 지역변수 > 클래스의 생성자로 전달 > 객체의 멤버 필드에 저장 > 객체를 배열에 저장
		
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		Student ob;
		int select, kor, eng, mat;
		int row;
		String result, name, find;
		
		do {
			System.out.println("\n학생 점수 관리 프로그램\n");
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >>>>>");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select){
			case 1 :	// 목록 (hd에게 결과를 요청하고, 결과를 result에 저장하여 출력)
				result = hd.selectAll();
				System.out.println(result);
				break;
				
			case 2 :	// 추가 
				System.out.print("이름 입력 : ");	name = sc.nextLine();
				System.out.print("국어점수 입력 : ");	kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어점수 입력 : ");	eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학점수 입력 : ");	mat = Integer.parseInt(sc.nextLine());
				ob = new Student(name, kor, eng, mat);	// 입력받은 값으로 새로운 객체를 하나 생성
				row = hd.insert(ob);
				if (row == 1)	System.out.println("추가 성공");
				if (row != 1)	System.out.println("추가 실패");
				break;
				
			case 3 :	// 검색(검색어를 입력받아서 검색어를 hd에게 전달, 결과를 받아서 화면에 출력)
				System.out.print("검색할 학생이름 입력 : ");
				find = sc.nextLine();
				result = hd.search(find);
				if (result != null)	System.out.println(result);
				if (result == null)	System.out.println("찾기 실패");
				break;
				
			case 4 :	// 수정
				System.out.print("수정할 학생이름 입력 : ");
				find = sc.nextLine();
				System.out.print("수정할 국어점수 입력 : ");
				kor = Integer.parseInt(sc.nextLine());
				System.out.print("수정할 영어점수 입력 : ");
				eng = Integer.parseInt(sc.nextLine());
				System.out.print("수정할 수학점수 입력 : ");
				mat = Integer.parseInt(sc.nextLine());
				row = hd.update(find, kor, eng, mat);
				if (row == 1)	System.out.println("수정 성공");
				if (row != 1)	System.out.println("수정 실패");
				break;
				
			case 5 :	// 삭제
				System.out.print("삭제할 학생이름 입력 : ");
				find = sc.nextLine();
				row = hd.delete(find);
				if (row == 1)	System.out.println("삭제 성공");
				if (row != 1)	System.out.println("삭제 실패");
				break;
			}
		}while (select != 0);
		System.out.println("프로그램 종료");
		sc.close();
	}
}
