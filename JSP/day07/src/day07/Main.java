package day07;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		MemberHandler memberHandler = new MemberHandler();
		
		ArrayList<Member> list = memberHandler.getList();		
		
		for(Member m : list) {
			System.out.println(m.getUserId() + " / ");
			System.out.println(m.getUserPw() + " / ");
			System.out.println(m.getUserName() + " / ");
			System.out.println(m.getAge() + " / ");
			System.out.println(m.getBirth() + " / ");
		}
	}
}
