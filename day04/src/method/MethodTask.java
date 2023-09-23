package method;

public class MethodTask {
	// "류호근"을 n번 println()으로 출력하는 메소드
	void printName(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("류호근");
		}
	}

	// 매개변수로 넘어온 이름 n번 println()으로 출력하는 메소드
	void printlnName(int num, String name) {
		for (int i = 0; i < num; i++) {
			System.out.println(name);
		}
	}

	// 세 정수의 뺄셈을 리턴해주는 메소드
	int getMinus(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}

	// 두 정수의 나눗셈을 해주는 메소드(몫과 나머지 둘 다 리턴)
	int[] getDivide(int num1, int num2) {
		// 몫과 나머지를 배열에 넣어줌
		// 배열을
		int[] result = { num1 / num2, num1 % num2 };
		return result;
	}
	
	//1~n의 합을 구해주는 메소드(리턴있게)
	int getSum(int num) {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += i+1;
		}
		return sum;
	}
	
	//문자열을 입력받고 원하는 문자의 개수를 리턴해주는 메소드 //apple-p 2개
	int str(String name, char string) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == string) {
				count++;
			}
		}
		return count;
	}

	// 강사님 코드
//  "류호근" 을 n번 println() 으로 출력하는 메소드
//	void printRyu(int count) {
//		for (int i = 0; i < count; i++) {
//			System.out.println("류호근");
//		}
//	}
//
//  매개변수로 넘어온 이름을 n번 println() 으로 출력하는 메소드
//	void printName(String name, int count) {
//		for (int i = 0; i < count; i++) {
//			System.out.println(name);
//		}
//	}
//
//  세 정수의 뺄셈을 리턴해주는 메소드
//	int subtract(int firstNum, int middleNum, int lastNum) {
//		return firstNum - middleNum - lastNum;
//	}
//
//  두 정수의 나눗셈을 해주는 메소드(몫과 나머지 둘 다 리턴)
//	int[] divide(int num1, int num2) {
//		int[] results = { num1 / num2, num1 % num2 };
//
//		return results;
//	}

	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		// 1번 문제
//		mt.printName(5);
		// 2번 문제
//		mt.printlnName(5, "권희수");
		// 3번 문제
//		System.out.println(mt.getMinus(5, 6, 8));
		// 4번 문제
//		System.out.println(mt.getDivide(90, 65)[0]);
//		System.out.println(mt.getDivide(90, 65)[1]);

//      강사님 코드 4번 문제
//		int[] temp = mt.divide(7, 4);
//		System.out.println("몫 : " + temp[0] + "\n나머지 : " + temp[1]);
		//5번 문제
		System.out.println(mt.getSum(5));
		//6번 문제
		System.out.println(mt.str("apple", 'p'));
	
		String temp = "abcdefg";

		System.out.println(temp.length());
	}
}