package fc00.course2.part1;

import fc00.model2.IntArray;

public class MyIntArrayTest {

	public static void main(String[] args) {
		IntArray list = new IntArray();
		
		for(int i = 0; i <= 5; i++) {
			list.add(i);
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		System.out.println(list.size());
		
		
	}

}
