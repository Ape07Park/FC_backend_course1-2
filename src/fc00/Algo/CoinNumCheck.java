package fc00.Algo;
import java.util.*;

public class CoinNumCheck {
    public static void main(String[] args) {
        int fiveh_num = 0, h_num = 0, fifty_num = 0, ten_num = 0, fiveh_remain = 0;

        Scanner a = new Scanner(System.in);
        System.out.print("금액 입력:");
        int money = a.nextInt();

        fiveh_remain = money % 500;
        fiveh_num = money / 500;
        h_num = fiveh_remain / 100;
        fifty_num = (fiveh_remain % 100) / 50;
        ten_num = (fiveh_remain % 100) % 50 / 10;

        System.out.println("동전 교환 프로그램 1.0");
        System.out.println("500원 개수:" + fiveh_num);
        System.out.println("100원 개수:"+h_num);
        System.out.println("50원 개수:"+fifty_num);
        System.out.println("10원 개수:" + ten_num);


    }
}
