package 천성수2A;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Todo {
	
	String title;
	String fin;
	Date day1 = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
	String day = sdf.format(day1);
	
	
	Todo(String title, String day, String fin){
		this.title = title;
		this.day = day;
		this.fin = fin;
	}
	
	public String toString() {
		return String.format("[%s] %s\t %s", day, title, fin);
	}
}
