package casting;

public class CastingTest3 {
	public static void main(String[] args) {
//		연결
//		String의 자동 형변환
		System.out.println("1" + 3);
		
		System.out.println("1" + 3 + 8); //우선순위가 동일
		System.out.println("1" + (3 + 8));
		System.out.println("1 더하기 3은 " + (1 + 3));
		
		int data = 49;
		String data1 = data + "";	//문자열로 만들기
		
		System.out.println(data1);
		System.out.println(data1 + 1);
		
	}
}