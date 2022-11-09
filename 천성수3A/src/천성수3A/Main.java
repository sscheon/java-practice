package 천성수3A;

import java.util.Scanner;

public class Main {
	
	static Member mb = null;
	static Handler hr = new Handler();
	static Scanner sc = new Scanner(System.in);
	static int select;
	static int row;
	static String id;
	
	public static void main(String[] args) {
				
			System.out.println("\n\t회원 관리 시스템\n");
		
		do {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 전체목록");
			System.out.println("4. 단일검색");
			System.out.println("0. 종료");
			System.out.print("선택>>> ");
			select = Integer.parseInt(sc.nextLine());
			
			switch(select) {
			case 1:
				System.out.print("어느 유형으로 가입하시겠습니까? (1. 판매자 | 2. 구매자) : ");
				select = Integer.parseInt(sc.nextLine());
				if (select == 1)	mb = makeSeller(sc);
				if (select == 2)	mb = makeCustomer(sc);
				row = hr.insert(mb);
				System.out.println(row == 1 ? "가입 성공" : "가입 실패");
				System.out.println();
				break;
				
			case 2:
				System.out.print("탈퇴할 계정의 ID를 입력하세요 : ");
				id = sc.nextLine();
				mb = hr.search(id);
				row = hr.delete(mb);
				System.out.println(row == 1 ? "탈퇴 성공" : "탈퇴 실패");
				System.out.println();
				break;
				
			case 3:
				hr.showList();
				break;
				
			case 4:
				System.out.print("검색할 회원의 ID를 입력하세요 : ");
				id = sc.nextLine();
				mb = hr.search(id);
				if (mb != null)	mb.showInfo();
				else	System.out.println(id + "ID를 찾을 수 없습니다");
				System.out.println();
				break;
			}
		}while(select != 0);
		sc.close();
		System.out.println("종료");
	}

	private static Member makeCustomer(Scanner sc) {
		String name, id, address;
		int pw;
		System.out.print("이름 : ");	name = sc.nextLine();
		System.out.print("ID : ");	id = sc.nextLine();
		System.out.print("비밀번호 (숫자만 가능) : ");	pw = Integer.parseInt(sc.nextLine());
		System.out.print("배송주소 : ");	address = sc.nextLine();
		Member mb = new Customer(name, id, pw, address);
		return mb;
	}

	private static Member makeSeller(Scanner sc) {
		String name, id, storeName;
		int pw;
		System.out.print("이름 : ");	name = sc.nextLine();
		System.out.print("ID : ");	id = sc.nextLine();
		System.out.print("비밀번호 (숫자만 가능) : ");	pw = Integer.parseInt(sc.nextLine());
		System.out.print("가게이름 : ");	storeName = sc.nextLine();
		Member mb = new Seller(name, id, pw, storeName);
		return mb;
	}
}
