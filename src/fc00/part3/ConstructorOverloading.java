package fc00.part3;
import fc00.model.*;

public class ConstructorOverloading {
    public static void main(String[] args){
        PersonVO a = new PersonVO();
        PersonVO hong = new PersonVO("홍길동", 23, "010-2333-2222");
        PersonVO h = new PersonVO("홍길", 22, "010-2333-3333");

        System.out.println(a.getName()+"\t"+ a.getAge()+"\t"+ a.getPhone());
        System.out.println(hong.getName()+"\t"+ hong.getAge()+"\t"+ hong.getPhone());
        System.out.println(h.getName()+"\t"+ h.getAge()+"\t"+ h.getPhone());
    }
}
