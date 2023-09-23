package casting;

public class CastingTest4 {
	public static void main(String[] args) {
//		앞에 바로 붙여주는 강제 형변환은 일반과 일반끼리만 사용 가능
//		String 클래스 타입!
//		클래스 타입은 클래스를 이용해서 형변환 해야한다.
//		int의 클래스 타입은 Integer
//		"문자열"을 전달했을 때 정수로 바꾸는 기능이 Integer에 만들어져 있다. 메소드!
		
		System.out.println(Integer.parseInt("10") + 1);
		System.out.println(Double.parseDouble("3.14") + 10);                                                                                                                                                                                                                                                                                                                                                                                                                                
	}
}