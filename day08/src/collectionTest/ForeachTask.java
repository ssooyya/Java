package collectionTest;

public class ForeachTask {

	public static void main(String[] args) {
		//실습
		//각 학생의 총점과 평균을 출력해보세요
		int[][] scores = {{100, 80, 65}, {40, 77, 30}};
		
		int sum = 0;
		double avg = 0.0;
		
		for (int[] is : scores) {
			sum = 0;
			for (int score : is) {
				System.out.println(score + " ");
				sum += score;
				avg = (double)sum / 3;
//				avg = sum/(double)is.length;
//				avg = Double.parseDouble(String.format("%.2f",avg));
			}
			System.out.println("총합 : "+ sum);
			System.out.println("평균 : " + avg);
		}
	
//		실습
//      각 학생의 총점과 평균을 출력해보세요!
//      int[][] scores = {{100, 80, 65}, {40, 77, 30}};
//      int total = 0;
//      double avg = 0.0;
//      int number = 0;
//      
//      for (int[] stu : scores) {
//         total = 0;
//         for (int score : stu) {
//            total += score;
//         }
//         avg = total/(double)stu.length;
//         avg = Double.parseDouble(String.format("%.2f", avg));
//         
//         System.out.println(++number + "번 학생의 총점 : " + total);
//         System.out.println(number + "번 학생의 평균 : " + avg);
//         
//      }

	}
}