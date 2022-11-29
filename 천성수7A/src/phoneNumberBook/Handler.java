package phoneNumberBook;

import java.util.ArrayList;

public class Handler {
	
	private ArrayList<PhoneNumberBook> list = new ArrayList<PhoneNumberBook>();
	private int idx = 0;
	
	private int nextIdx() {
		return ++idx;
	}
	
	public Handler() {
		if(list.isEmpty()) {
			list.add(new PhoneNumberBook(nextIdx(), "임요환", "010-1111-1111"));
			list.add(new PhoneNumberBook(nextIdx(), "홍진호", "010-2222-2222"));
			list.add(new PhoneNumberBook(nextIdx(), "라이언", "010-1234-1234"));
			list.add(new PhoneNumberBook(nextIdx(), "춘식이", "010-5678-5678"));
		}
	}
	
	public ArrayList<PhoneNumberBook> getList() {
		return list;
	}
	
	public String insert(PhoneNumberBook pnb) {
		pnb.setIdx(nextIdx());
		list.add(pnb);
		return "추가 완료";
	}
	
	public int delete(int idx) {
		boolean flag = list.removeIf(pnb -> pnb.getIdx() == idx);
		return flag ? 1 : 0;
	}
	
	public PhoneNumberBook getItem(int idx) {
		PhoneNumberBook pnb = null;
		for(PhoneNumberBook pnb2 : list) {
			if(pnb2.getIdx() == idx) {
				pnb = pnb2;
				break;
			}
		}		
		return pnb;
	}
	
	public int modify(PhoneNumberBook pnb) {	
		int index = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getIdx() == pnb.getIdx()) {
				index = i;
				break;
			}
		}
		list.set(index, pnb);	
		return index;
	}
}
