package inheritance;

class Human{
	
	void eat() {
		System.out.println("먹는다.");
	}
	void sleep() {
		System.out.println("잔다.");
	}
	void walk() {
		System.out.println("두 발로 걷는다.");
	}
}
class Monkey extends Human{
	@Override
	void walk() {
		super.walk();//부모에 있는 친구 실행(두발로걷는다출력)
		System.out.println("네 발로 걷는다.");
	}
	
	void rideTree() {
		System.out.println("나무를 기깔나게 탄다.");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		
		kingkong.eat();
		kingkong.walk();
	}
}
