package storageClass;

public class Family {
	String name;
	int money = 10000;
	static int money_s = 10000;
	
	public Family(String name) {
		this.name=name;
	}
	
	
	void increaseMoney() {
		money -= 1000;
		System.out.println(name+"(일반 변수)현재 남은 돈 : "+ money);
	}
	void increaseMoney_s() {
		money_s -= 1000;
		System.out.println(name+"(정적 변수)현재 남은 돈 : " + money_s);
	}
}