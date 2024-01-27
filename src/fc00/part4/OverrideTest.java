package fc00.part4;
import fc00.model.*;

public class OverrideTest {
    public static void main(String[] args) {
         Animal a = new Dog(); // Upcasting = 부모가 자식을 가리킴, Dog.java(x), Dog.class(o)/ Animal과 상속관계
         a.eat(); // Animal --(동적바인딩) -> Dog

         a = new Cat(); // Dog와 같이 Animal이 부모라 같은 자료형 사용
         a.eat(); // Animal --(동적바인딩) -> Cat
    }
}
