package wrapperTest;

public class WrapperTest {

	public static void main(String[] args) {
		int number = 10;	//일반타입
		
		//boxing
		//디프리케이티드, 이제 더이상 이렇게 쓰지 말자
//		Integer number_W = new Integer(number);
//		Integer number_W = Integer.valueOf(number);//valueOf는 static으로 
		
		//autoboxing
		Integer number_W = number;
		
		System.out.println(number_W);
		
		//unboxing
		int data = number_W.intValue();
		
		//autounboxing
		int data2 = number_W;
		
		System.out.println(data);
		
	}

}
