package memberManagement;

import java.util.ArrayList;

public class Handler {

	private ArrayList<Member> list = new ArrayList<Member>();
	
	public ArrayList<Member> getList() {
		return list;
	}
	
	public void setDummy() {
		if(list.isEmpty()) {	// list의 size가 0이면
			list.add(new Member("test", "1234", "테스트", 20));
			list.add(new Member("itbank", "it", "아이티", 30));
			list.add(new Member("tt", "14", "티티", 40));			
		}
	}
	
	private boolean isDuplicate(Member ob) {		// 중복검사 함수
		for(Member m : list) {
			if(m.getUserid().equals(ob.getUserid())) {
				return true;
			}
		}
		return false;
	}
	
	public int insert(Member ob) {
		if(isDuplicate(ob)) {		// 만약 ob가 중복이면
			return 0;				// 추가하지 않고 0을 반환하면서 함수 종료
		}
		boolean flag = list.add(ob);
		return flag ? 1 : 0;
	}
	
	public void delete(String userid) {
		for (Member mem : list) {
			if(mem.getUserid().equals(userid)) {
				list.remove(mem);
				return;
			}
		}
	}
}
