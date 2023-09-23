package casting;

public class CastingTest1 {
	public static void main(String[] args) {
//		자동 형변환
//		정수 + 정수 = 정수
		System.out.println(11 / 9);
		System.out.println(11 / 9.0);
		
//		강제 형변환
		System.out.println((double)9);
		System.out.println(11 / (double)9);
		
//		byte가 잘리면서 올림이 되지 않는다.
		System.out.println((int)8.63);
		
//		최우선 연산자 ()괄호
		System.out.println((int)8.43 + 2.59); //8.43의 형변환 먼저 된 후
		System.out.println((int)(8.43 + 2.59));
		
//		실습
//		8.43+2.59 = 10(강제형변환만 사용)
		System.out.println((int)8.43 + (int)2.59);
		
		
	}
}