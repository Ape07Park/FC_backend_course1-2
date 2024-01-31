package fc00.course2.part1;

import java.util.ArrayList;

import fc00.model2.*;
public class ArrayListTest {
	
	public static void main(String[] args) {
		// book 3권을 저장하고 출력하시오
		ArrayList<MyBook> list = new ArrayList<MyBook>(); // 기본 크기는 10이지만 괄호안에 숫자넣으면 그 숫자만큼 크기 생성, * 배열은 크기 고정이나 list는 크기 부족 시 자동으로 크기 늘림
		list.add(new MyBook("자바", 10000, "한빛", "성민"));
		list.add(new MyBook("파이썬", 11000, "한빛", "준수"));
		list.add(new MyBook("자바스크립트", 12000, "한빛", "운성"));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // JVM이 object -> Book의 toString()으로 자동 변환해줌 
		}
		
		System.out.println();
		MyBook book1 = (MyBook)list.get(0); // (Book) Object -> Book
		System.out.println(book1);
		MyBook book2 = (MyBook)list.get(1); // (Book) Object -> Book
		System.out.println(book2);
		MyBook book3 = (MyBook)list.get(2); // (Book) Object -> Book
		System.out.println(book3);
		

	}

}
