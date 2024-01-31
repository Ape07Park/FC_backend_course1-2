package fc00.model2;

import java.util.Arrays;

public class ObjectArray2 {
	// 생성 동작, 인덱스보고 값 가져오기, add
	private int index;
	private int size;
	private Object[] elements; // 범용성 높음, up casting 때문
	private int leng;
	
	public ObjectArray2() {
		elements = new Object[leng];
	}
	
	// 인덱스 값이 0보다 작은 것도 오는 것 고려
	public Object get(int index) {
		if(index < 0 || index >= size ) {
			throw new IndexOutOfBoundsException("인덱스 값이 큼");
		}
		return elements[index];
	}
	
	// 여기 다시 볼 것 
	public void add(Object obj) {
		if(size == elements.length ) {
			int newCapacity = elements.length * 2;
			elements = Arrays.copyOf(elements, newCapacity);
		}
		elements[size++] = obj;
	}
	
	public int size() {
		return size;
	}
	
	
	
	
	
}
