package fc00.part4;

import fc00.Poly.*;

public class AbstractClassTest {
    public static void main(String[] args){
        Animal a = new Dog();
        Animal b = new Cat();
        a.eat();
        a.move();
        b.eat();
        b.move();
        ((Cat)b).night();
    }
}
