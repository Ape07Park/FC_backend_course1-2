package fc00.course2.part2;

import fc00.model2.Converter;
import fc00.model2.StringUtils;

public class StringUtilsTest {
	/*
	 * 인스턴스 메소드 참조
	 */
	public static void main(String[] args) {
		StringUtils stringUtils = new StringUtils(); // 참조할 메서드의 객체 생성
		Converter<String, String> converter = stringUtils::reverse; // 참조할 메서드를 통해 converter의 추상 메서드 구현
		System.out.println(converter.convert("hello")); // olleh
		
	}

}
