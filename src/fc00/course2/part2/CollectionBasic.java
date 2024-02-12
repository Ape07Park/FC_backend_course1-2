package fc00.course2.part2;

import java.util.ArrayList;
import java.util.List;

public class CollectionBasic {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 5; i++) {
			// 반복 시 10 * i가 각 리스트에 저장 되도록
			list.add(i * 10); // new Integer(10)- auto boxing
		}
		// Integer -> int (auto unboxing)
		System.out.println(list);
	}

}
