package lambdaTest;

public class PrintNameTest {
	//외부에서 람다식으로 구현한 값을 name으로 전달받기
	public static void printFullName(PrintName name) {
		System.out.println(name.getFullName("권", "희수"));
	}
	
	
	public static void main(String[] args) {
	//매개변수 2개를 설정하고, 두 문자열을 연결하도록 구현
		printFullName((firstName, lastName)-> firstName+lastName);
		
//		PrintName name = new PrintName() {
//			
//			@Override
//			public String getFullName(String firstName, String lastName) {
//				// TODO Auto-generated method stub
//				return firstName + lastName;
//			}
//		};
//		printFullName(name);
	}
}
