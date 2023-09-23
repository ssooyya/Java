package arrayListTask;

import java.util.ArrayList;

public class CoffeeTest {
	public static void main(String[] args) {
		
		CafeService cs = new CafeService();
		
		
		cs.add(new Coffee("아메리카노", 2500, false));
		cs.add(new Coffee("카페라떼", 3000, false));
		cs.add(new Coffee("아이스티", 3000, true));
		cs.add(new Coffee("오레오 쉐이크", 5600, true));
		cs.add(new Coffee("민트초코 프라푸치노", 6700, true));
		cs.add(new Coffee("미숫가루", 4000, false));
		
		System.out.println(CafeService.coffees);
		
		cs.delete("미숫가루");
		System.out.println(CafeService.coffees);
		
		cs.updatePrice("오레오 쉐이크");
		System.out.println(CafeService.coffees);
		
		
		System.out.println(cs.sale("카페라떼"));
		
	}
}
