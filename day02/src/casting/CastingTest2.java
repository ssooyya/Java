package casting;

public class CastingTest2 {
	public static void main(String[] args) {
		
		char data = 'a';	//char 1byte
		
		System.out.println(data + 1);	//자동 형변환
		
		System.out.println((int)data);
		System.out.println((double)data);
		System.out.println((char)99);
		System.out.println((char)99.0);
		System.out.println((char)199.1);
		
		//아스키 코드
	}
}