package fc00.course2.part1;

import java.util.List;

public class StringSplit {

	public static void main(String[] args) {
		String str = "Hello,World,Java";
		str.split(","); // , 를 기준으로 분리
		System.out.println(str); 
	
		String str2 = "Hello World Java";
		str2.split(" "); // 공백을 기준으로 분리
		System.out.println(str2); 
		
		String str3 = "Hello Wrold SQL";
		str3.split("\\s+"); // 정규식: \s+(1개 이상의 공백)
		System.out.println(str3);
		
		String str4 = "Hello World Spring";
		String[] str4Arr = str4.split(" ");
		for(String s : str4Arr ) {
			System.out.println(s);
		}
		
	}
}
