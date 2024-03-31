package fc00.course2.part2;

import fc00.model2.MathOperation;
import fc00.model2.MathOperationImpl;

public class FunctionInterfaceTest {

	public static void main(String[] args) {
		MathOperation mo = new MathOperationImpl();
		int result = mo.operation(10, 20);
		System.out.println(result);
	}

}
