package day08;

import java.util.ArrayList;

public class Handler {
	
	private ArrayList<Member> list = new ArrayList<Member>();

	public ArrayList<Member> getList() {
		return list;
	}
	
	public Handler() {
		if(list.isEmpty()) {
			list.add(new Member("one", "1111"));
			list.add(new Member("kong", "2222"));
			list.add(new Member("three", "3333"));			
		}
	}
	
	public boolean login(Member member) {
		boolean flag = false;		
		for(Member m : list) {
			if(m.getUserid().equals(member.getUserid()) && m.getUserpw().equals(member.getUserpw())) {
				flag = true;
				break;
			}
		}		
		return flag;
	}
}
