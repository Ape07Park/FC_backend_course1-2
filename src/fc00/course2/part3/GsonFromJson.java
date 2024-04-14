package fc00.course2.part3;

import com.google.gson.Gson;

import fc00.model3.Member;

public class GsonFromJson {

	public static void main(String[] args) {
		String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"hong@example.com\"}"; // 문자열이 아님을 알리기 위해 \" 사용
		Gson gson = new Gson();
		
		Member member = gson.fromJson(json, Member.class); // json -> java
		System.out.println("json -> java");
		System.out.println(member);
	}

}
