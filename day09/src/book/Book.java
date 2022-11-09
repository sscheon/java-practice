package book;

public class Book {
	//멤버필드
	String name;
	String writer;
	String company;
	int price;
	double starPoint;
	
	Book(String name,String writer,String company, int price, double starPoint){
		this.name = name;
		this.writer = writer;
		this.company = company;
		this.price = price;
		this.starPoint = starPoint;
	}
	// 매서드
	String toStr() {	// toString 은 상속과 관련있어서 다른 이름을 사용
		String form = "%s %s %s\t %,d원 (★%.1f)";
		form = String.format(name, writer, company, price, starPoint);
//		System.out.println(form);
		return form;
	}

}
