package student;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Handler hd = new Handler();		// 생성자에서 파일을 읽어들인다
		
		int select, kor, eng, mat;
		String name;
		Scanner sc = new Scanner(System.in);
		Student st;
		
		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>>>");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				hd.showList();
				break;
				
			case 2:
				System.out.print("이름 : ");	name = sc.nextLine();
				System.out.print("국어 : ");	kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 : ");	eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 : ");	mat = Integer.parseInt(sc.nextLine());
				st = new Student(name, kor, eng, mat);
				hd.insert(st);
				break;
				
			case 3:
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				hd.delete(name);
				break;
			}
		}while (select != 0);
		
		hd.reFresh();
		hd.save();	// 메인이 종료되기 직전에 저장한다
		sc.close();
	}
}
