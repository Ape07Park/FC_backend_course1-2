package fc00.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
	// HashSet을 이용하여 배열에서 중복되지 않은 숫자 구하기
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 2, 4, 6, 7, 1, 3};
		// 헤쉬 셋 만들기. 반복문 돌리기. 
		// 헤쉬 셋에 넣기. 헤쉬 셋에 있는 거 다 출력 
		Set<Integer> set = new HashSet<Integer>();
		for(int i:numbers) {
			if(set.contains(i) == true) {
				set.remove(i);
				continue;
			}
			set.add(i);
		}
		System.out.println(set);
	}

}
