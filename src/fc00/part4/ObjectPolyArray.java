package fc00.part4;
import fc00.Poly.*;

public class ObjectPolyArray {
    public static void main(String[] args) {
        // 배열 생성 및 upcasting
        Object[] o = new Object [2];
        o[0] = new A1();
        o[1] = new B1();

        // Object[] o = {a,b};

       //  Downcasting
        ((A1)o[0]).printGo();
        ((B1)o[1]).printGo();

        for(int i = 0; i < o.length; i++){
            if(i == 0){
                ((A1)o[0]).printGo();
            }
            if(i == 1){
                ((B1)o[1]).printGo();
            }
        }
        display1(o);
    }
    public static void display1(Object [] a){
        if(a[0] instanceof Object) {
            ((A1) a[0]).printGo();
        }
        if(a[1] instanceof Object){
            ((B1) a[1]).printGo();
        }

    }
}
