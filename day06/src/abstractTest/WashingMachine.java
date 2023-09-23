package abstractTest;

public class WashingMachine extends Electronics{

	@Override
	public void on() {
		System.out.println("on/off 스위치를 누른다.");
	}

	@Override
	public void off() {
		System.out.println("on/off 스위치를 누른다.");
	}
}