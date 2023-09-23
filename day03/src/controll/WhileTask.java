package controll;

import java.util.Scanner;

public class WhileTask {
	public static void main(String[] args) {
		String msg = "Q. 당신이 좋아하는 색을 선택하세요.\n1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색\n5. 나가기";
		String redMsg = "불같고 열정적이고 적극적이다.";
		String yellowMsg = "발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMsg = "묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMsg = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMsg = "숫자를 정확히 입력해주세요!";
		String resultMsg = null;

		int choice = 0;
		Scanner sc = new Scanner(System.in);

		// 무한반복으로 구현
		// while문 사용
		// 5번을 누를 시 프로그램 종료
		while (true) {
			System.out.println(msg);
			choice = sc.nextInt();
			if (choice == 1) {
				resultMsg = redMsg;
			} else if (choice == 2) {
				resultMsg = yellowMsg;
			} else if (choice == 3) {
				resultMsg = blackMsg;
			} else if (choice == 4) {
				resultMsg = whiteMsg;
			} else if (choice == 5) {
				break;
			} else {
				resultMsg = errorMsg;
			}
			System.out.println(resultMsg);
		}
		System.out.println("프로그램 정상 종료");

		
		
		
		//강사님 코드
//		while(true) {
//			System.out.println(msg);
//			choice = sc.nextInt();
//			
//			if(choice == 5) {
//				break;
//			}

//			if(choice == 1) {
//				resultMsg = redMsg;
//			}else if(choice == 2){
//				resultMsg = yellowMsg;
//			}else if(choice == 3){
//				resultMsg = blackMsg;
//			}else if(choice == 4){
//				resultMsg = whiteMsg;
//			}else {
//				resultMsg = errorMsg; 
//			}
//			System.out.println(resultMsg);
//		}
//		System.out.println("프로그램 정상 종료");

//		while (true) {
//			
//			System.out.println(msg);
//			choice = sc.nextInt();
//			
//			if(choice == 5) {
//				break;
//			}
//
//			
//			switch (choice) {
//			case 1:
//				resultMsg = redMsg;
//				break;
//			case 2:
//				resultMsg = yellowMsg;
//				break;
//			case 3:
//				resultMsg = blackMsg;
//				break;
//			case 4:
//				resultMsg = whiteMsg;
//				break;
//
//			default:
//				resultMsg = errorMsg;
//				break;
//			}
//			System.out.println(resultMsg);
//		}
	}
}
