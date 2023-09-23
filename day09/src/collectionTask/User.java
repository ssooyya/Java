package collectionTask;

public class User {
	//아이디, 비밀번호, 이름, 휴대폰번호, 나이
	private String id;
	private String pw;
	private String name;
	private String phoneNumber;
	private int age;
	
	//초기화 생성자
	public User(String id, String pw, String name, String phoneNumber, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	//getter, setter
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//toString()재정의
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", phoneNumber=" + phoneNumber + ", age=" + age
				+ "]\n";
	}
	
	
}
