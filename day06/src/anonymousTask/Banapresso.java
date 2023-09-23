package anonymousTask;

public class Banapresso {	//본사
	
	public void register(Form form) {//전달
		String[] menus = form.getMenu();
		
		System.out.println("-----메뉴-----");
		
		for (int i = 0; i < menus.length; i++) {
			System.out.println(i + 1 + ". " + menus[i]);
		}
		//양식을 검사하는데, 무료 나눔 행사 중이라면 무료 나눔 행사 중이라고 출력
		//instanceof 객체간 타입 비교
		if (form instanceof FormAdapter) {
			System.out.println("무료 나눔 행사중 ");
			return;
		}
		form.sell(menus[0]);
	}
}
