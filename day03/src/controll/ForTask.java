package controll;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		//1단계
		//1~100까지 출력
//		for (int i = 0; i < 101; i++) {
//			System.out.println(i);
//		}
//		//100~1까지 출력
//		for (int i = 100; i > 0 ; i--) {
//			System.out.println(i);
//		}
//		//1~100 중 짝수만 출력
//		for (int i = 0; i < 101; i=i+2) {
//			System.out.println(i);
//		}
//		//반복횟수를 100번 설정했을 때 
//		for (int i = 0; i < 200; i = i+2) {
//			System.out.println(i);
//		}
//		//반복횟수를 50번 설정했을 때 
//		for (int i = 0; i < 100 ; i = i+2) {
//			System.out.println(i);
//		}
		
		//2단계
		//1~10까지의 합 출력
		//for문 안에서 선언된 변수는 영역 밖에서 사용할 수 없다.
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i ;
//		}
//		System.out.println(sum);
		
		//정수 하나를 입력받고 그 숫자만큼의 누적합을 구하기
		//입력 >> 5
		//1~5까지의 합이 출력되도록
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		System.out.println("정수를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		for (int i = 1; i <= num; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
		//3단계
		//A~F까지 출력
//		for (int i = 65; i < 71; i++) {
//			char str = (char)i;
//			System.out.println(str);
//		}
		
		//A~F까지 중 C 제외하고 출력
		
//		for (int i = 65; i < 71; i++) {
//			char str = (char)i;
//			if (i == 67) {
//			
//			}
//			System.out.println(str);
//		}
//		for (char i ='A'; i < 'F'; i++) {
//			if (char i == 'C') {
//				
//			}else{
//				System.out.println(i);
//			}
//		}
		
//		//삼항연산자 사용해서 풀어보기
//		//반복횟수 5번으로 풀 수 있음
//		if (i == 67) ?  : char(i)
//			
//
//		//0 1 2 3 0 1 2 3 0 1 2 3 출력
//				//반복문 사용해서 푸세요
//		for(int i = 0; i < 3; i++) {
//			for (int j = 0 < 4; j++) {
//				System.out.println(j + "");
//			}
//		}
//		
//		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
//			
//		강사님 코드
//		A ~ F 까지 출력
//		for (char i = 'A'; i <= 'F'; i++) {
//			System.out.println(i);
//		}
// 		test 코드
//      char temp = 'A'+ 1;
//      System.out.println(temp);

//		for (i = 0; i<6; i++){
//			System.out.println((char)(i+65));
//		}
//		//A~F까지 중 C 제외하고 출력
//		for (int i = 65; i<= 70; i++) {
//			if (i == 67) {
//				
//			}else {
//				System.out.println((char)i);
//			}
//		}
//		//삼항연산자 사용해서 풀어보기
//		//반복횟수 5번으로 풀 수 있음
//		for (int i = 0; i < 5; i++) {
//			System.out.println((char)i > 1 ? i + 66 : i + 65);
//		}
		 // 0 1 2 3 0 1 2 3 0 1 2 3 출력
	     // 반복문을 사용해서 푸세요!
//	      for (int i = 0; i < 3; i++) {
//	         for (int j = 0; j < 4; j++) {
//	            System.out.print(j + " ");
//	         }
//	      }

//		int count = 0;
//		for(int i = 0; i < 12; i ++) {
//			if(count == 4) {
//				System.out.println();
//				count = 0;
//			}
//			System.out.println(count+"");
//			count++;
//		}
//		for (int i = 0; i < 12; i++) {
//		    System.out.print(i % 4 + " ");
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
////		//강사님 코드
//		//1단계
////		// 1~100까지 출력
////		for (int i = 0; i <= 100; i++) {
////			System.out.println(i);
////		}
////		// 100~1까지 출력
////		for (int i = 0; i < 100; i++) {
////			System.out.println(100-i);
////		}
////		// 1~100 중 짝수만 출력
////		// 반복횟수를 100번 설정했을 때
////		for (int i = 0; i < 100; i++) {
////			if ((i + 1) % 2 == 0) {
////				System.out.println(i + 1);
////			}
////		}
////		// 반복횟수를 50번 설정했을 때
////		for (int i = 0; i < 51; i = i++) {
////			System.out.println(i*2);
////		}
//		
////		//2단계
////		//1~10까지의 합 출력
////		int total = 0;
////		for (int i = 1; i < 11; i++) {
////			total += i ;
////		}
////		System.out.println(total);
//		
//		//정수를 입력받고 그 숫자만큼의 누적합을 구하기
////		Scanner sc = new Scanner(System.in);
////		String msg = "어디까지의 합을 구하고 싶니?";
////		int end = 0; //입력받은 값을 저장할 변수
////		int total = 0; //누적합을 저장해줄 변수
////		
////		System.out.println(msg);
////		end = sc.nextInt();
////		
////		for (int i = 0; i < end; i++) {
////			total += i;
////		}
////		System.out.println(total);
//		
	}
}
