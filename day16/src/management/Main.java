package management;

import java.util.Scanner;

import model.ComputerScienceStudent;
import model.EnglishLinguisticStudent;
import model.Student;

public class Main {
	
	private static Handler handler = new Handler();
	
	public static void main(String[] args) {
		
		Student st = null;
		Scanner sc = new Scanner(System.in);
		int select, row, index;
		String name;
		
		System.out.println("\n\t학생관리 프로그램\n");
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 삭제(index를 사용)");
			System.out.println("0. 종료");
			System.out.print("선택>>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				handler.showList();
				break;
				
			case 2:
				System.out.println("학생유형을 선택하세요 (1. 영문과 | 2. 컴공과) : ");
				select = Integer.parseInt(sc.nextLine());
				if(select == 1) st = makeEnglishLinguisticStudent(sc);
				if(select == 2) st = makeComputerScienceStudent(sc);
				row = handler.insert(st);
				System.out.println(row == 1 ? "추가 성공" : "추가 실패");
				break;
				
			case 3:
				System.out.print("검색할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);
				if(st != null)	st.showDetail();
				else	System.out.println(name + "학생을 찾을 수 없습니다");
				break;
				
			case 4:
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);	// 이름을 전달받아서 이름이 일치하는 학생 객체를 반환
				row = handler.delete(st);	// 그 학생을 전달받아서 함수 실행
				break;
				
			case 5:
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				index = handler.indexOf(name);
				row = handler.delete(index);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;
			}
			sc.close();
			System.out.println("종료");
		}while(select != 0);
	}

	private static Student makeComputerScienceStudent(Scanner sc) {
		String name;
		int  kor, eng, mat, java, network, linux;
		System.out.print("이름 : ");	name = sc.nextLine();
		System.out.print("국어점수 : ");	kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 : ");	eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 : ");	mat = Integer.parseInt(sc.nextLine());
		System.out.print("자바점수 : ");	java = Integer.parseInt(sc.nextLine());
		System.out.print("네트워크점수 : ");		network = Integer.parseInt(sc.nextLine());
		System.out.print("리눅스점수 : ");	linux = Integer.parseInt(sc.nextLine());
		Student st = new ComputerScienceStudent(name, kor, eng, mat, java, network, linux);
		return st;
	}

	private static Student makeEnglishLinguisticStudent(Scanner sc) {
		String name;
		int  kor, eng, mat, literature, translation;
		System.out.print("이름 : ");	name = sc.nextLine();
		System.out.print("국어점수 : ");	kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 : ");	eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 : ");	mat = Integer.parseInt(sc.nextLine());
		System.out.print("문학점수 : ");	literature = Integer.parseInt(sc.nextLine());
		System.out.print("번역점수 : ");	translation = Integer.parseInt(sc.nextLine());
		Student st = new EnglishLinguisticStudent(name, kor, eng, mat, literature, translation);	
		return st;
	}
}
