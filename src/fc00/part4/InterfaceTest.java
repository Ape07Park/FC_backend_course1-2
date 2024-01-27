package fc00.part4;


import fc00.Poly.*;
import fc00.model.*;

public class InterfaceTest {
    public static void main(String[] args){
        RemoCon tv = new TV();
        RemoCon radio = new Radio();

        // 인터페이스를 통해 다형성 100% 보장
        // 부모가 인터페이스면 자식의 내부 동작방식을 전혀 몰라도 자식을 동작 시킬 수 있음
        radio.chUp();
        radio.chDown();
        radio.volUp();
        radio.volDown();
        radio.internet();

        System.out.println();

        tv.chUp();
        tv.chDown();
        tv.volUp();
        tv.volDown();
        tv.internet();
    }
}
