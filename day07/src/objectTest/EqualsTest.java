package objectTest;

class Student {
	int number;
	String name;
	public Student() {;}

	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}

	// 학생들의 객체를 equals() 메소드로 비교를 했을 때
	// 이름과는 상관 없이, 학생의 번호만 같다면
	// true를 return 하도록 equals() 를 재정의해보자.
	@Override
	public boolean equals(Object obj) {
		//주소 비교
		if (this == obj) {
            return true;
        }
		//타입 비교
        if (obj instanceof Student) {
        	//다운 캐스팅
            Student s = (Student)obj;
            if (this.number==s.number) {
                return true;
            }
        }
        return false;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";
		String data3 = new String("ABC");
		String data4 = new String("ABC");

		System.out.println(data1 == data2);
		System.out.println(data1.equals(data2));
		System.out.println(data3 == data4);
		System.out.println(data3.equals(data4));
		
		Student s1 = new Student(1, "권희수");
		Student s2 = new Student(2, "홍길동");
		
		System.out.println(s1.equals(s2));
		
	}
}
