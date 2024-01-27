package fc00.part3;
import fc00.model.*;
public class StaticAccess {
    public static void main(String[] args){
        int a = 10;
        int b = 30;
        int sum = MyUtil.hap(a,b); // 클래스 이름.호출 메서드
        System.out.println(sum);
    }
}
