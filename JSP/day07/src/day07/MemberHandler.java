package day07;

import java.util.ArrayList;
import java.util.stream.Collectors;

// 상세 기능 및 데이터 유지
// 함수 중심, 데이터를 어떤 방식(method)으로 처리할 것인가

public class MemberHandler {
	
	private ArrayList<Member> list = new ArrayList<Member>();
	
	public MemberHandler() {
		setDummy();
	}
	
	
	// private : 외부에서 호출하는 함수가 아니다 (내부 전용)
	// void : 결과를 보고할 필요가 없다. 반환하지 않아도 된다
	private void setDummy() {
		list.add(new Member("kong", "2222", "홍진호", 41, "1981-02-22"));
		list.add(new Member("IU", "1111", "이지은", 30, "1993-01-11"));
		list.add(new Member("one", "1234", "임요환", 42, "1980-01-11"));		
	}

	public ArrayList<Member> getList() {
		return list;
	}
	
	public boolean insert(Member member) {
		boolean flag = false;
		
		int dupSize = list.stream()		// 리스트의 스트림을 호출하여
			.filter(m -> m.getUserId().equals(member.getUserId()))	// 필터 (아이디가 일치하는 요소만 남긴다)
			.collect(Collectors.toList()).size();	// 다시 리스트로 변환하여, 사이즈를 int형으로 저장한다
		
		System.out.println(dupSize);
		
		if(dupSize == 0) {
			flag = list.add(member);
		}		
		return flag;
	}
	
	public Member login(Member member) {
		Member login = null;
		// 리스트에서 id와 pw가 일치하는 계정이 있으면 login 변수에 저장한다
		
		for(Member m : list) {
			if(m.getUserId().equals(member.getUserId()) && m.getUserPw().equals(member.getUserPw())) {
				login = m;
				break;
			}
		}		
		return login;
	}
	
	public int modify(Member member) {	
		int index = -1;		
		for(int i = 0; i < list.size(); i++) {
			Member m = list.get(i);
			if(m.getUserId().equals(member.getUserId())) {
				index = i;
				break;
			}
		}
		if(index >= 0) {
			list.set(index, member);
		}
		return index;
	}
}