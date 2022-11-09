package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		// 1에서 45사이의 자연수 중에서 중복되지 않은 값 6개를 추출하세요
		Random ran = new Random();
		Set<Integer> set = new HashSet<Integer>();
		
		while (set.size() < 6) {
			int num = ran.nextInt(45) + 1;
			System.out.println(num);
			set.add(num);
		}
		
		System.out.println(set);
		
		// Collection의 생성자에 다른 Collection을 넣어서 객체를 생성할 수 있다
		// 이때, 기존 컬렉션의 구성 요소가 새로운 컬렉션에 그대로 이전된다
		
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println("list : " + list);
		
		// list는 index도 있고 sort()함수도 있어서 정렬을 수행할 수 있다
		list.sort(null);
		System.out.println("list : " + list);
	}
}
