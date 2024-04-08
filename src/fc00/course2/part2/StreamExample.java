package fc00.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// 함수형 인터페이스 사용해 isEven 메서드 정의
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		// list -> stream으로 변환 
		Stream<Integer> intStream = list.stream();
		
		int num =  intStream.filter(isEven)
				// intStream.filter(StreamExample::isEven)
				.sorted() // 정렬
				.map(x -> x * x) // 스트림의 각 원소에 람다식 적용
				.reduce(0, Integer::sum); // 0 부터 원소를 더한 것의 합을 누적(Integer의 sum 함수 참조) 
		
		System.out.println(num);		
	}
}
