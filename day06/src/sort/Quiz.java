package sort;

public class Quiz {
	public static void main(String[] args) {
		
		String[] nameArray = { "이지은", "홍진호", "강호동", "주호민", "이병건" };
		int[] ageArray = { 30, 41, 53, 42, 40 };
		show(nameArray, ageArray);
		
		// 1) 나이 순으로 내림차순 정렬 후 출력하세요
		for(int i = 0; i < ageArray.length - 1; i++) {
			for(int j = i + 1; j < ageArray.length; j++) {
				if(ageArray[i] < ageArray[j]) {	// 나이를 비교하여 바꾼다
					int tmpA = ageArray[i];
					ageArray[i] = ageArray[j];
					ageArray[j] = tmpA;			// 나이를 교환할 때 
					
					String tmpN = nameArray[i];	// 같은 위치의 이름도 교환한다
					nameArray[i] = nameArray[j];
					nameArray[j] = tmpN;
				}
			}
		}
		
		show(nameArray, ageArray);
		// 2) 이름 순으로 오름차순 정렬 후 출력하세요
		for(int i = 0; i < nameArray.length - 1; i++) {
			for(int j = i + 1; j < nameArray.length; j++) {
//				if(nameArray[i] > nameArray[j]) {
				if(nameArray[i].compareTo(nameArray[j]) > 0) {
					String tmpN = nameArray[i];
					nameArray[i] = nameArray[j];
					nameArray[j] = tmpN;
					
					int tmpA = ageArray[i];
					ageArray[i] = ageArray[j];
					ageArray[j] = tmpA;			 
				}
			}
		}
		show(nameArray, ageArray);
		// 단, 정렬에 의해서 이름과 나이가 엇갈리면 안됩니다 !!
	}

	static void show(String[] nameArray, int[] ageArray) {
		for(int i = 0; i < nameArray.length; i++) {
			System.out.printf("%s : %d살\n", nameArray[i], ageArray[i]);
		}
		System.out.println();
	}
}
