package fc00.course2.part1;

public class StringCompare {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		
		if(str1.equals(str2) == true) {
			System.out.println("동일");
		}else {
			System.out.println("동일 X");
		}
		
		if(str1.compareTo(str2) < 0) {
			System.out.println("str1이 str2보다 앞");
		}else if(str1.compareTo(str2) == 0) {
			System.out.println("str1과 str2가 동일");
		}else {
			System.out.println("str1이 str2보다 뒤");
		}
	}

}
