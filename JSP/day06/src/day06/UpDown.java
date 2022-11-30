package day06;

import java.util.Random;
//import java.util.Scanner;

public class UpDown {
	
//	private static UpDown instance = new UpDown();
	
	Random ran = new Random();
	private int cpu = ran.nextInt(100) + 1;		
	private int cnt;	

	public String getResult(int cpu, int user) {
		cnt++;
		String result;			
			if(cpu == user) {
				result = "정답!!";				
			}
			else if(cpu > user) {
				result = "UP";
			}
			else {
				result = "DOWN";
			}		
			return result;			
	}

	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}	
	public int getCpu() {
		return cpu;
	}	
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}	
}