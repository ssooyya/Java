package classTest;

class Car{
	String name;
	int price;
	
	//기본 생성자
	//생략이 되어있다.
	//생성자가 하나도 없으면 생략되어 있다.
	public Car() {;}
	
	//초기화 생성자
	public Car(String name, int price) {
		this.name = name;
		this.price = price;//주소
	}
	
}

public class ClassTest {
	public static void main(String[] args) {
		Car c1 = new Car("GV80", 8000);
		
		System.out.println(c1.name);
		System.out.println(c1.price);
		
		Car c2 = new Car("롤스로이스", 50000);
		
		System.out.println(c2.name);
		System.out.println(c2.price);
		
		c1.name = "포르쉐911";
		System.out.println(c1.name);
		
		Car c3 = new Car();
		
	}
}