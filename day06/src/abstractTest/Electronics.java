package abstractTest;

//추상 메소드와 일반 메소드 둘 다 선언이 가능하다.
public abstract class Electronics {
	public abstract void on();
	public abstract void off();
	
	public void print() {
		System.out.println("추상 클래스");
	}
	
}
