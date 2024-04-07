package fc00.course2.part2;

import fc00.model2.MathOperation;

public class LambdaExample {

	public static void main(String[] args) {
		// MathOperation의 add 메서드를 람다식으로 구현
//		MathOperation add = (int x, int y ) ->  {return x + y; };
		MathOperation add = ( x,  y ) ->  x + y;
		MathOperation multi = ( x,  y ) ->  x * y;
		
		// 메서드 사용
		int result = add.operation(10, 20);
		System.out.println(result);
		int multiResult = multi.operation(10, 20);
		System.out.println(multiResult);
	}

}
