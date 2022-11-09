package book;

import java.util.Scanner;

public class Main {
	
	static Book input(Scanner sc) {
		String name, writer, company;
		int price;
		double starPoint;
		
		System.out.print("책 제목 : ");
		name = sc.nextLine();
		
		System.out.print("작가 : ");
		writer = sc.nextLine();

		System.out.print("출판사 : ");
		company = sc.nextLine();

		System.out.print("가격 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.print("별점 : ");
		starPoint = Double.parseDouble(sc.nextLine());
		
		Book ob = new Book(name, writer, company, price, starPoint);
		return ob;
	}
	
	static Handler handler; 
	
	public static void main(String[] args) {
		
		int menu;
		Scanner sc = new Scanner(System.in);
		int result = 0, index;
		String list;
		
		do {
			System.out.println("1. 책 추가");
			System.out.println("2. 책 삭제");
			System.out.println("3. 책 목록");
			System.out.println("0. 종료");
			System.out.println("선택 : ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				Book ob = input(sc);
				result = handler.insert(ob);
				System.out.println(result == 1 ? "추가완료" : "추가실패");
				break;
			case 2:
				System.out.print("도서 번호를 입력하세요 : ");
				index = Integer.parseInt(sc.nextLine());
				result = handler.delete(index);
				System.out.println(result == 1 ? "삭제완료" : "삭제실패");
			case 3:
				list = handler.getList();
				System.out.println(list);
				break;
			}
			
		} while(menu != 0);
		System.out.println("===프로그램 종료===");
		sc.close();
	}
}
