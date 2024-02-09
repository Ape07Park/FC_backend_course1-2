package fc00.course2.part1;

public class HelloWorldString {

	public static void main(String[] args) {
		String str00 = new String("hello world");
		String str01 = new String("hello world"); // 같은 내용이지만 객체 생성을 통해 만들면 다른 주소값가짐
		
		String str02 = "hello world";
		String str03 = "hello world"; // 같은 내용이지만 문자열 상수 방식으로 만들면 Literal Pool의 재활용 특성으로 인해 같은 주소값 가짐

	}

}
