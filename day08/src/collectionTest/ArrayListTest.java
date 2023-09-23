package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
		//<?> : 제네릭
		//객체화 시 타입을 지정하는 기법
		//설계할 때는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
		//따로 다운 캐스팅 할 필요가 없다. 그렇기에 제네릭에는 Object는 사용하지 않는다.
		//저장할 타입에 제한을 줄 수 있다.
		
		//꺽새까지가 하나의 타입이다.
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		//추가
		datas.add(100);
		datas.add(200);
		datas.add(300);
		datas.add(400);
		datas.add(500);
		datas.add(600);
		datas.add(700);
		datas.add(800);
		datas.add(900);
		
		System.out.println(datas);
		
//		System.out.println(datas[0]);		//배열의 인덱싱 방식
//		System.out.println(datas.get(5));	//리스트의 인덱싱 방식(메소드)
//		System.out.println(datas.size());	//리스트의 길이 확인
		
		//반복문을 돌려, 인데스 번호를 활용하여, 데이터들을 확인
		for (int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i) + " ");
		}
		//정렬
//		Collections.sort(datas);
//		System.out.println(datas);
//		
//		Collections.reverse(datas);
//		System.out.println(datas);
//		
//		Collections.shuffle(datas);
//		System.out.println(datas);
		
		//추가(삽입)
		datas.add(0, 1000);
		System.out.println(datas);
		
		System.out.println(datas.contains(500));	//데이터의 존재 유무 검사 (조건)
		System.out.println(datas.indexOf(500));		//그 데이터의 인덱스 번호를 리턴
	
		//리스트에 400이 있는지 검사하고, 만약 400이 있다면
		//400뒤에 4000을 삽입하시오.
		if(datas.contains(400)) {
			datas.add(datas.indexOf(400)+1,4000);
		}
		System.out.println(datas);
		
		//수정
//		datas.get(0) = 5000;
		//4000을 40으로 수정
		System.out.println(datas.set(datas.indexOf(4000), 40)+"을 40으로 수정했습니다.");
		System.out.println(datas);
		//삭제
		//인덱스 번호를 활용하여 삭제하기
		System.out.println(datas.remove(0)+"을 삭제했습니다.");
		System.out.println(datas);
		
		//값을 활용하여 삭제하기
		//정수를 그대로 전달하면 인덱스 번호로 판단하여 에러가 난다.
		//그렇기에 제네릭에 Integer로 해줬기 때문에 int값을 Integer로 boxing해줘야한다.
//		System.out.println(datas.remove(500));
		System.out.println(datas.remove(Integer.valueOf(500)));
		System.out.println(datas.remove((Integer)(900)));	//형변환
		
		System.out.println(datas);
	}

}
