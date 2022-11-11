package serialize;

import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Handler hd = new Handler();
		Scanner sc = new Scanner(System.in);
		String title;
		Date date;
		int select;
		
		do {
			System.out.println("1. 불러오기");
			System.out.println("2. 저장");
			System.out.println("3. 추가");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >>>>");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			
			case 1 : 
				
				break;
				
			case 2 : 
				
				break;
				
			case 3 : 
				break;
				
			case 4 : 
				break;
			}
			
		}while(select != 0);
		sc.close();
	}
}
