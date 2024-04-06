package fc00.course2.part2;

import fc00.model2.Person;
import fc00.model2.PersonFactory;

public class PersonFactoryTest {

	/*
	 * 생성자 참조
	 */
	public static void main(String[] args) {
		PersonFactory personFactory = Person:: new; // Person의 new 참조
		// Person의 new 참조를 통해 create라는 추상 메소드 구현
		Person person = personFactory.create("james", 20);
		System.out.println(person);
	}

}
