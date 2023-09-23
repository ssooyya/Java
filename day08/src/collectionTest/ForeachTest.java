package collectionTest;

public class ForeachTest {

	public static void main(String[] args) {
		
		int[][] numbers = {{50, 70, 100},{1, 8}};
		
//		System.out.println(numbers[0][0]);
		
//		for문을 이용하여 모든 요소를 출력해보자
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				System.out.println(numbers[i][j]);
//			}
//		}
		//foreach(요소 처음:반복을 돌릴객체)
		for (int[] is : numbers) {
			for (int number : is) {
				System.out.println(number + " ");
			}
		}
	}
}