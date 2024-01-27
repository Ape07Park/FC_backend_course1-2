package fc00.part4;
import fc00.model.*;

public class DogCatUpcastingTest {
    public static void main(String[] args){
        // 업 캐스팅(upcasting) = 부모가 자식을 가리킴
        Animal x = new Dog();
        Animal y = new Cat();
        x.eat();
        y.eat();
    }
}
