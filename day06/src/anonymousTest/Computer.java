package anonymousTest;

public class Computer {
	public static void main(String[] args) {
		
		Electronics e = new Electronics() {
			
			@Override
			public void on() {
				System.out.println("컴퓨터를 켠다.");
				
			}
			
			@Override
			public void off() {
				System.out.println("컴퓨터를 끈다.");
			}
		};//내부 클래스 닫는 중괄호
		e.on();
	}
}