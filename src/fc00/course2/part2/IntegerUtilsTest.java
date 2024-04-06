package fc00.course2.part2;

import fc00.model2.Converter;
import fc00.model2.IntegerUtils;

public class IntegerUtilsTest {
	
	/*
	 * 정적 메소드 참조 
	 */
	public static void main(String[] args) {
// converter interface의 메서드 구현을 IntegerUtils에 있는 메서드를 참조하는 것으로 대신함		
		Converter<String, Integer> converter = IntegerUtils::stringToInt; 
		int convertedString = converter.convert("10000");
		System.out.println(convertedString);
	}

}
