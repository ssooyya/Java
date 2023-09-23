package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10/2);
			System.out.println(10/0);
			System.out.println(10/3);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e){ //모든 예외 클래스의 부모
			System.out.println("알 수 없는 오류가 발생했어요");
			System.out.println(e);
		}
		System.out.println("프로그램 정상 종료");
		
	}
}