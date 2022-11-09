package tv;

public class TV {
	// TV 클래스를 구성하세요
	// 필드는 속성을 저장합니다 : ex) 전원, 채널, 볼륨, 음소거 등등..
	// 메서드는 기능을 정의합니다 : 채널 올림/내림, 볼륨 올림/내림, 전원 켜기/끄기, 음소거 등..
	// 생성자는 객체 생성 시 초기 작동을 담당합니다 (생성된 TV의 초기 채널은 2로 설정한다)
	// 접근제한자는 필드에 대해 private, 메서드에 대해 public을 적용합니다
	// getter/setter는 사용해도 되고, 생략해도 됩니다
	
	private boolean power;		// true = on	false = off
	private int mute;
	private int channel = 2;	// 범위 2 ~ 100
	private int volume = 0;		// 볼륨 초기값 0
	
	public void powerBtn() {
		power = !power;		// 저장된 값이 true면 false를 대입, false면 true를 대입
		show();
	}
	
	public void channelUp() {
		if(power) {
			channel++;
			if(channel > 100)
				channel = 2;
		}
		show();
	}
	
	public void channelDown() {
		if(power) {
			channel--;
			if(channel < 2)
				channel = 100;
		}
		show();
	}
	
	public void volUp() {
		if(power) {
			volume++;
			if(volume == 30)
				volume = 30;
		}
		show();
	}
	
	public void volDown() {
		if(power) {
			volume--;
			if(volume == 0)
				volume = 0;
		}
		show();
	}
	
	public void mute() {
		if(power) {
			int tmp = volume;
			volume = mute;
			mute = tmp;
		}
		show();
	}
	
	public void show() {
		if(power) {
			System.out.println("전원 : " + power);
			System.out.println("채널 : " + channel);
			System.out.println("볼륨 : " + volume);
			System.out.println();
		}
		
		else {
			System.out.println("전원 꺼짐");
		}

	}
}
