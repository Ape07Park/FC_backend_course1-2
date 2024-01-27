package fc00.part2;

public class ApiOverloading {
    public static void main(String[] args){
        // 메소드 오버로딩, 같은 이름의 메소드지만 자료형은 다 다르다
        System.out.println(1);
        System.out.println(1.3f);
        System.out.println('a');

        int a = 1;
        int b = 2;
       int max = max_value(a,b);
       System.out.println(max);

        int c = 1;
        int d = 2;
       int min = min_value(c,d);
        System.out.println(min);
    }

    public static int max_value(int x, int y){
        if(x > y){
            return x;
        }
        else{
            return y;
        }
    }

    public static int min_value(int x, int y){
        return (x < y) ? x: y;
    }
}
