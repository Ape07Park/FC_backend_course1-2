 package fc00.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		// 엘리맨트 추가, 중복 x
		set.add("바나나");
		set.add("애플");
		set.add("참외");
		
		// .size(): 엘리맨트 개수 
		System.out.println("Set size:" + set.size());
		
		
		for (String str : set) {
			System.out.println(str);
		}
		
		set.remove("바나나");
		
		// 엘리맨트 포함 확인 - .contains(엘리맨트)
		boolean contain = set.contains("참외");
		System.out.println(contain);
		
		// 모든 엘리맨트 비우기
		set.clear();
		
		// .isEmpty() - 비었는지 확인
		boolean empty = set.isEmpty();
		System.out.println(empty);
	}

}
