package sort;

public class Ex07 {
	public static void main(String[] args) {
		String str = "Helloworld";
		char[] arr = str.toCharArray();		// String을 char[] 로 바꿔주는 함수
		
		for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			System.out.print(ch + " ");
		}
		System.out.println();
		
		// 정렬을 수행한다면?
		for(int i = 0; i < arr.length-1; i++) {			// 0, 1, 2, 3, 4, 5, 6, 7, 8
			for(int j = i + 1; j < arr.length; j++)		// (i + 1) ~ 9
				if (arr[i] > arr[j]) {
					char ch = arr[i];		// 대입연산에서 좌변과 우변의 자료형은 같아야함
					arr[i] = arr[j];
					arr[j] = ch;
				}
		}
		for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			System.out.print(ch + " ");
		}
		System.out.println();
	}

}
