package movie;

public class Handler {
	
	static Movie[] arr = new Movie[10];
	
	static String getList() {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				result += (i + 1) + ") ";
				result += arr[i].getInfo();
				result += "\n";
			}
		}
		return result;
	}
	
	static String search(String keyword) {
		String searchKe = "검색 결과를 찾을 수 없습니다";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getDetail().contains(keyword)) {
				searchKe = arr[i].getDetail();
				break;
			}
		}
		return searchKe;
	}

	static int insert(Movie ob) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}
	
	static int delete(int idx) {
		if (arr[idx] != null) {
			arr[idx] = null;
			return 1;
		}
		return 0;
	}
	
	static int delete(String keyword) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getDetail().equals(keyword)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}

}
