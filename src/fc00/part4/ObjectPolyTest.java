package fc00.part4;
import fc00.Poly.*;
public class ObjectPolyTest {
    public static void main(String[] args){
        A1 a = new A1();
        display(a);
        B1 b = new B1();
        display(b);
    }
    public static void display(Object obj){ // 다형성 인수, 인자 Object 타입으로 받기, upcasting되면 downcasting해야함
        // 타입마다 같은 메소드 반복을 피하기 위해 공통으로 받을 수 있는 인자인 Object 타입 이용
        if(obj instanceof A1){ // downcasting 전에 obj가 A1에 상속을 받는지, 어떤 클래스인지 확인
            ((A1)obj).printGo(); // downcasting
        }
        if(obj instanceof B1){
            ((B1)obj).printGo();
        }
    }

}
