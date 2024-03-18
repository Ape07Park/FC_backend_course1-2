package fc00.course2.part2;

import fc00.model2.MovieDTO;
import fc00.model2.MyBook;
import fc00.model2.ObjectArr;

public class GenericTest {

	public static void main(String[] args) {
		/*
		 * ObjectArr<String> array = new ObjectArr<>(5); 
		 * array.set(0, "Hello");
		 * array.set(1, "World"); 
		 * array.set(2, "Java"); 
		 * array.set(3, "Generic");
		 * array.set(4, "Example");
		 * 
		 * System.out.println(array.size());
		 * 
		 * for (int i = 0; i < array.size(); i++) { 
		 *     System.out.println(array.get(i)); 
		 * }
		 */
		ObjectArr<MovieDTO> list = new ObjectArr<>(5);
		list.set(0, new MovieDTO("괴물", "봉준호", 2006, "한국"));
		list.set(1, new MovieDTO("기생충", "봉준호", 2019, "한국"));
		list.set(2, new MovieDTO("완벽한 타인", "이재규", 2018, "한국"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
