package array;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arData = {2, 4, 6, 8, 10};
//		System.out.println(arData);	//배열의 시작주소
//		System.out.println(arData.length);
		
//		int[] temp = new int[5];
//		System.out.println(temp[3]);
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		//5, 4, 3, 2, 1을 넣고 출력
		System.out.println("배열의 값을 넣기 시작");
		for (int i = 0; i < arData.length; i++) {
			arData[i] = 5 - i;
		}
		System.out.println("배열의 값을 넣고 확인");
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
	}
}
