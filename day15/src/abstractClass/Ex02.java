package abstractClass;

abstract class Button{
	
	// abstract 메서드는 상속받아서 써야하기 때문에 private으로 지정할 수 없다
	// protected 혹은 public으로 설정해야한다
	// protected : 패키지가 달라도 상속관계에 있으면 접근 가능
	// public : 패키지나 상속여부에 상관없이 누구나 접근 가능
	protected abstract void onclick();
	
	public void click() {
		this.onclick();
	}
}

class MessageButton extends Button{

	@Override
	protected void onclick() {
		System.out.println("Hello world !!");
		
	}
}

class NotepadButton extends Button{

	@Override
	protected void onclick() {
		try {
			Runtime rt = Runtime.getRuntime();	// 운영체제 런타임을 객체로 받아온다
			String cmd = "notepad";		// 실행할 명령어
			Process pro = rt.exec(cmd);		// 명령어를 실행하여 생성된 프로세스를 저장
			Thread.sleep(2000);		// 2초 기다렸다가
			pro.destroy();		// 종료한다
		} catch (Exception e) {}
		
	}
}

class CalcButton extends Button{

	@Override
	protected void onclick() {
		try {
			Runtime rt = Runtime.getRuntime();	// 운영체제 런타임을 객체로 받아온다
			String cmd = "calc";				// 실행할 명령어
			rt.exec(cmd);			
		} catch (Exception e) {}
	}
}

public class Ex02 {
	public static void main(String[] args) {
//		Button bnt1 = new Button();
		
		MessageButton btn2 = new MessageButton();
		btn2.click();
		
		NotepadButton btn3 = new NotepadButton();
		btn3.click();
		
		CalcButton btn4 = new CalcButton();	// 서브클래스의 객체를 슈퍼 클래스로 참조한다
		btn4.click();
		// 추상클래스가 직접 객체를 생성할 수는 없지만 자료형으로써 참조변수를 사용하는 것은 가능하다
		
		Button btn5 = new Button() {
				
			@Override	// 서브 클래스이지만 이름이 없어서 익명 내부 클래스
			protected void onclick() {
				try {
					Runtime rt = Runtime.getRuntime();
					String cmd = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
					rt.exec(cmd);
				} catch (Exception e) {}
			}
		};
		btn5.click();
	}
}
