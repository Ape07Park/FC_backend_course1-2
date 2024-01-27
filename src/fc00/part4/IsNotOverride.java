package fc00.part4;
import fc00.Poly.*;

public class IsNotOverride {
    public static void main(String[] args){
        Animal a = new Dog();
        Animal b = new Cat();
       // 다형성 보장 X: 재정의를 안해서 부모가 명령 내리면(메세지 보내면) 오작동함
        // 다형성 보장하려면 재정의를 무조건 하도록 만들기
        // 이를 위해 추상클래스, 인터페이스 등장
        a.eat();
        b.eat();
    }
}
