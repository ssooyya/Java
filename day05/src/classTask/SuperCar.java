package classTask;

public class SuperCar {
	//브랜드, 색상, 가격, 엔진상태
	String brand;
	String color;
	int price;
	
	//엔진 상태
	//check가 true라면, 시동이 켜져있는 상태
	boolean check;
	
	//기본 생성자
	public SuperCar() {;}
	
	//오버로딩
	//초기화 생성자
	public SuperCar(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		
		//초기화를 우리가 해주지 않아도, new가 초기값을 넣어주기 때문에 이런 경우에는 굳이 적지 않아도 된다.
//		this.check = false;//적지 않아도 됨
	}
	//시동 켜기
	//시동의 상태를 확인하고
	//시동이 꺼져있다면, "시동켜기"출력
	//이미 시동이 켜져있다면, "시동이 이미 켜져있습니다"출력
	void engineStart() {
		if(check) { //굳이 check == true로 적지 않아도 됨
			System.out.println("시동이 이미 켜져있습니다.");
		}else {
			System.out.println("시동을 켰습니다.");
			check = true;
		}
	}
	//시동 끄기
	//시동이 켜져있다면, "시동끄기"출력
	//이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다"출력
	void engineStop() {
		if(!check) {
			System.out.println("시동이 이미 꺼져있습니다.");
		}
		else {
			System.out.println("시동을 껐습니다.");
			check = false;
		}
	}
	
	
	

}
