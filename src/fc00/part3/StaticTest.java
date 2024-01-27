package fc00.part3;

public class StaticTest {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int sum = hap(a,b);
        System.out.println(sum);
    }
    public static int hap(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
