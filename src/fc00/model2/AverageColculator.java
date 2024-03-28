package fc00.model2;

public class AverageColculator <T extends Number> {
	private T[] numbers;

	public AverageColculator(T[] numbers) {
		this.numbers = numbers;
	}
	
	public double calculateAvg() {
		double sum = 0.0;
		for(T num:numbers) {
			sum += num.doubleValue();
		}
		return sum / numbers.length;
	}
	
	
}
