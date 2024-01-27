package fc00.part3;
import fc00.model.*;

public class SetterGetterTest {
    public static void main(String[] args){
        PersonVO min = new PersonVO();

        min.setName("min");
        min.setAge(24);
        min.setPhone("010-2222-3333");

       String name =  min.getName();
        int age = min.getAge();
        String phone = min.getPhone();

        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
    }
}
