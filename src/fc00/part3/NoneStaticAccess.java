package fc00.part3;
import fc00.model.*;
public class NoneStaticAccess {
    public static void main(String[] args){
        int a = 10;
        int b = 40;
        MyUtil2 c = new MyUtil2();
        int sum = c.hap(a,b);
        System.out.println(sum);
    }
}
