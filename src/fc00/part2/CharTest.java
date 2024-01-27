package fc00.part2;

public class CharTest {
    public static void main(String[] args){
        int a = 'A';
        System.out.println(a);
        System.out.println(a + 1);
        int b = 'A' + 1;
        System.out.println((char)b); // (자료형)변수하면 형 변환

        // 실습
        int c = '가';
        System.out.println(c);
        int d = '\uAC00';
        System.out.println(d);

        int e = 'A' + 32;
        System.out.println((char)e);

        // 아스키 + 형변환
        char upper = 'A';
        char lower = (char)(upper + 32);
        System.out.println(lower);

        char upper1 = 'a';
        char lower1 = (char)(upper1 - 32);
        System.out.println(lower1);

        // 아스키 + 형변환
        char f = '1';
        char g = '2';
        char h = '0';
        int sum = f + g - h;
        System.out.println("sum = " + (char)sum);
    }
}
