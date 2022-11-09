package card;

import java.util.Arrays;

public class Quiz42576 {
	static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        answer = participant[participant.length - 1];
        
        for (int i = 0; i < completion.length; i++) {
        	if(completion[i].equals(participant[i]) == false) {
        		answer = participant[i];
        		break;
        	}
        }
        return answer;
	}

	public static void main(String[] args) {
		
		String[] p1 = {"leo", "kiki", "eden"};
		String[] c1 = {"eden", "kiki"};
		
		String[] p2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] c2 = {"josipa", "filipa", "marina", "nikola"};
		
		String[] p3 = {"mislav", "stanko", "mislav", "ana"};
		String[] c3 = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(p1,c1).equals("leo"));
		System.out.println(solution(p2,c2).equals("vinko"));
		System.out.println(solution(p3,c3).equals("mislav"));
	}
}
