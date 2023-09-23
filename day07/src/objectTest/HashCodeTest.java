package objectTest;

import java.util.Random;

public class HashCodeTest {
	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";
		String data3 = new String("ABC");
		String data4 = new String("ABC");
		
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		
		//new를 사용했기에 필드 우선순위가 높아야지만
		//String클래스에서 재정의를 해서 칠드 안에 값의 해쉬코드를 가져오도록 한다.
		System.out.println(data3.hashCode());
		System.out.println(data4.hashCode());
		
		Random r1 = new Random();
		Random r2 = new Random();
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());

	}
}

