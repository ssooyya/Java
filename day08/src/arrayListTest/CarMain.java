package arrayListTest;

import java.util.ArrayList;

public class CarMain {
	public static void main(String[] args) {
		
		Car_dao cd = new Car_dao();
		
		cd.add(new Car("소나타",3000,"현대"));
		cd.add(new Car("스포티지",4000,"기아"));
		cd.add(new Car("소렌토",5000,"기아"));
		cd.add(new Car("GV80",8000,"현대"));
		cd.add(new Car("SM6",3000,"삼성"));
		cd.add(new Car("EV9",7000,"기아"));
		
		System.out.println(Car_dao.cars);
		
		//자동차 이름으로 브랜드 리턴시키는 메소드 테스트
		System.out.println(cd.printBrand("GV80"));
		
		//브랜드를 입력했을 때 그 브랜드에 해당하는 자동차 리스트 리턴시키는 메소드 테스트
		ArrayList<Car> result = cd.getCars("기아");
		System.out.println("\n내가 찾는 자동차 목록 : ");
		System.out.println(result);
		
		cd.updatePrice("EV9");
	    System.out.println(Car_dao.cars);
	      
		if(cd.updatePrice("마티즈")) {
			System.out.println(Car_dao.cars);
		} else {
			System.out.println("자동차 이름을 정확히 입력하세요");
		}
	}
}
