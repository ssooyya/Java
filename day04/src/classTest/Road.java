package classTest;

class Vehicle{
	String brand;
	String color;
	int price;
	
	public Vehicle(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public Vehicle(String brand) {
		this.brand = brand;
		color = "black";
		price = 5000;
	}
	
	void engineStart() {
		System.out.println(this.brand + " 시동 켜기");
	}
	void engineStop() {
		System.out.println("시동 끄기");
	}
}

public class Road {
	public static void main(String[] args) {

		 Vehicle v1 = new Vehicle("기아");
		 Vehicle v2 = new Vehicle("현대", "white", 1000);
		 System.out.println(v1.brand);
		 System.out.println(v1.color);
		 System.out.println(v1.price);
		 
		 v1.engineStart();
		 v2.engineStart();
	}
}
