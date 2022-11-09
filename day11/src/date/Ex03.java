package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String input;
		Date start;
		long dayCount, st, et;
		
		System.out.print("날짜 입력 (yyyy-MM-dd) : ");
		input = sc.nextLine();
		System.out.print("며칠 : ");
		dayCount = Long.parseLong(sc.nextLine());
		
		start = sdf.parse(input);
		st = start.getTime();
		et = st + 60 * 60 * 24 * dayCount * 1000;
				//초	       분      시간           일     (millisecond)
		
		for (long i = st; i < et; i += (60 * 60 * 24 * 1000)) {
			Date d = new Date(i);
			String s = sdf.format(d);
			System.out.println(s);
		}
		System.out.println("끝");
		sc.close();
	}
}
