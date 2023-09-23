package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {

	public static void main(String[] args) {
//		5개의 정수만 입력받기
//		- 무한 입력 상태로 구현
//		- q 입력 시 나가기
//		- 5개의 정수는 배열에 담기
//		- if문은 딱 한번만 사용하기(q를 입력시 나갈 때만 사용)
//		- 단, 입력받을 때는 무조건 next()만 사용하기
//		- 문자열 비교는 equal()를 사용한다
//		- 예시)temp.equals("q")
//		catch 3번
//		- 1번째, 문자를 입력했을 경우 예외가 발생합니다. 계속 진행
//		- 2번째, 5개를 이미 쌓았다면, 인덱스 예외가 발생합니다. 종료 이제껏 쌓인 배열의 데이터를 모두 출력
//		- 3번째, 알 수 없는 부분 에러 추가, 계속 진행

		int[] num = new int[5];
		String temp = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			temp = sc.next();
			if (temp.equals("q") == true) {
				System.out.println("나가기");
				break;
			}

			try {

			} catch (NumberFormatException e) {
				System.out.println("정수만 입력하세요");
				continue;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 범위를 초과했습니다.");
				break;
			} catch (Exception e) {
				System.out.println("알 수 없는 오류가 발생했습니다.");
				continue;
			}

		}

	}

}
