package array;

public class Quiz01as {
	
	static void guide(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int length = 5;
		int[][] arr = new int[length][length];
		int num = 0;
		int x = -1, y = 0;
		int sign = 1;		// 부호를 바꾸기위한 변수
		guide(arr);
		while(true) {
			for (int i = 0; i < length; i++) {
				x += sign;		// x++ 이었지만 부호를 바꾸기 위해 sign이라는 변수를 만들어준다
				arr[y][x] = ++num;
			}
			length--;
			if(length == 0) break;
			
			for (int i = 0; i < length; i++) {
				y += sign;		// y++
				arr[y][x] = ++num;
			}
			sign = -sign;	// 부호를 바꿔야 역방향으로 진행한다
		}
		
//		int x = -1, y = 0;
//		int sign = 1;
//		while(true) {
//			for (int i = 0; i < length; i++) {
//				x += sign;
//				arr[y][x] = ++num;
//			}
//			length--;
//			if (length == 0) break;
//			
//			for (int i = 0; i < length; i++) {
//				y += sign;
//				arr[y][x] = ++num;
//			}
//			sign = -sign;
//		}
//		
//		
//		for (int i = 0; i < length; i++) {
//			arr[4][3 - i] = ++num;
//		}
//		
//		length--;
//		
//		for (int i = 0; i < length; i++) {
//			arr[3 - i][0] = ++num;
//		}
//		
//		for (int i = 0; i < length; i++) {
//			arr[1][i + 1] = ++num;
//		}
//		
//		length--;
//		
//		for (int i = 0; i < length; i++) {
//			arr[i + 2][3] = ++num;
//		}
//		
//		for (int i = 0; i < length; i++) {
//			arr[3][2 - i] = ++num;
//		}
//		
//		length--;
//		
//		for (int i = 0; i < length; i++) {
//			arr[2][1] = ++num;
//		}
//		
//		for (int i = 0; i < length; i++) {
//			arr[2][2] = ++num;
//		}
//	
//		length--;
//		
		show(arr);
	}
}
