package fc00.part3;
import fc00.model.*;

public class ConstructorInit {
    public static void main(String[] args){
         PersonVO a = new PersonVO();

        String name = a.getName();
        int age = a.getAge();
        String phone = a.getPhone();

        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
    }
}
