package classPractice;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Digimon digimon = new Digimon("포근이");
		Scanner sc = new Scanner(System.in);

		String startMsg = "☆★☆★☆★ 디지몬 세계를 구해줘 ☆★☆★☆★";
		String menu = "1. 상태확인창\n2. 악의 무리 무찌르기\n3. 포근아 진화시켜줘\n4. 잠자기\n5. 먹기\n6. 최종보스\n7. 게임 종료";

		int choice = 0;
		boolean flag = true;

		System.out.println(startMsg);

		while (flag) {
			System.out.println(menu);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("이름 : " + digimon.name);
				System.out.println("진화 상태 : " + digimon.rank[digimon.rankNumber]);
				System.out.println("hp : " + digimon.hp);
				System.out.println("exp : " + digimon.exp);
				System.out.println("보유 먹이 갯수 : " + digimon.feedCount + "\n");
				break;

			case 2:// 악의 무리 무찌르기
				digimon.fight();
				break;

			case 3:// 진화하기
				digimon.doEvolution();
				break;

			case 4:// 잠자기
				digimon.sleep();
				break;

			case 5:// 먹이 먹기
				digimon.eat();
				break;

			case 6:
				flag = digimon.tryBoss();
				break;
				
			case 7:
				while (choice != 1 && choice != 2) {
					System.out.println("진짜 디지몬 세계를 버릴거야?");
					System.out.println("1. 아니지 끝을 보겠어\n2. 미안해 난 여기까지야");
					choice = sc.nextInt();

					switch (choice) {
					case 1:
						System.out.println("그럴 줄 알았어 다시 한 번 가보자고");
						break;

					case 2:
						System.out.println("실망이야");
						flag = false;
						break;

					default:
						System.out.println("다시 입력해주세요");
						break;
					}
				}
			default:
				System.out.println("다시 입력해주세요\n");
				break;
			}
		}
	}
}
