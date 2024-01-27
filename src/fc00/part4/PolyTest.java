package fc00.part4;
import fc00.model.*;
public class PolyTest {
    public static void main(String[] args) {
        // upcasting으로 객체 생성
        Animal ani = new Dog();

        // 상속관계, override, 동적바인딩
        // (다형성)message polymorphism: 상위 클래스가 같은 메시지로 하위 클래스를 서로 다르게 동작
        //
        ani.eat(); // 같은 부모 메서드 다른 반응, 동적 바인딩: 실행 시점에서 사용될(호출될) 메서드 결정됨

        ani = new Cat();
        ani.eat(); // 같은 부모 메서드 다른 반응

        //down casting
        ((Cat)ani).night();
    }
}
