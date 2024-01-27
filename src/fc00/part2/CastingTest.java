package fc00.part2;

public class CastingTest {
    public static void main(String[] args){
        // 자동형변환(작은 걸 큰 것에 넣을때)
        int a = 5;
        double b = a;
        System.out.println(b);

        // 강제형변환(큰 걸 작은 것에 넣을때)
        double c = 14.45123;
        int d = (int)c;
        System.out.println(d);
    }
}
