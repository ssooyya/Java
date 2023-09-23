package operator;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		int data = 10 > 9 ? 10 : 9;
//		System.out.println(data);
		
		//두 정수를 입력 받아, 더 큰 수를 출력해보자.
		int num1 = 0, num2 = 0;
		String msg = "정수 두 개 입력(엔터 기준) : ", result = null;
		boolean isBigger = false, isSame = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(msg);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		isBigger = num1 > num2;
		isSame = num1 == num2;
		
//		result = num1 > num2 ? "큰 값 : " + num1 : "큰 값 : " + num2;
		result = isBigger ? "큰 값 : " + num1 : isSame ? "두 수는 같습니다." : "큰 값 : " + num2;
		System.out.println(result);
	}
}
