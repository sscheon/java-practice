package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Quiz {
	public static void main(String[] args) {
		String json = "[";
		json += "{\"name\" : \"강하늘\", \"pnum\" : \"010-2323-2323\"}";
		json += ",";
		json += "{\"name\" : \"홍진호\", \"pnum\" : \"010-2222-2222\"}";
		json += "]";
		System.out.println(json);
		// ArrayList와 HashMap을 이용하여 위 문자열에서 데이터만 추출하여
		// 객체 형식으로 저장하고 출력하세요
		// split, replace, trim 등의 문자열 함수를 적극적으로 활용하세요
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		
		// 필요없는 글자는 제거한다
		json = json.replace(" ", "");
		json = json.replace("\"", "");
		System.out.println(json);
		
		// 반복문 안에서 각 객체를 구별하여 변수에 담는다
		while(json.contains("{")) {
			int begin = json.indexOf("{");
			int end = json.indexOf("}") + 1;
			String person = json.substring(begin, end);
			json = json.substring(end + 1);
			System.out.println(person);
		}
		
		
		
		System.out.println(list);
	}
}
