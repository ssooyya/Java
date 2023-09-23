package hashMapTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//put(), get()
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 1);
		map.put("D", 4);
		
		System.out.println(map.put("E", 5));
		System.out.println(map.put("D", 15));
		System.out.println(map);
		
		//키 값으로 value에 접근하기
		//없는 키 값을 전달하면 null이 리턴된다.
		System.out.println(map.get("O"));
		
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
	}

}
