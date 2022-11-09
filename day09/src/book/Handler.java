package book;

public class Handler {	
	
	Book[] arr = new Book[20];
	
	Handler(Book[] arr) {
		for (int i = 0; i < arr.length; i++) {
			this.arr[i] = arr[i];
		}
	}
	
	// 추가
	int insert(Book ob) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}
	
	// 삭제
	int delete(int index) {
		if(arr[index] != null) {
			arr[index] = null;
			return 1;
		}
		return 0;
	}

	// 목록
	String getList() {
		String data = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				data += arr[i].toStr();
				data += "\n";
			}
		}
		data += "\n";
		return data;
	}
}
