package fc00.model2;

import java.util.Arrays;

public class IntArray {
	// 배열처럼 동작하는 API 만들어 두면 굳이 배열 안써도 됨- List
	// 이러면 메서드의 기능과 거기 들어가는 파라미터만 알면 됨
	// 배열에 필요한 거 1) add 2) 범위 3) 인덱스 매기기 5) 해당 인덱스의 값 가져오기 6) 생성자
	private int size = 0; // 원소의 개수
	private int[] elements;
	public static final int DEFAULT_CAPACITY = 5; // 초기 용량

	// 생성
	public IntArray() {
		elements = new int[DEFAULT_CAPACITY];
	}

	// 원소 가져오기
	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("범위 초과"); // JVM에 IndexOutOfBoundsException 넘기고 범위 초과 에러 메시지 남김
		}

		// 인덱스를 받으면 그 인덱스에 대응하는 값 찾아서 추출
		return elements[index];
	}

	// 원소 개수 가져오기
	public int size() {
		return size;
	}

	// * 다시 볼 것
	public void add(int element) {
		if (size == DEFAULT_CAPACITY) {
			ensureCapacity();
		}
		elements[size++] = element;
		// 값 넣기
		// * 만약 값 넣을 공간 부족 시 새 공간 만들고 그곳으로 값 옮기기-배열은 확장이 아닌 새 공간 만듦
	}

	// * 다시 볼 것
	public void ensureCapacity() {
		int newCacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCacity);
	}

}
