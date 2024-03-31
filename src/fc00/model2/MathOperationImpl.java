package fc00.model2;
// 인터페이스 구현체를 외부에 만들어놓은 형태
public class MathOperationImpl implements MathOperation {
	
	@Override
	public int operation(int x, int y) {
		return x + y;
	}

}
