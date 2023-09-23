package lambdaTest;

@FunctionalInterface
public interface PrintName {
	//성과 이름을 전달 받은 후 String으로 리턴하는 추상 메소드 선언
	public String getFullName(String firstName, String lastName); 

}
