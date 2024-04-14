package fc00.course2.part3;

import com.google.gson.Gson; 

import fc00.model3.Member;

public class GsonToJson {
	public static void main(String[] args) {
		Member member = new Member("홍길동", 20, "hong@gmail.com");
	    
		Gson gson = new Gson();
		String json = gson.toJson(member); // java -> json
		
		System.out.println("java -> json");
	
	}
}
