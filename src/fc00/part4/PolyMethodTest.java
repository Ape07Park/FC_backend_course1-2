package fc00.part4;
import fc00.model.*;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d); //같은 static에 있는 거 호출 객체를 생성해서 객체의 것을 호출하는 것이 아니라
        Cat c = new Cat();
        display(c);
    }

    // 다형성 인수
    private static void display(Animal ani){ // upcasting
        ani.eat();

        if(ani instanceof Cat){
            ((Cat)ani).night(); // upcasting 가능하므로 downcasting도 가능
        }
    }
}