package access2;

import access1.Access1;

public class Access2 extends Access1{
	void test() {
		
		//protected인 data3에도 접근이 가능하다.
		System.out.println(data3);
	}
	
	public static void main(String[] args) {
		Access2 a2 = new Access2();
		a2.test();
		System.out.println(a2.data3);
		a2.data3 = 55;
		System.out.println(a2.data3);
	}
	
	
}
