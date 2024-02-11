package fc00.course2.part2;

import java.nio.channels.NonWritableChannelException;

public class WrapperTest {

	public static void main(String[] args) {
		Integer aa = new Integer(10); // boxing, 사용자 정의 자료형, wrapper class, boxing
		Integer bb = 11; // auto boxing(이걸 더 많이 사용), 사용자 정의 자료형, wrapper class
		
		System.out.println(aa.intValue()); // unboxing(Integer -> int)
		
		// .intValue(): int로 포장된 int 자료형을 꺼냄 
		
		Integer cc = 12; // auto boxing(int -> Integer)
		int i = cc; // auto unboxing(Integer -> int)
	}

}
