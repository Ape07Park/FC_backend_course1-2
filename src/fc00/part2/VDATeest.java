package fc00.part2;

public class VDATeest {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        int c = b * 10;
        System.out.println(c);

        int sum = 1; // sum 변수가 선언되었음에도 계속 변수 선언
        // main이라는 메서드 안에서 만들어졌으니 sum은 지역변수(local variable)
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        System.out.println(sum);

        int x = 10;
        int y = 20;
        int z = y; // tmp 임시기억공간

        System.out.println(y = x);
        System.out.println(y = z);
    }
}
