package fc00.model2;

import java.util.Arrays;

public class ObjectArray {
	// 생성 동작, 인덱스보고 값 가져오기, add
	private int index;
	private int size;
	private Object[] elements; // 범용성 높음, up casting 때문
	public static final int MAX_LENGTH = 5;
	private int leng;
	
	public ObjectArray() {
//		elements = new Object[MAX_LENGTH];
		this(5); // 자신이 속한 클래스의 다른 생성자 호출 즉 ObjectArray(int leng) 호출함 
	}
	
	public ObjectArray(int leng) {
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
