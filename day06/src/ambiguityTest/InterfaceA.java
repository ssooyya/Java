package ambiguityTest;

public interface InterfaceA {
	
	default void printData() { //default가 있어서 선언이 가능함
		System.out.println("InterA");
	}
}
