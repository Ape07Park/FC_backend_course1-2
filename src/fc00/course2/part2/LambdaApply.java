package fc00.course2.part2;

import fc00.model2.StringOperation;

public class LambdaApply {

	public static void main(String[] args) {
		/*
		 * 람다식이 저장된 변수를 메소드의 매개변수로 사용 가능
		 */
		StringOperation toUpperCase = s -> s.toUpperCase();
		StringOperation toLowerCase = s -> s.toLowerCase();
		
		String input = "Lambda Expression";
		System.out.println(processString(input, toLowerCase)); // 소문자로 봐꿔서 출력
		System.out.println(processString(input, toUpperCase)); // 대문자로 바꿔서 출력
	}
	public static String processString(String input, StringOperation operation) {
		return operation.apply(input);
	}
}
