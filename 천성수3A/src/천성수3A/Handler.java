package 천성수3A;

public class Handler {
	
	Member[] arr = new Member[100];

	// 추가
	public int insert(Member mb) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].id.equals(mb.id)) {
				System.out.println("중복된 ID가 있습니다");
				return 0;
			}
			else if (arr[i] == null) {
				arr[i] = mb;
				return 1;
			}
		}
		return 0;
	}
	
	// 삭제
	public int delete(Member mb) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == mb) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
	
	// 검색
	public Member search(String id) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getId().equals(id)) {
				return arr[i];
			}
		}
		return null;
	}
	
	// 목록
	public void showList() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].showInfo();
			}
		}
		System.out.println();
	}
}
