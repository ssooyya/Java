package hashMapTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {

	public static void main(String[] args) {
		/*
		 * 카페메뉴 아메리카노 2500, 라떼 3500, 모카 4500, 바닐라라떼 4500 HashMap에 저장하기
		 * 
		 * 출력과 입력) 1. 아메리카노 2. 라떼 3. 모카 4. 바닐라 라떼 메뉴 번호를 입력해주세요 >> 2
		 * 
		 * 출력) 라떼는 3500원 입니다.
		 */

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String msg = "1. 아메리카노\n2. 라떼\n3. 모카\n4. 바닐라라떼\n메뉴 번호를 입력해주세요 >> ", result = null;

		map.put("아메리카노", 2500);
		map.put("라떼", 3500);
		map.put("모카", 4500);
		map.put("바닐라 라떼", 4500);

		while (true) {
			System.out.print(msg);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("아메리카노는 " + map.get("아메리카노") + "원 입니다.");
				break;
			case 2:
				System.out.println("라떼는 " + map.get("라떼") + "원 입니다.");
				break;
			case 3:
				System.out.println("모카는 " + map.get("모카") + "원 입니다.");
				break;
			case 4:
				System.out.println("바닐라 라떼는 " + map.get("바닐라 라떼") + "원 입니다.");
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
			break;
		}

		// 강사님 코드
//		 switch (choice) {
//	      case 1:
//	         result = "아메리카노는 " + menu.get("아메리카노") + "원 입니다.";
//	         break;
//	      case 2:
//	         result = "라떼는 " + menu.get("라떼") + "원 입니다.";
//	         break;
//	      case 3:
//	         result = "모카는 " + menu.get("모카") + "원 입니다.";
//	         break;
//	      case 4:
//	         result = "바닐라 라떼는 " + menu.get("바닐라 라떼") + "원 입니다.";
//	         break;
//	      default:
//	         result = "커피 마시기 싫어요~??";
//	         break;
//	      }
//	      System.out.println(result);
	}
}