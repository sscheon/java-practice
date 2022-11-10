package student;

public class Student implements Comparable<Student> {
	
	// Serialize : 자바 객체를 별도의 문자열 형태로 변환하지 않고, 바이너리 상태 그대로 저장하기 위한 규칙
	// 객체를 byte단위로 분할하여 저장하고, 다시 불러올때 재조립하여 객체로 복원할 수 있는 규칙
	
	String name;
	int kor, eng, mat, sum;
	double avg;
	
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor + eng + mat;
		avg = sum / 3.0;
	}
	
	public void show() {
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f", avg);
		System.out.println();
		
	}
	
	public String getFileData() {
		String format = "%s,%d,%d,%d,%d,%.2f\n";
		return String.format(format, name, kor, eng, mat, sum, avg);
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

}
