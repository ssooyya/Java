package storageClass;

public class VariableTest {

	public static void main(String[] args) {
		Family mom = new Family("엄마");
		Family son = new Family("아들");
		
		//일반 멤버 변수로는 우리가 원하는 방식으로 구현할 수 없다.
//		System.out.println(mom.money);
//		mom.increaseMoney();
//		son.increaseMoney();
//		System.out.println(mom.money);
//		System.out.println(son.money);
		
		//정적 변수를 활용해서, 우리가 원하는 방식으로 구현할 수 있다.
//		System.out.println(Family.money_s);
//		mom.increaseMoney_s();
//		son.increaseMoney_s();
		
		mom.increaseMoney();
		mom.increaseMoney();
		mom.increaseMoney();
		mom.increaseMoney();
		mom.increaseMoney();
		mom = new Family("엄마");		//생성자를 새로 수정
		mom.increaseMoney();
		mom.increaseMoney();
		mom.increaseMoney();
		mom.increaseMoney();
		mom.increaseMoney();
		System.out.println("실행 후 남은 총액  : " + mom.money);
		System.out.println("---------------------------------");
		
		son.increaseMoney_s();
		son.increaseMoney_s();
		son.increaseMoney_s();
		son.increaseMoney_s();
		son.increaseMoney_s();
		son = new Family("아들");
		son.increaseMoney_s();
		son.increaseMoney_s();
		son.increaseMoney_s();
		son.increaseMoney_s();
		son.increaseMoney_s();
		System.out.println("실행 후 남은 총액 : " + Family.money_s);
		
		Family.money_s = 200;
	      
	    System.out.println("실행 후, 남은 총액 : " + Family.money_s);
	}
}