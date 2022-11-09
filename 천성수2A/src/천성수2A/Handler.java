package 천성수2A;

public class Handler {
	
	Todo[] arr = new Todo[10];

	String list() {		// 목록
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				result += arr[i].toString() + "\n";
			}
		}
		return result;
	}

	int add(Todo ob) {		// 추가
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}

	int delete(String find) {	// 삭제
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].title.equals(find)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}

	int update(String title) {	// 완료처리
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].title.equals(title)) {
				arr[i].fin = "[완료]";
				return 1;
			}
		}
		return 0;
	}

}
