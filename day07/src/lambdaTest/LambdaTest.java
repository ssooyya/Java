package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
		LambdaInter lambdaInter1 = (number) -> number % 10 == 0;
		
		System.out.println(lambdaInter1.checkMultipleOf10(49));
		
		LambdaInter lambdaInter2 = (n) -> {
			System.out.println("10의 배수 검사 시작");
			return n % 10 == 0;
		};
	System.out.println(lambdaInter2.checkMultipleOf10(60));
	}	
}