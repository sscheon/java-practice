package collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

class DataServer{
	private HashMap<String, String> map = new HashMap<String, String>();
	
	public DataServer() {
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("car", "자동차");
		map.put("desk", "책상");
		map.put("ant", "개미");
		map.put("answer", "정답");
		map.put("animal", "동물");
		map.put("chicken", "치킨");
		map.put("phone", "전화기");
		map.put("coffee", "커피");
		map.put("pizza", "피자");
	}
	
	// 사용자는 map에 직접 접근할 수는 없지만 메서드를 통해서 keyword를 포함하는 요소만 묶어서 전달받을 수 있다
	public HashMap<String, String> selectAll(String keyword){
		Set<Entry<String, String>> entrySet = map.entrySet();
		HashMap<String, String> result = new HashMap<String, String>();
		
		for(Entry<String, String> entry : entrySet) {
			if(entry.getKey().contains(keyword)){
				result.put(entry.getKey(), entry.getValue());
			}
			if(entry.getValue().contains(keyword)){
				result.put(entry.getKey(), entry.getValue());
			}
		}
		return result;
	}
}

public class Ex04 {
	public static void main(String[] args) {
	// map은 다수의 값을 하나로 묶어서 전달해야 할 때 사용한다
		Scanner sc = new Scanner(System.in);
		String keyword;
		
		System.out.print("검색할 단어를 입력하세요 : ");
		keyword = sc.nextLine();
		
		DataServer db = new DataServer();
		HashMap<String, String> result = db.selectAll(keyword);
		
		Set<String> keySet = result.keySet();
		for(String key : keySet) {
			Object value = result.get(key);
			System.out.printf("%s : %s\n", key, value);
		}
		System.out.println();
		sc.close();
	}
}
