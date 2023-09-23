package threadTest;

public class ThreadTest {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("하하");
		MyThread t2 = new MyThread("호호");
		
		//run은 단순히 메소드 실행
//		t1.run();
//		t2.run();
		
		//start는 쓰레드를 실행 
		t1.start();
		t2.start();

	}

}
