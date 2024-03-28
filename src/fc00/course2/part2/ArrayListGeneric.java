package fc00.course2.part2;

import java.util.ArrayList;
import java.util.List;

import fc00.model2.MovieDTO;

public class ArrayListGeneric {
	public static void main(String [] args) {
		List list = new ArrayList();
		// 제네릭 x라 여러 타입이 들어감 따라서 특정타입 보장 x
		list.add(0, new MovieDTO("괴물", "봉준호", 2006, "한국"));
		list.add("Hello");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));

	}
}
