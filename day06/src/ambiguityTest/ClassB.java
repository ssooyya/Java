package ambiguityTest;

public class ClassB extends ClassA implements InterfaceA {
	
	//2. 인터페이스 안에 있는 default메소드를 사용하고 싶다면
	//아래의 형식처럼 재정의 해야한다.
	@Override
	public void printData() {
		InterfaceA.super.printData();//InterfaceA의 printData 재정의
//		super.printData();//ClassA의 printData
	}
	
	public static void main(String[] args) {
		
		//1. 기본적으로 지정보다 상속이 우선순위가 더 높다.
		ClassB c = new ClassB();
		c.printData();
		
		//인터페이스 업캐스팅, 다운캐스팅 가능
		InterfaceA i = c; //upcasting
		ClassB c2 = (ClassB)i;
		
		c2.printData();
	}
}
