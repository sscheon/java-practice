package movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	static void prepareDummy() throws ParseException{
		
		Movie m1 = new Movie("블랙 아담", "자움 콜렛 세라",
				"드웨인 존슨, 노아 센티네오, 피어스 브로스넌, 퀸테사 스윈들".split(","), "액션", 125, 
				sdf.parse("2022-10-19"), 7.63);
		
		Movie m2 = new Movie("qw", "er",
				"ty, ui, op, as".split(","), "df", 100, 
				sdf.parse("2011-11-11"), 8.33);
		
		Movie m3 = new Movie("gh", "jk",
				"kl, zx".split(","), "nbv", 200, 
				sdf.parse("2010-10-10"), 5.86);
		
		Handler.arr[0] = m1;	// static이므로 객체 생성 없이 속성이나 기능에 접근할 수 있다
		Handler.arr[1] = m2;
		Handler.arr[2] = m3;

	}
	
	public static void main(String[] args) throws ParseException {
		prepareDummy();
		System.out.println(Handler.getList());
		System.out.println(Handler.delete("2023"));
		System.out.println(Handler.search("블랙"));
		
	}
}
