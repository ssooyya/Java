package inheritance;

class Car{
	//브랜드, 색상, 가격
	String brand;
	String color;
	int price;
	//기본생성자
	public Car() {;}
	//초기화 생성자
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	//열쇠로 시동 킴 출력하는 메소드
	void keyStart() {
		System.out.println("열쇠로 시동 킴");
	}
	
	//열쇠로 시동 끔 출력하는 메소드
	void keyStop() {
		System.out.println("열쇠로 시동 끔");
	}
	
}

class SuperCar extends Car{
	//모드
	String mode;
	//기본 생성자
	//부모에 기본 생성자가 없으면 super()을 명시해서, 부모 생성자를 우리가 호출해주어야한다.
	//자식의 기본생성자는 오류가 발생한다.
	public SuperCar() {;}
	//초기화 생성자
	//부모 필드 값까지 전부 초기화하는 형식으로 만들어보자.
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	//음성으로 시동 킴(재정의)
	@Override
	void keyStart() {
//		super.keyStart();//메소드 호출(위치 상관 없음)
		System.out.println("음성으로 시동 킴");
	}
	//음성으로 시동 끔(재정의)
	@Override
	void keyStop() {
//		super.keyStop();	//위에 있던 말던 상관이 없다. 메소드의 사용일 뿐이다.
		System.out.println("음성으로 시동 끔");
	}
	//지붕 열기
	void ceilingOpen() {
		System.out.println("지붕 열기");
	}
	
	//지붕 닫기
	void ceilingClose() {
		System.out.println("지붕 닫기");
	}
	
}
public class InheritanceTask {
	public static void main(String[] args) {
		Car morning = new Car();
		SuperCar rollsroyce = new SuperCar("롤스로이스", "white", 10000, "Sports");
		System.out.println(rollsroyce.brand);
		
		rollsroyce.keyStart();
		morning.keyStart();
	}
}