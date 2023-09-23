package objectTest;

import java.util.Random;

class Animal{
	String name;
	String kind;
	int age;
	
	public Animal() {;}

	public Animal(String name, String kind, int age) {
		super();
		this.name = name;
		this.kind = kind;
		this.age = age;
	}
//	@Override
//	public String toString() {
//		return "이름 : " + name +", " +"종 : " + kind + " ," + "나이 : " + age;
//		
//	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", kind=" + kind + ", age=" + age + "]";
	}
}
public class ToStringTest {
	public static void main(String[] args) {
		Random r = new Random();
		//항상 객체명을 출력할 때에는 toString()이 생략되어 있었다.
		System.out.println(r.toString());
		
		
		Animal animal = new Animal("진순이", "진돗개", 0);
		//초기화가 잘 됐는 지 확인할 때 사용할 수도 있다.
		System.out.println(animal.toString()); //toString 생략
		
	}
}
