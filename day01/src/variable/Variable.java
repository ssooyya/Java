package variable;

public class Variable {
	public static void main(String[] args) {		
		
//		선언과 초기화를 동시에
		int age = 22;
//		weight라는 변수를 지금 말고 나중에 사용할 것 같아.
//		그래서 선언만 해 놓을래
		double weight;
		
//		선언만 해놓은 weight 안에 값을 넣으며 초기화
		weight = 75.5;
		
//		아직 어떤 값을 넣을지 모르는 변수를 선언할때
//		초기값을 활용해서 초기화 할 수 있다.
		double height = 0.0;
		
//		수정
		height = 175.5;
		
		System.out.println(age);
		System.out.println(22);
		System.out.println(age + 1);
		System.out.println(weight);
//		System.out.println(height);
		
	}
}
