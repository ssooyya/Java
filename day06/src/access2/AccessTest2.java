package access2;

import access1.Access1;

public class AccessTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 a1 = new Access1();
		Access2 a2 = new Access2();

		//public 접근 제한자만 가능
//		a1.data2;
		
		System.out.println(a1.getData4());
		a1.setData4(55);
		System.out.println(a1.getData4());
		
	}

}
