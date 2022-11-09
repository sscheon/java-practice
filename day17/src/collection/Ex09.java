package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex09 {
	public static void main(String[] args) {
		Integer[] arr = { 2, 7, 8, 4, 6 };
		List<Integer> list = Arrays.asList(arr);	// .asList 배열을 리스트로 바꾸어주는 함수
		List<Integer> list2 = new ArrayList<Integer>(list);
		
		System.out.println(list);
		System.out.println(list2);
		
		list.sort((a, b) -> {
			return a - b;
		});
		System.out.println(list);
		System.out.println(list2);
	}
}
