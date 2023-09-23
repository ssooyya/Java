package interfaceTest;

public interface Pet {
	//추상 메소드는 구현이 되기 전에는 메모리에 올릴 수 없기 때문에
	//우리가 상수를 사용하기 위해서는 static을 붙여주는 방법밖에 없다.
	final static int eyes = 02;
	
	//final static 생략
	int mouth = 1; // interface는 상수밖에 선언하지 못하기에
	
	//abstract 생략 가능
	//추상메소드만 가질 수 있는 interface의 특성상 추상 메소드와 일반 메소드를 구분하지 않아도 된다.
	public abstract void sitDown();
	public void bark();	//인터페이스는 추상메소드만 선언 가능
	public void giveYourHand();
	public void waitNow();
	
}
