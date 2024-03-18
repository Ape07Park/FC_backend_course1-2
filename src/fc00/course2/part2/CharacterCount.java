package fc00.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		// 주어진 문자열에서 문자 하나씩 몇 번 나오는지 출력하세요
		String str = "Hello, World!";
		// hash map 만들기(key(문자), value(나온횟수). 반복. 나온 거 카운트 추가하기.
		Map<Character, Integer> charCountmap = new HashMap<Character, Integer>();
		// String -> char []
		char [] strArray = str.toCharArray(); 
		
		for(char c : strArray) {
			if(charCountmap.containsKey(c)) { // characterCountmap에 키로 c가 있다면
				charCountmap.put(c, charCountmap.get(c) + 1); // CharacterCountmap의 키 c에 해당하는 value에다가 + 1하기
			}else {
				charCountmap.put(c, 1); // 그렇지 않으면 characterCountmap에 key c, value에 1로 해서 추가 
			}
		}
		System.out.println("CharacterCount");
		for(char c: charCountmap.keySet()) { // key를 set 타입으로 바꾼 걸(중복 x) c에 반복해서 넣음 
			System.out.println(c + ":" + charCountmap.get(c));
		}
	}
}
