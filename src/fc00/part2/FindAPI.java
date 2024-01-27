package fc00.part2;

public class FindAPI{
    public static void main(String[] args){
        int a;
        // AAA b; //can not resolve symbol 'AAA'
        a = 10;
        System.out.println(a);
        String s = "APPLE"; // default: java.lang.String, String은 자주 써서 패키지 안써도 컴파일러가 인식 가능 = "APPLE";
        System.out.println(s);
        System.out.println(s.length());
    }
}