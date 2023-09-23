package array;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTask {
	public static void main(String[] args) {
		// 10~1까지 짝수만 배열에 담고 출력
//		int[] arData = new int[5];
//	
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (5-i) * 2;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}

		// 1~100까지 배열에 담은 후 홀수만 출력
//		int []arData = new int[100];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i] % 2 == 0) {
//				continue;
//			}
//			System.out.println(arData[i]);
//		}
//		for (int i = 0; i < arData.length; i = i+2) {
//			if(arData[i]%2==0) {
//				System.out.println(arData[i]);
//			}
//		}

		// 1~100까지 배열에 담은 후 짝수의 합 출력
//		int[] arData = new int[100];
//		int sum = 0;
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = arData[i]+1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			if(arData[i]%2 == 0) {
//				sum = sum + arData[i];
//			}
//		}
//		System.out.println(sum);

		// A~F까지 배열에 담고 출력
//		char[] arData = new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i+65);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i] + "");
//		}
//		//A~F까지 중 C제외하고 배열에 담은 후 출력
//		char[] arData = new char[5];
//		for (int i = 0; i < arData.length; i++) {
//			if(i == 67) {
//				
//			}else {
//				System.out.println((char)i);
//			}
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]+"");
//		}

		// 5개의 정수를 입력받고 배열에 담은 후에 최댓값과 최솟값 출력
//		Scanner sc = new Scanner(System.in);
//		int[] arData = new int[5];
//
//		int max = 0;
//		int min = 0;
//		System.out.println("5개의 정수를 입력하세요");
//
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
////			System.out.println(arData[i]);
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
//		//최댓값&최솟값
//		for (int i = 0; i < arData.length; i++) {
//			max = arData[0];//첫번째 값
//			min = arData[0];//첫번째 값
//			if (max < arData[i]) { // max보다 크다면
//				max = arData[i];	//max는 큰 값
//				System.out.println("최댓값"+max);
//			}if(min > arData[i]){
//				min = arData[i];
//				System.out.println("최솟값"+min);
//			}
//			System.out.println(arData[i]);
//		}
//		
		//사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력 받고 평균 구하기
		// 1. 사용자에게 정수 하나를 입력받고, 그 숫자만큼 배열을 만든다.
		// 2. 그 배열에 요소들을 채워넣는다.(정수만)
		// 3. 요소들의 평균을 구한다.
		// 4. 평균은 실수로 표현하고, 소수점 둘째자리까지 나오도록 한다.
		
		
		int total=0,avg=0;
		int[] data = null;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		String msg = "정수 하나를 입력해라";
		System.out.println(msg);
		num = sc.nextInt();
		//입력
		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
//			num = sc.nextInt();
			data[i] = num;
		}
		for (int i = 0; i < data.length; i++) {
			data = new int[i];
			System.out.println(data[i] + "");
		}
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		avg = total/num;
		
		
		
// 강사님 코드
		// 1~100까지 배열에 담은 후 짝수의 합 출력
//		for (int i = 0; i < args.length; i++) {
//			if(arData[i] % 2 == 1) {
//				continue;
//			}
//			sum += arData[i];
//		}
		// A ~ F 까지 배열에 담고 출력
//		for(char i = 'A'; i <= 'F'; i++) {
//			arData[i-65] = i;
//		}
//		// A ~ F 까지 중 C 제외하고 배열에 담은 후 출력
//		char[] arData = new char[5];
//
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char) (i > 1 ? i + 66 : i + 65);
//		}
//
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(arData[i] + " ");
//		}
		
		//5개의 정수를 입력받고 배열에 담은 후에 최댓값과 최솟값 출력
//		int[] arData = new int[5];
//		Scanner sc = new Scanner(System.in);
//		String msg = "5개의 정수를 입력하라!";
//		int max = 0, min = 0;
//
//		System.out.println(msg);
		//사용자가 입력한 데이터를 배열 하나하나 요소에 넣어준다.
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(i + 1 + "번째 정수 입력 >> ");
//			arData[i] = sc.nextInt();
//		}
//		//사용자가 입력한 데이터로 배열이 잘 추가되었는지 확인
//		for (int i = 0; i < arData.length; i++) {
//			System.out.print(arData[i] + " ");
//		}
//		//max, min 0번째에 데이터를 담아놓고,
//		max = arData[0];
//		min = arData[0];
		//반복을 돌면서 max와 요소들을 계속 비교
		//중간에 max보다 큰 요소를 만난다면, max 값을 더 큰 값으로 수정
//		for (int i = 1; i < arData.length; i++) {
//			if (max < arData[i]) {
//				max = arData[i];
//			}
//			if (min > arData[i]) {
//				min = arData[i];
//			}
//		}
		//반복문을 탈출하면, max에는 최댓값, min에는 최솟값이 담겨있을 것이다.
//		System.out.println("\n최댓값 : " + max);
//		System.out.println("최솟값 : " + min);

		//사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력 받고 평균 구하기
//		Scanner sc = new Scanner(System.in);
//		String countingMsg = "정수 개수 :", msg = "번째 정수";
//		int total = 0;
//		double avg = 0.0;
//		//값도 모르고 칸도 모르니까 null을 넣어 초기화
//		//선언은 항상 선언부에 몰아서!
//		int []arData = null;
//		
//		System.out.println(countingMsg);
//		//사용자가 입력한 정수만큼 칸 할당
//		//굳이 변수에 담아주지 말고 다이렉트로 사용 가능하다.
//		arData = new int[sc.nextInt()];
//		
//		System.out.println(arData.length);
//		
//		//배열에 값을 채워주는 부분
//		for (int j = 0; j < arData.length; j++) {
//			System.out.println(j + 1 + msg);
//			
//			arData[j] = sc.nextInt();
//		}
//		//출력하면서 총합을 구한다.
//		for (int j = 0; j < arData.length; j++) {
//			total += arData[i];
//			System.out.println(arData[j]+"");
//		}//이 반복문이 종료되면, total에는 총합이 담겨있을 것이다.
//		
//		//정수와 정수의 연산은 정수이므로, 형변환을 해줘야한다.
//		avg = (double)total / arData.length;
////		avg = total / (arData.length + 0.0);
//		
//		System.out.printf("입력한 수의 평균은 %.2f입니다.", avg);
//		
//		//소수점 둘째자리까지 나오게 하기 위해 String 클래스의 format메소드를 사용
//		//prinf()를 쓰지않고 간편하게 서식을 지정할 수 있다.
//		System.out.println("입력한 수의 평균은" + String.format(".2f", avg));
		
	}
}
