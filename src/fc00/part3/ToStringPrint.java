package fc00.part3;
import fc00.model.*;

public class ToStringPrint {
    public static void main(String[] args){
        PersonVO w = new PersonVO("ho", 12, "010-2222-5555");

        System.out.println(w.toString());
        System.out.println(w); // 컴파일러가 객체의 데이터(속성) 전체를 출력하라는 뜻으로 이해하고 toString()을 찾아 적용시킴 따라서 toString() 생략 가능
    }
}
