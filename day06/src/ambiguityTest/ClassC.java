package ambiguityTest;

public class ClassC implements InterfaceA, InterfaceB {
	
	@Override
	public void printData() {
		InterfaceA.super.printData();
		System.out.println("내가 원하는 거");
	}
	
	public static void main(String[] args) {
		ClassC c = new ClassC();
		
		c.printData();
	}
}
