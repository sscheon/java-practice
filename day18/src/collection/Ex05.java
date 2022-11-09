package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex05 {
	public static void main(String[] args) {
		HashMap<String, Object> p1 = new HashMap<String, Object>();
		p1.put("name", "이지은");
		p1.put("age", 30);
		
		HashMap<String, Object> p2 = new HashMap<String, Object>();
		p2.put("name", "홍진호");
		p2.put("age", 41);
		
		HashMap<String, Object> p3 = new HashMap<String, Object>();
		p3.put("name", "나단비");
		p3.put("age", 5);
		
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println(list);
		
		// list를 활용하여 다음과 같이 출력하기
		
		/*	0번째 사람이 이름은 이지은
		 * 	0번째 사람의 나이는 30 
		 */
		
		// List<HashMap<String, Object>> list
		for(int i = 0; i < list.size(); i++) {
			HashMap<String, Object> person = list.get(i);
			System.out.printf("%d번째 사람의 이름은 %s\n", i, person.get("name"));
			System.out.printf("%d번째 사람의 나이는 %d\n\n", i, person.get("age"));
		}
	}
}
