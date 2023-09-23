package input;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		//자동 import 단축키(eclipse)
		//ctrl + shift + o
		
//		문자열의 초기화
//		String name = "";
//		String name2 = null;
//		System.out.println(name + "님 환영합니다.");
		
		Scanner sc = new Scanner(System.in);	//sc는 변수
		String name = null;
		String firstName = null;
		
		//입력 메소드
		//sc.next(), 스페이스바를 기준으로 구분
//		System.out.println("이름과 성을 스페이스바로 구분하여 입력하세요 >> ");
//		name = sc.next();
//		firstName = sc.next();
//		System.out.println(firstName + name + "님 환영합니다.");
		
		//sc.nextLine(), 줄바꿈(엔터)를 기준으로 구분
		System.out.println("이름과 성을 엔터로 구분하여 입력하세요 >> ");
		name = sc.nextLine();
		firstName = sc.nextLine();
		System.out.println(firstName + name + "님 환영합니다.");
	}
}
