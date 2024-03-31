package fc00.course2.part2;

import fc00.model2.MathOperation;
 
public class FunctionInterfaceTest2 {

	public static void main(String[] args) {
		// MathOperation 인터페이스를 익명내부클래스로 구현 즉 외부에서 구현 x한 인터페이스
		MathOperation mo = new MathOperation() {

			@Override
			public int operation(int x, int y) {
				return x + y;
			}
			
		};
		int result = mo.operation(10, 20);
		System.out.println(result);
				

	}

}
