package fc00.course2.part1;

import fc00.model2.BookArray;
import fc00.model2.MyBook;

public class MyBookArrayTest {

	public static void main(String[] args) {
		BookArray list = new BookArray();
		list.add(new MyBook("자바", 1000, "한빛", "성민1"));
		list.add(new MyBook("자바2", 2000, "한빛2", "성민2"));
		list.add(new MyBook("자바3", 3000, "한빛2", "성민3"));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 꺼내는 걸 get으로 안하다 틀림 
			
		}

	}

}
