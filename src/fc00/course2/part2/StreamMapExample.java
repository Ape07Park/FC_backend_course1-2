package fc00.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		List<Integer> squaredNum = nums.stream()
				.map(x -> x * x)
				// .collect(봐꿀 형식): 어떤 형식에 맞춰 스트림을 합칠 것인지
				.collect(Collectors.toList()); // 스트림을 합치고 리스트로 변환 
		
		System.out.println(squaredNum);
		
	}

}
