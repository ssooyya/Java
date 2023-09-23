package method;

public class MethodTest {
	//두 정수의 곱셈을 리턴해주는 메소드 선언
	int getMultiple(int num1, int num2) {
		return num1 * num2;
	}
	//두 정수의 덧셈의 결과를 출력해주는 메소드 선언
	static void add(int num1, int num2) {
		System.out.println("두 정수의 합은 : " + (num1 + num2));
	}
	//1~10까지 println()으로 출력하는 메소드
	void printFrom1To10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
	
	//static
	//컴파일러가 가장 먼저 메모리에 할당해준다.
	//일반 메소드를 static 메소드로 사용하기 위해서는
	//1. static을 붙여서 같이 메모리에 올려준다.
	//2. 일반 메소드의 소속을 알려준다.
//		- static 메소드에서 사용된 일반 메소드는 Heap영역에서 찾는다.
//		- 클래스 타입의 변수를 선언할 때 Heap영역에 할당되므로, 
//		  일반 메소드도 해당 변수를 통해 접근하여 사용할 수 있다.
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
//		int temp = 0;
//		temp = mt.getMultiple(5, 3);
//		System.out.println(mt.getMultiple(4, 9));
//		System.out.println(temp);
//		mt.add(1, 3);
		MethodTest.add(5, 9);
		mt.printFrom1To10();
		
		Integer.parseInt(null);
	}
}