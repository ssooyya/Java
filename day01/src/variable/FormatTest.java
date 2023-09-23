package variable;

public class FormatTest {
	public static void main(String[] args) {

//		이름, 나이, 키를 저장할 변수를 선언한 후에 본인 걸로 초기화 
		String name = "권희수";
		int age = 24;
		double height = 164.6465;
		
		System.out.printf("이름 : %10s\n", name);
//		System.out.printf("나이 : %d살\n", age);
//		System.out.printf("키 : %fcm", height);
		
		System.out.printf("나이 : %d살\n키 : %.2fcm\n", age, height);
		System.out.printf("나이 : %02d살\n키 : %.2fcm\n", 7, 136.7);
	}
}
