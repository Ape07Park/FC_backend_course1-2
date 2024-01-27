package fc00.course2.part1;



public class IntArrayBasic {

	public static void main(String[] args) {
		int[] array = new int[5];
		for(int i = 0; i < array.length; i++) {
			array[i] += i;
			System.out.println(array[i]);
		}
		System.out.println();
		
		for(int a: array) {
			System.out.println(a);
		}

	}

}
