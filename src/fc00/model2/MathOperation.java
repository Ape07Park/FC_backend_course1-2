package fc00.model2;
@FunctionalInterface // 함수형 인터페이스는 오직 1개의 추상 메서드만 가지고 있어야 한다
public interface MathOperation {
	public int operation(int x, int y); // 추상 메서드 
}
