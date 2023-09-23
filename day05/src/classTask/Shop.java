package classTask;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		//초기화 생성자로 객체화
		SuperCar s1 = new SuperCar("포릇쉐", "red", 10000);
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String msg = "1. 시동켜기\n2. 시동끄기 \n3. 프로그램 종료";
		
		while(choice != 3) {
			System.out.println(msg);
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: //시동 켜기
				s1.engineStart();
				break;
				
			case 2: //시동 끄기
				s1.engineStop();
				break;
				
			case 3: //프로그램 종료
				System.out.println("안녕히 가세요");
				break;
				
			default : 
				System.out.println("제대로 입력 안 해?");
				break;
			}
		}
	}
}