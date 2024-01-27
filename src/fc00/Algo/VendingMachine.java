package fc00.Algo;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("음료 자판기");
        System.out.println("원하는 음료수 선택\n1. 환타 오렌지 1000\n2. 환타 포도 2000\n3.환타 파인에플 3000\n4.환타 딸기 4000\n5.환타 시나몬 5000");
        System.out.println("음료 선택");

        int menu = a.nextInt();
        int money = a.nextInt();

        switch(menu){
            case 1:
                System.out.println("오랜지");
                System.out.println(money - 1000);
                break;
            case 2:
                System.out.println("포도");
                System.out.println(money - 2000);
                break;
            case 3:
                System.out.println("파인애플");
                System.out.println(money - 3000);
                break;
            case 4:
                System.out.println("딸기");
                System.out.println(money - 4000);
                break;
            case 5:
                System.out.println("씨나몬");
                System.out.println(money - 5000);
                break;
            default:
                System.out.println("NO");
        }
    }
}
