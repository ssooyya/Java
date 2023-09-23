package operator;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
		//실습
		//사용자에게 키를 입력받고, 정수라면 정수로 출력
		//실수라면 실수로 출력
		//정수인지 실수인지 : 전체에서 진수부를 뺐을 때 0인지 아닌지 검사
		//3.5 - 3=0.5
		//3.0 - 3 = 0.0
		
		double num1 = 0.0;
		String msg = "키를 입력하세요 : ", result = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(msg);
		num1 = sc.nextDouble();
		
		result = num1 - (int)num1 == 0 ? "" + (int)num1 : "" + (double)num1 ;
		System.out.println(result);
		
		
		/*
		 * 강사님 코드 double height = 0.0; String msg = "키를 입력하세요 : ", result = null;
		 * boolean check = false; Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println(msg); height = sc.nextDouble();
		 * 
		 * check = height - (int)height == 0; check = height % 1 == 0;
		 * 
		 * 
		 * result = check ? (int)height + "cm" : height + "cm";
		 * System.out.println(result);
		 */
	}
}