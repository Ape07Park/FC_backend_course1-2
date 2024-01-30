package fc00.model2;

import java.util.Arrays;

public class BookArray {
	private int size = 0; // 원소의 개수
	private MyBook [] elements; // MyBook [] 대신 Object 넣으면 다른 자료형도 넣을 수 있으니 범용성 상승
	public static final int DEFAULT_CAPACITY = 5; // 초기 용량
	
	public BookArray() {
		// elements 필드를 이미 만들었는데 또 만들려고 함 
		elements = new MyBook [DEFAULT_CAPACITY];
	}

	public MyBook get(int index) {
		// 인덱스 넣으면 해당 원소 가져오기
		if(index >= size || index < 0 ) {
			throw new IndexOutOfBoundsException("인덱스 범위 초과"); // 던지겠다 에러를 JVM에 
		}
		return elements[index];
	}
	
	public int size() {
		return size;
	}
	
	public void add(MyBook element) {
		// 내용을 더해라 
		if (size == DEFAULT_CAPACITY) {
			ensureCapacity();
		}
		elements[size++] = element;
	}
	
	public void ensureCapacity() {
		int newCacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCacity);
	}
}
