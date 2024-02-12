package fc00.course2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// 바나나, 애플, 체리를 리스트에 저장 및 출력.
		// 그 뒤 0번째 데이터 삭제, 1번째 데이터 "파인애플"로 변경
		List<String> list = new ArrayList<>();
		list.add("바나나");
		list.add("애플");
		list.add("체리");
		
		// 람다함수 이용해 출력
		list.forEach(x-> System.out.println(x));
		System.out.println();
		// 0번째 데이터 삭제
		list.remove(0);
		
		// 1번째 데이터 "파인애플"로 변경, 0이 삭제되어 인덱스가 한칸씩 당겨짐
		list.set(0, "파인애플");
		
		for(String str:list) {
			System.out.println(str);
		}
	}

}
