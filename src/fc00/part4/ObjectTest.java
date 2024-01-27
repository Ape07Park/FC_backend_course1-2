package fc00.part4;

import fc00.Poly.A;

public class ObjectTest {
    public static void main(String[] args){
        A a = new A();
        Object oa = new A(); // upcasting

        a.display();
        // oa.display(); 부모가 display 버튼이 없는 상태 따라서 override 필요 or down casting 필요
        ((A)oa).display(); //down casting

    }
}
