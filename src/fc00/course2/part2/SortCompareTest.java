package fc00.course2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "James");
		// 자바 내장 객체인 String의 compareTo를 참조
		Collections.sort(names, String::compareTo); // names를 어떤 기준으로 비교할 것인지
		System.out.println(names);
	}

}
