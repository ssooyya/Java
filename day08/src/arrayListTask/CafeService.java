package arrayListTask;

import java.util.ArrayList;

public class CafeService {
	//coffee 메뉴들을 저장할 DB선언하기
	public static ArrayList<Coffee> coffees = new ArrayList<Coffee>();
	
	//coffee 메뉴 추가
	public void add(Coffee coffee) {
		coffees.add(coffee);
	}
	
	//coffee 메뉴 삭제
	//메뉴의 이름으로 삭제, 메뉴의 이름은 매개변수로 받아온다.
	public void delete(String name) {
		for (Coffee coffee : coffees) {
			if (coffee.getName().equals(coffee.getName())) {
				coffees.remove(coffee);
				return;
			}
		}
	}
	//coffee 가격 수정
	//메뉴의 이름으로 가격 10% 인상, 메뉴의 이름은 매개변수로 받아온다.
	public void updatePrice(String name) {
		for (Coffee coffee : coffees) {
			if (coffee.getName().equals(name)) {
				coffee.setPrice((int)(coffee.getPrice()*1.1));
				return;
			}
		}
	}
	
	//coffee 판매
	//메뉴의 이름으로 판매 구현, 메뉴의 이름은 매개변수로 받아온다.
	//단, sale이 true라면 50%할인된 가격으로 판매
	//판매 구현은 메뉴의 이름과 가격을 출력하는 형식으로 하자
	//예) "아메리카노 : 2500원 결제 완료!"
	public String sale(String name) {
		int salePrice = 0;//
		for (Coffee coffee : coffees) {
			if (coffee.getName().equals(name)) {
				if(coffee.isSale()==true) {
					salePrice = (int)(coffee.getPrice()*0.5);
					return coffee.getName()+" : " + coffee.getPrice() + "원 결제 완료!";
				}
				return coffee.getName()+" : " + coffee.getPrice() + "원 결제 완료!";
			}
		}
		return "해당 메뉴가 없습니다.";
	}
}