package arrayListTest;

public class Car {

//	이름, 가격, 브랜드(기아, 현대, 삼성, 쉐보레)
	private String name;
	private int price;
	private String brand;
	
	//기본 생성자
	public Car(){;}

	public Car(String name, int price, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	//toString() 재정의
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", brand=" + brand + "]\n";
	}
}
