package access1;

public class Access1 {
	int data1 = 10;	// default
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;
	
	
	//private->public으로 접근
	public int getData4() {
		return data4;
	}
	public void setData4(int data4) {
		this.data4 = data4;
	}
	
//	public int getData4() {
//		return data4;
//	}	//data4의 수정이 필요없다면 만들 필요가 없음
//	public void setData4(int data4) {
//		this.data4 = data4;
//		
//	}
	
}