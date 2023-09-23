package inheritance;

class A{
	String name = "A";
	int data = 10;
	public A() {;}//기본
	
	public A(int data) {
		this.data = 20;
		System.out.println("부모 생성자 호출");
	}
	
	void printName(){
		System.out.println(name);
	}
}
class B extends A{
	public B() {;}//기본
	
	public B(int data) {
		super(data);//부모 생성자 호출, 생략이 항상 되어있음
		//반드시 부모 생성자가 먼저 호출이 되어야한다.
		//그래서 부모 생성자를 명시한 후, 밑으로 내리면 에러가 발생한다.
		name = "B";
		System.out.println("자식 생성자 호출");
	}
	
	void printData() {
		System.out.println(data);
	}
}

class C extends B{
	
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B b = new B(20);
		C c = new C();
		
		b.printName();
		b.printData();
	
		c.printName();
	}
}
