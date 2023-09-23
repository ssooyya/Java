package controll;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		// 두 정수를 입력받고, 대소 비교
		int num1 = 0, num2 = 0;
		String msg = "정수 두 개 입력(엔터 기준) : ", result = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(msg);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			result = "큰 값 : " + num1;
		}else if(num1 < num2) {
			result = "큰 값 : " + num2;
		}else if(num1 == num2) {
			result = "두 수는 같습니다.";
		}
		
		System.out.println(result);
	}
}
