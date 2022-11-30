package practice;

import java.util.Random;

public class Updown2 {
	
	Random ran = new Random();
	private int answer;
	private int cnt;
	
	public Updown2() {
		this.answer = ran.nextInt(100) + 1;
	}
	
	public String checkInput(int user) {
		cnt++;		
		if(answer == user) {
			return "정답";
		}
		else if(answer > user) {
			return "UP";
		}
		else {
			return "DOWN";
		}		
	}
	
	public String getResult() {
		return String.format("정답! (시도 횟수 : %d회)", cnt);
	}
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
