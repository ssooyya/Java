package castingTest;

class Car{
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
}
class SuperCar extends Car{
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void openRoof(){
		System.out.println("지붕 열기");
	}
}

public class CastingTest {

	public static void main(String[] args) {
		Car morning = new Car();
		SuperCar lambo = new SuperCar();
		
		//up casting
//		Car c1 = new SuperCar();
		Car c1 = lambo;
		c1.engineStart();	//재정의 되어있는 형태로 실행된다.
//		c1.openRoof();	//플러스 알파는 사용할 수 없다.
		
		//down casting(강제 형변환으로 하면 된다.)
		SuperCar upgradeC1 = (SuperCar)c1;
		upgradeC1.openRoof();
		
		//살려줄 +알파가 없으면 안된다.
//		SuperCar upgradeMorning = (SuperCar)morning;
//		upgradeMorning.engineStart();
		
		//instanceof
//		morning instanceof Car : true
		System.out.println(morning instanceof Car);
		
//		morning instanceof SuperCar : false
		System.out.println(morning instanceof SuperCar);
		
//		lambo instanceof Car : true
		System.out.println(lambo instanceof Car);
		
//		lambo instanceof SuperCar : true
		System.out.println(lambo instanceof SuperCar);
		
//		c1 instanceof Car : true
		System.out.println(c1 instanceof Car);
		
		//요거 하나만 주의
//		c1 instanceof SuperCar : true
		System.out.println(c1 instanceof SuperCar);
		
//		upgradeC1 instanceof Car : true
		System.out.println(upgradeC1 instanceof Car);
		
//		upgradeC1 instanceof SuperCar : true
		System.out.println(upgradeC1 instanceof SuperCar);
		
	}
}