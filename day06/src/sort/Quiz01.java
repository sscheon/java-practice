package sort;

public class Quiz01 {
	public static void main(String[] args) {
		String[] nameArray = { "이지은", "홍진호", "강호동", "이병건", "주호민" };
		int[] ageArray = { 30, 41, 53, 42, 40 };
		
		show(nameArray, ageArray);
		// 1) 나이 순으로 내림차순 정렬 후 출력하세요
		age(nameArray, ageArray);
		
		// 2) 이름 순으로 오름차순 정렬 후 출력하세요
		name(nameArray, ageArray);
		// 단, 정렬에 의해서 이름과 나이가 엇갈리면 안됩니다 !!
	}

	static void age(String[] nameArray, int[] ageArray) {
		for(int k = 0; k < ageArray.length - 1; k++) {
			for(int l = k + 1; l < ageArray.length; l++) {
				if (ageArray[k] < ageArray[l]) {
					int tmp1 = ageArray[k];
					ageArray[k] = ageArray[l];
					ageArray[l] = tmp1;
					String tmp2 = nameArray[k];
					nameArray[k] = nameArray[l];
					nameArray[l] = tmp2;
				}
			}
		}
	}
	
	static void name(String[] nameArray, int[] ageArray) {	
		for(int i = 0; i < nameArray.length - 1; i++) {
			for (int j = i + 1; j < nameArray.length; j++) {
				if (nameArray[i].compareTo(nameArray[j]) < 0) {
					String tmp2 = nameArray[i];
					nameArray[i] = nameArray[j];
					nameArray[j] = tmp2;
					int tmp1 = ageArray[i];
					ageArray[i] = ageArray[j];
					ageArray[j] = tmp1;
				}
			}
		}
	}
	static void show(String[] nameArray, int[] ageArray) {
		for (int i = 0; i < nameArray.length; i++ ) {
			System.out.printf("%s : %d살\n", nameArray[i], ageArray[i]);
		}
		System.out.println();
	}
}
