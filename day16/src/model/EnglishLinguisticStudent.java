package model;

public class EnglishLinguisticStudent extends Student {
	
	private int literature;
	private int translation;

	public EnglishLinguisticStudent(String name, int kor, int eng, int mat, int literature, int translation) {
		super(name, kor, eng, mat);
		this.literature = literature;
		this.translation = translation;
		
		// 상속받아서 내가 가지고 있으니까 this로 접근가능
		this.sum = kor + eng + mat + literature + translation;
		
		// 슈퍼클래스에서 만들어진 필드니까 super로 접근가능
		super.avg = this.sum / 5.0;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("이름 : %s, 합계 : %s, 평균 : %.2f\n", name, sum, avg);
	}
	
	@Override
	public void showDetail() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("문학 : " + literature);
		System.out.println("번역 : " + translation);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println();
	}

	@Override
	public int getSum() {
		return sum;
	}

	@Override
	public double getAvg() {
		return avg;
	}

	public int getLiterature() {
		return literature;
	}

	public void setLiterature(int literature) {
		this.literature = literature;
	}

	public int getTranslation() {
		return translation;
	}

	public void setTranslation(int translation) {
		this.translation = translation;
	}
}
