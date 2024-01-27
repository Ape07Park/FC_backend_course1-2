package fc00.part2;

// 오버로딩(Overloading)
public class OverloadingTest {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println(add(a,b));

        float c = 11.5f;
        float d = 13.5f;
        System.out.println(add(c,d));
    }

    // 정수 더하기 함수
    public static int add(int x, int y){
        int z = x + y;
        return z;
    }

    // 실수 더하기 함수
    public static float add(float x, float y){
        float z = x + y;
        return z;
    }
}
