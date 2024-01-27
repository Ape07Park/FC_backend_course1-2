package fc00.part2;

public class MethodTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(add(a,b));
    }
    // static(객체화된 것)은 static끼리만 참조 및 호출 가능
    public static int add(int x, int y){
        int sum = x +y;
        return sum;
    }
}

