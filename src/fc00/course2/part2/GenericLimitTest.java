package fc00.course2.part2;

import fc00.model2.AverageColculator;

public class GenericLimitTest {

	public static void main(String[] args) {
		Integer[] integers = {1,2,3,4,5};
		Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		AverageColculator<Integer> intAverageColculator = new AverageColculator<Integer>(integers);
		double integerAvg = intAverageColculator.calculateAvg();
		System.out.println(integerAvg);
		
		AverageColculator<Double> doubleAverageColculator = new AverageColculator<>(doubles);
		double doubleAvg = doubleAverageColculator.calculateAvg();
		System.out.println(doubleAvg); 
	}

}
