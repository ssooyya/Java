package hashSetTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> animalSet = new HashSet<String>();
		
		animalSet.add("강아지");
		animalSet.add("고양이");
		animalSet.add("토끼");
		animalSet.add("펭귄");
		//add의 리턴 타입은 boolean
		//이미 추가한 데이터를 또 추가하면 false를 반환
		//중복되는 데이터가 아니라면 true를 반환
		System.out.println(animalSet.add("소"));
		System.out.println(animalSet.add("펭귄"));
		
		//저장한 순서대로 값이 저장되어 있는가?
		//set에서 특정 값을 가져올 수 있는가?
		//HashSet은 값을 가져올 수가 없다. 그런데 어떻게 toString()으로는 값을 가져오는가?
		//다른 자료구조로 변환하여 값을 가져와야한다.
		System.out.println(animalSet.toString());
		
		Iterator<String> animalIter = animalSet.iterator();
//		System.out.println(animalIter);
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
		
		while(animalIter.hasNext()) {
			System.out.println(animalIter.next() + " ");
		}
	}

}
