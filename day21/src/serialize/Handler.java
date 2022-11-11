package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Handler {
	
	private ArrayList<Todo> list;
	private Scanner sc;
	
	
	

	private void load() throws IOException {
		// 생성자 내부에서 호출함. 파일에서 객체를 불러와서 리스트에 저장
		FileInputStream fis = new FileInputStream("ex03.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		sc = new Scanner(fis);
		
		
	}
	
	private void save() {	// main에서 호출함. 리스트 객체를 파일로 저장
		
	}
	
	public int insert(Todo todo) {	// 객체를 전달받아서 추가하기
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == null) {
				list.add(todo);
				return 1;
			}
		}		
		return 0;
	}
	
	public int delete(Todo todo) {	// 선택한 객체의 index를 확인하여 제거하기
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(todo)) {
				index = i;
			}
		}
		if (index != -1) {
			list.remove(index);
			return 1;
		}
		else {
			return 0;
		}
	}

}
