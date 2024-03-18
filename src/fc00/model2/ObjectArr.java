package fc00.model2;

public class ObjectArr<T> { // T는 이 클래스를 호출하는 곳의 타입에 따라 달라짐
	private T[] array;
	private int size;
	
	public ObjectArr(int size) {
		array = (T[]) new Object[size];
	}
	
	public void set(int index, T value) {
		array[index] = value;
		size++;
		
	}
	
	public T get(int index) {
		return array[index];
	}
	
	public int size() {
		
		return size;
	}
}
