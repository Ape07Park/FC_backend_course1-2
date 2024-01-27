package fc00.course2.part1;

import com.google.gson.Gson;

import fc00.model2.Person;


public class GsonFromAPI {
    public static void main(String[] args){
        String json = "{\"name\":\"John\",\"age\":25}"; // JSON -> Person, 시작과 끝의 쌍따옴표 살리기 위해 역슬래쉬와 따옴표 추가
        Gson gson = new Gson();
        Person per = gson.fromJson(json,Person.class);
        System.out.println(per.getName()); // John
        System.out.println(per.getAge()); // 25
        System.out.println(per.toString());

    }
}
