package fc00.part4;
import fc00.model.*;

public class ObjectCasting {
    public static void main(String[] args){
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat(); // 업캐스팅(upcasting)
        ani.eat();
        // 부모는 night 메서드 없어서 오버라이딩 안됨, 따라서 부모를 Cat으로 다운캐스팅(downcasting)해서 night 작동필요
        Cat c = (Cat)ani;
        c.night();
        // 한 줄로 표현
        ((Cat)ani).night();
    } // 부모가 자식에게 동일한 메시지를 보내고(메서드를 호출하고) 있다,다형성 (message polymorphism) = 1개의 메시지에 대해 각자 다르게 반응
}
