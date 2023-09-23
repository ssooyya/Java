package wrapperTest;

public class WrapperTask {
	public static void main(String[] args) {
		//1, 3.14, 49.1F, 'H', "류호근", true
		//위 6개의 값을 6칸 배열에 담기
		Integer data1 = 1;
		Double data2 = 3.14;
		Float data3 = 49.1F;
		Character data4 = 'H';
		String data5 = "류호근";
		Boolean data6 = true;
		
		Object[] obj = {data1, data2, data3, data4, data5, data6};
		
		
		//for문 사용해서 배열에 담긴 값 출력
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i] + " ");
		}
	}
}
