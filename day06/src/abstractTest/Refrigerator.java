package abstractTest;

public class Refrigerator extends Electronics{

	@Override
	public void on() {
		System.out.println("문을 열고 스위치를 누른다.");
	}

	@Override
	public void off() {
		System.out.println("문을 열고 스위치를 누른다.");
	}
}