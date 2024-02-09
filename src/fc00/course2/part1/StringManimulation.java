package fc00.course2.part1;

public class StringManimulation {

	public static void main(String[] args) {
		String str = new String("HelloWorld");
		char firstChar = str.charAt(0); // 0번째 인덱스의 값 추출
		String replacedString = str.replace("o", "X"); // 모든 o -> X
		int index = str.indexOf("W"); // W의 인덱스 추출, 못 찾을 시 -1 리턴
		String subStr = str.substring(5, 8); // 5번 인덱스부터 8 - 1번째까지의 값 추출

		System.out.println(firstChar); // H
		System.out.println(replacedString); // HellXWXrld
		System.out.println(index); // 5
		System.out.println(subStr); // Wor

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
