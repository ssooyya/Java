package exceptionTest;

import java.util.Iterator;
import java.util.Scanner;

public class ExceptionTask2 {

	public static void main(String[] args) {
	//	5개의 정수만 입력받기
	//	- 무한 입력 상태로 구현
	//	- q 입력 시 나가기
	//	- 5개의 정수는 배열에 담기
	//	- if문은 딱 한번만 사용하기(q를 입력시 나갈 때만 사용)
	//	- 단, 입력받을 때는 무조건 next()만 사용하기
	//	- 문자열 비교는 equal()를 사용한다
	//	- 예시)temp.equals("q")
	//	catch 3번
	//	- 1번째, 문자를 입력했을 경우 예외가 발생합니다. 계속 진행
	//	- 2번째, 5개를 이미 쌓았다면, 인덱스 예외가 발생합니다. 종료 이제껏 쌓인 배열의 데이터를 모두 출력
	//	- 3번째, 알 수 없는 부분 에러 추가, 계속 진행	
		Scanner sc = new Scanner(System.in);
	    int[] arData = new int[5];
	    String msg = "번째 정수 : ";
	    int i = 0;
	    
	    // next() 로 입력한 값이 담길 저장공간
	    String temp = null;
	    
	    while(true) {
	       System.out.print(++i + msg);
	       temp = sc.next();
	       
	       // 문자열 비교는 equals() 메소드 사용!
	       if(temp.equals("q")) {
	          for (int j = 0; j < arData.length; j++) {
	             System.out.print(arData[j] + " ");
	          }
	          break;
	       } // q 눌렀을 때 탈출하는 중괄호
	       
	       try {
	          arData[i-1] = Integer.parseInt(temp);
	       } catch (NumberFormatException e) {
	          System.out.println("정수만 입력해야겠죠??");
	          i--;
	       } catch (IndexOutOfBoundsException e) {
	          System.out.println("이미 5개의 정수를 모두 입력했군요??");
	          System.out.println("출력해주고 마무리할게요!");
	          for (int j = 0; j < arData.length; j++) {
	             System.out.print(arData[j] + " ");
	          }
	          break;
	       } catch (Exception e) {
	          System.out.println("특정할 수 없는 예외가 발생했어요!");
	          i--;
	       }
	    } // while문 닫는 중괄호
	    System.out.println("\n프로그램 정상 종료");
	}
}