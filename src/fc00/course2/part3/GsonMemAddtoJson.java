package fc00.course2.part3;

import com.google.gson.Gson;

import fc00.model3.Address;
import fc00.model3.Person;

public class GsonMemAddtoJson {

	public static void main(String[] args) {
		Address address = new Address("서울", "대한민국");
		Person person = new Person("홍길동", 30, "hong@gmail.com", address);
		
		// Person -> json
		Gson gson = new Gson();
		String json = gson.toJson(person);
		System.out.println(json);
		
		// json -> Person
		Person alivedPerson = gson.fromJson(json, Person.class);
		System.out.println(alivedPerson);
		
	}

}
