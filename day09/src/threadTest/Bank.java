package threadTest;

public class Bank implements Runnable {

	public static int money = 50000;

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			buyItem(5000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// 메소드 자체에 동기화 설정
	public /* synchronized */ void buyItem(int money) {
		// mutex : 우리가 동기화를 걸어줄 객체라고 생각하면 된다.
		synchronized (this) {
			this.money -= money;
			System.out.println(Thread.currentThread().getName() + "이(가) 출금");
			System.out.println("잔액 : " + this.money + "원");
		}

	}

}
