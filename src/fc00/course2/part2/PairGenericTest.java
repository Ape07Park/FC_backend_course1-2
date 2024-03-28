package fc00.course2.part2;

import java.util.HashMap;
import java.util.Map;

import fc00.model2.Pair;

public class PairGenericTest {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("hello", 1);
		
		System.out.println(pair.getKey()); // hello
		System.out.println(pair.getValue()); // 1
		
		// 검색을 빠르게 할 수 있는 자료구조(HashMap, HashTable)
		Map<String, Integer> map = new HashMap<>();
		map.put("kor", 70);
		map.put("math", 80);
		map.put("eng", 90);
		
		System.out.println(map.get("kor"));
		System.out.println(map.get("math"));
		System.out.println(map.get("eng"));
		

	}

}
