package fc00.course2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamApiTest {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		// Array -> Stream
		IntStream intStream = Arrays.stream(numbers);
		// Array -> Stream 후 짝수 필터링
		int sumOfEvens = Arrays.stream(numbers) 
				.filter(x -> x % 2 == 0)
				.sum();
		System.out.println(sumOfEvens);
	}
}
