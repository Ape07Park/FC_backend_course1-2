package fc00.course2.part2;

public class IntegerStringCastTest {
	public static void main(String[] args) {
		String a = "123";
		String b = "123";
		
		// 문자열 정수를 int로 변환. 숫자 String -> int 
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		
		System.out.println((c + d));
		
		int num = 12;
		int num2 = 12;
		
		// int -> String 
		String str = String.valueOf(num);
		
		// 자동타입 변환(더 큰 저장공간 지닌 타입으로 변환)
		String str2 = "" + num + num2;
		
		System.out.println(str2);
	}
}
