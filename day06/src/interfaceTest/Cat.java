package interfaceTest;

public class Cat implements Pet {

	@Override
	public void sitDown() {
		System.out.println("무시한다.");
	}

	@Override
	public void bark() {
		System.out.println("흘겨본다.");
	}

	@Override
	public void giveYourHand() {
		System.out.println("내 손을 깨문다.");
	}

	@Override
	public void waitNow() {
		System.out.println("기다리지 않는다.");
	}
}