package collectionTask;

import java.util.ArrayList;

public class UserService {
	//DB 선언
	public static ArrayList<User> userList = new ArrayList<User>();
	
	//id 중복검사
	public boolean checkId(String id) {
		for (User user : userList) {
			if(user.getId().equals(id)) {
				//내가 사용하고 싶은 아이디가 이미 존재하고 있다면 여기로 들어온다.
				return false;
			}
		}return true;
	}
	
	//회원가입
	public void join(String id, String pw, String name, String phoneNumber, int age) {
		User user = new User(id, pw, name, phoneNumber, age);
		userList.add(user);
	}
	
	//휴대폰 번호 중복 검사
	public boolean checkPhone(String phone) {
		for (User user : userList) {
			if(user.getPhoneNumber().equals(phone)) {
				//내가 사용하고 싶은 아이디가 이미 존재하고 있다면 여기로 들어온다.
				return false;
			}
		}
		return true;
	}
	
	//로그인 user 객체 
	public User login(String id, String pw) {
		for (User user : userList) {
			if(user.getId().equals(id)&&user.getPw().equals(pw)) {
				return user;
			}
		}
		return null;
	}
	//내 정보 보기 메소드
	//모든 정보가 출력되도록 구현
	public void printUser(User user) {
		System.out.println("아이디 : " + user.getId());
		System.out.println("이름 : " + user.getName());
		System.out.println("핸드폰 번호 : " + user.getPhoneNumber());
		System.out.println("나이 : " + user.getAge());
	}
	//비밀번호 수정
	public void updatePw(String id, String pw) {
		for (User user : userList) {
			if (user.getId().equals(id)) {
				if(user.getPw().equals(pw)) {
					System.out.println("똑같은 비밀번호로는 변경이 불가능합니다.");
				}
				user.setPw(pw);
				return;
			}
		}
	}
	
}
