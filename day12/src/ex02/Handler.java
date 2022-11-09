package ex02;

public class Handler {
	
	Student[] arr = new Student[5];

	String selectAll() {	// 목록
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				result += arr[i].toString() + "\n";
			}
		}
		return result;
	}

	int insert(Student ob) {	// 추가
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				return 1;
			}
		}
		return 0;
	}

	String search(String find) {	// 찾기
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].name.equals(find)) {
				return arr[i].toString();
			}
		}
		return null;
	}

	int update(String find, int kor, int eng, int mat) {	// 수정
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].name.equals(find)) {
				arr[i].kor = kor;
				arr[i].eng = eng;
				arr[i].mat = mat;
				arr[i].sum = kor + eng + mat;
				arr[i].avg = arr[i].sum / 3.0;
				return 1;
			}
		}
		return 0;
	}

	int delete(String find) {	// 삭제
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
}
