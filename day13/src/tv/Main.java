package tv;

public class Main {
	public static void main(String[] args) {
		TV tv = new TV();
		// TV 클래스를 구성하여 실제 현실의 TV기능을 모두 구현해보세요
		
		// main에서는 TV의 메서드만 호출합니다
		tv.powerBtn();
		tv.channelDown();
		tv.channelDown();
		tv.channelUp();
		
		tv.mute();
		tv.mute();
		
		tv.volDown();
		tv.volDown();
		tv.volUp();
		
		tv.powerBtn();
	}
}
