package arrayListTest;

import java.util.ArrayList;

public class Car_dao {
	
	//자동차 정보를 담을 DB 선언
	public static ArrayList<Car> cars = new ArrayList<Car>();
	
//	자동차 추가
	public void add(Car car) {
		cars.add(car);
	}
	//자동차의 이름을 전달하면
	//자동차의 브랜드를 리턴해주는 메소드 만들기
	//매개변수로 스포티지 입력시 -> "기아" 리턴
	//없다면 "찾지 못했습니다." 문자열 리턴
	public String printBrand(String name) {
		for (Car car : cars) {
			if(car.getName().equals(name)) {
				return car.getBrand();
			}
		}
		return "찾지 못했습니다.";
	}
	//사용자가 원하는 브랜드의 자동차 목록 조회하기
	//매개변수로 기아가 넘어오면, 브랜드가 기아인 자동차들을 전부 조회
	//메소드 이름은 getCars()
	public ArrayList<Car> getCars(String brand) {
		ArrayList<Car> result = new ArrayList<Car>();
		for (Car car : cars) {
			if(car.getBrand().equals(brand)) {
				result.add(car);
			}
		}
		return result;
	}
	//자동차의 가격 수정(20%인상)
	//매개변수로 자동차의 이름을 전달했을 때, 해당 자동차의 가격이 수정되게
//	public void updatePrice(String name) {
//		for (Car car : cars) {
//			if(car.getName().equals(name)) {
//				car.setPrice((int)(car.getPrice()*1.2));
//				break;
//			}
//		}
//	}
	//리턴 타입이 void가 아닌 boolean으로 바꿈으로써 실행 결과에 따라서
	//우리가 화면에서 조금 더 코드를 제어할 수 있게 되었다.
	public boolean updatePrice(String name) {
	      for (Car car : cars) {
	         if(car.getName().equals(name)) {
	            car.setPrice((int)(car.getPrice()*1.2));
	            return true;
	         }
	      }
	      return false;
	   }
}