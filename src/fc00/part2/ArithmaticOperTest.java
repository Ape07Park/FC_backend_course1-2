package fc00.part2;

public class ArithmaticOperTest {
    public static void main(String [] args){
        int a = 3625;
        System.out.println(a / 1000);
        System.out.println((a / 100) % 10 );
        System.out.println((a % 100) / 10);
        System.out.println(a % 10);

        int b = 365;
        if(b % 2 == 0) {
            System.out.println("짝수");
        }else{
                System.out.println("홀수입니다");
            }
    }
}

