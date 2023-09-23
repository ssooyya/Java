package controll;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("1~3까지 숫자 중 하나 입력 >> ");
		num = sc.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("당신이 입력한 숫자 : " + num);
			break;	//가까운 중괄호 영역을 탈출한다. (if문은 제외)
		case 2:
			System.out.println("당신이 입력한 숫자 : " + num);
			break;
		case 3:
			System.out.println("당신이 입력한 숫자 : " + num);
			break;
		default:
			System.out.println("제대로 입력 안 해?");
			break;
		}
		
		System.out.println("프로그램 정상 종료");
		
	}
}
