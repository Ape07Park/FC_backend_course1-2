package fc00.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> studentScores = new HashMap<String, Integer>();
		
		// .put(key, value): 데이터 추가 
		studentScores.put("kim", 100);
		studentScores.put("park", 90);
		studentScores.put("lee", 80);
		studentScores.put("jung", 70);
		
		// .get(key): 데이터 조회 
		System.out.println(studentScores.get("park"));
		System.out.println(studentScores.get("kim"));
		
		// .put(key, value): 데이터 수정 
		System.out.println(studentScores.put("park", 92));
		
		// .remove(key)
		studentScores.remove("lee");
		
		// 전체 데이터 출력 
		for(Map.Entry<String, Integer> entry: studentScores.entrySet()) {
			System.out.println(entry.getKey() +":" + entry.getValue());
		}
	}

}
