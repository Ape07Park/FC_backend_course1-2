package fc00.course2.part1;
import com.google.gson.Gson;

import fc00.model2.Person;


public class GsonToAPI {
    public static void main(String[] args){
        Person per = new Person("John", 25);
        Gson gson = new Gson();
        String json = gson.toJson(per);
        System.out.println(json); // JSON {"name": "john:", "age": 25}

    }
}
