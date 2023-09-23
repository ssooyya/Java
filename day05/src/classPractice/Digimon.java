package classPractice;

import java.util.Random;

public class Digimon {

	String[] rank = { "아구몬", "그레이몬", "메탈그레몬", "워그레이몬" };

	String name;
	int hp;
	int exp;
	int feedCount;// 먹이넘버
	int rankNumber;// 인덱스 번호

	public Digimon(String name) {
		this.name = name;
		hp = 11;
		feedCount = 10;
	}

	void fight() {
		if (hp <= 5) {
			System.out.println("먹기나 잠자기를 통해서 hp를 회복해주세요\n");
			hp -= 5;
			exp += 5;
		} else {
			Random r = new Random();
			int[] percent = new int[10];
			int rating = 50;
			System.out.println("싸움을 시작해볼까\n");
			
			for (int i = 0; i < rating / 10; i++) {
				percent[i] = 1;
			}
			if(percent[r.nextInt(percent.length)]==1) {	//대성공
				System.out.println("이 구역의 적들을 쓸어버렸어\n");
				exp = 10;
			}else {//일반성공
				System.out.println("힘든 싸움이었다...\n");
			hp -= 5;
			exp += 5;
			}
		}
	}
	
	void doEvolution() {
		if(rankNumber == 3) {
			System.out.println("이미 최종 단계입니다.\n");
			return; //함수의 종료 기능으로 사용
		}
		if(exp < 10) {//아직 진화 불가
			System.out.println("경험치를 더 채우고 오도록\n");
		}else {
			System.out.println(rank[rankNumber]+"진화");
			for (int i = 0; i < 3; i++) {
				//Thread를 만지면, 오류가 날 수도 있기 때문에 그 오류를 처리한다.
				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
				System.out.print("...");
			}
			exp = 0;
			hp = 11;
			System.out.println("\n"+rank[++rankNumber]+"등장\n");
		}
	}
	
	void sleep() {
		System.out.print(name + "(이)가 잠자는 중");
		for (int i = 0; i < 3; i++) {
			//Thread를 만지면, 오류가 날 수도 있기 때문에 그 오류를 처리한다.
			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
			System.out.print("...");
		}
		System.out.println("\n아이고 잘잤다\n");
		hp += 3;
	}
	
	void eat() {
		if(feedCount < 1) {
			System.out.println("먹이가 없어요ㅜㅜ\n");
			return;
		}
		System.out.println("아이 맛있다.\n");
		feedCount--;
		hp += 2;
	}
	
	//최종보스 도전하기 기능
	//최종보스를 잡을 확률은
	//rankNumber
	//0(인덱스 번호) : 20%
	//1 : 40%
	//2 : 60%
	//3 : 80%
	//무찌르는데 성공했다면, 엔딩메세지 띄워주고 끝
	//무찌르는데 실패했다면, 진화 1단계 다운, 경험치 0, hp 1
	boolean tryBoss() {
		Random r = new Random();
		int[] percent = new int[10];	//10%
		int rating = 0;
		boolean check=false;
		
		switch(rankNumber) {
		case 0:
			rating = 20;
			break;
		case 1:
			rating = 40;
			break;
		case 2:
			rating = 60;
			break;
		case 3:
			rating = 80;
			break;
		default:
			System.out.println("rankNumber가 올바르지않습니다.");
		}
		
		for (int i = 0; i < rating / 10; i++) {
			percent[i] = 1;
		}
		
		if(percent[r.nextInt(percent.length)] == 1) {	//대성공
			System.out.println("디지몬 세계를 구했군요\n");
		}else {	//일반성공
			System.out.println("다시 성장해오마\n");
			if(rankNumber == 0) {
				hp = 1;
				exp = 0;
				check = true;
			}else {
				rankNumber -= 1; 
				hp=1;
				exp = 0;
				check = true;
			}
		}
		//check가 true면 무찌르기 실패
		return check;
	}
}