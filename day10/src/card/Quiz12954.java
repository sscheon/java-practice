package card;

class Solution{
	public long[] solution(int x, int n) {
		long[] answer = {};
		long p = x;
		answer = new long[n];
		
		for (int i = 0; i < n; i++) {
			answer[i] = p;
			p += x;
		}
		return answer;
	}
}

public class Quiz12954 {
	public static void main(String[] args) {
		
	}
}
