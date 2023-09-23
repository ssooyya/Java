package collectionTask;

import java.util.Scanner;

public class WebPage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserService us = new UserService();

		String mainMsg = "류호근 페이지 오신 걸 환영합니다.\n1. 로그인\n2. 회원가입\n3. 아이디 찾기\n4. 비밀번호 찾기\n5. 종료하기";
		String myMsg = "\n1. 내 정보 보기\n2. 비밀번호 변경하기\n3. 로그아웃";
		String idMsg = "아이디 : ", pwMsg = "비밀번호 : ",errorMsg = "번호를 다시 입력해주세요";
		
		String id = null, pw = null, name = null, phoneNumber = null;
		int choice = 0, age = 0;
		User loginUser = null;

		// 더미데이터(임시 데이터)
		us.join("test", "test", "test", "01000000000", 22);

		while (true) {
			System.out.println(mainMsg);
			choice = sc.nextInt();

			if (choice == 5) {
				System.out.println("안녕히 가세요!");
				break;
			}
			switch (choice) {
			case 1:
				while (true) {
					System.out.println(idMsg);
					id = sc.next();
					System.out.println(pwMsg);
					pw = sc.next();

					loginUser = us.login(id, pw);

					if (loginUser == null) {
						System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");
						System.out.println("1. 다시 입력\n2. 메인화면으로 돌아가기");
						choice = sc.nextInt();
						if (choice == 1) {
							continue;
						}
						break;
					} else {
						System.out.println(myMsg);
						while (true) {
							choice = sc.nextInt();
							if (choice == 3) {
								System.out.println("로그아웃 완료!");
								break;
							}
							switch (choice) {
							case 1: // 내 정보 보기
								us.printUser(loginUser);
								break;
							case 2: // 비밀번호 수정
								System.out.println("새로운 비밀번호 : ");
								pw = sc.next();
								us.updatePw(loginUser.getId(), pw);
								System.out.println("비밀번호 변경 성공");
								break;
							default:
								System.out.println(errorMsg);
								break;
							}
						}
						break;
					}
				}
				break;
			case 2: // 회원가입
				while (true) { // 중복 검사 부분
					System.out.println(idMsg);
					sc.next();
					id = sc.next();
					if (!us.checkId(id)) {
						System.out.println("아이디를 다시 입력하세요");
						continue;
					}
					System.out.println("사용 가능한 아이디입니다.");
					break;
				}
				System.out.println(pwMsg);
				pw = sc.next();
				System.out.println("이름 : ");
				name = sc.next();
				System.out.println("핸드폰 번호 : ");
				phoneNumber = sc.next();

				System.out.println("나이 : ");
				age = sc.nextInt();

				us.join(id, pw, name, phoneNumber, age);
				System.out.println("회원가입 성공!");
				break;
			case 3://아이디 찾기
				break;
			case 4://비밀번호 찾기
				break;
			default:
				System.out.println(errorMsg);
				break;
			}
		}
		System.out.println(UserService.userList);

	}

}
