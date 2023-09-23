package input;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
//	실습
//	두 정수를 입력한 뒤 덧셈 결과 출력
//	단, next()만 사용
		Scanner sc = new Scanner(System.in);
		String data1 = null;
		String data2 = null;
		
		System.out.println("두 개의 정수를 입력하세요 >> ");
		data1 = sc.next();
		data2 = sc.next();
		System.out.println(Integer.parseInt(data1) + Integer.parseInt(data2));
	
	
	
	
		/* 강사님 코드
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		String msg = "첫번째 정수 : ", msg2 = "두번째 정수 : ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(msg1);
		num1 = Integer.parseInt(sc.next());
		num1 = sc.nextInt();
		
		System.out.print(msg2);
		num2 = Integer.parseInt(sc.next());
		num2 = sc.nextInt();
		result = num1 + num2;
		
		System.out.printf("%d + %d = %d", num1, num2, result);
		 */
	}
}
