package castingTest;

public class CastingTask {
// 음원플랫폼을 하나 만들거에요
//발라드, 아이돌, 힙합 클래스 선언
//사용자가 선택한 음악에 따라
// 발라드라면 "가수 sns" 이동 기능 사용
// 힙합이라면 "가사 지원" 기능 사용
// 아이돌이라면 "굿즈"판매 사이트 이동 기능 사용
	
	void check(Music music) {
		//만약, music으로 넘어온 친구가 발라드에서 up casting이 된 친구라면,
		//발라드 클래스 안에 정의해준 메소드를 실행해주자.
		if (music instanceof Ballad) {
			Ballad b = (Ballad)music;
			b.sns();
//			((Ballad)music).sns();
		}else if(music instanceof HipHop) {
			((HipHop)music).lyric();
		}else{
			((Idol)music).goods();
		}
	}
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		
		Music m1 = new Ballad();
		Music m2 = new HipHop();
		Music m3 = new Idol();
		
		ct.check(m1); //가수 sns 이동
		ct.check(m2); //가사 지원
		ct.check(m3); //굿즈 판매 사이트
	}
}