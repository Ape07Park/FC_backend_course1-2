package fc00.part3;
import fc00.model.*;
import java.util.*;


public class CarUtilityTest {
    public static void main(String[] args){
        CarUtility spark = new CarUtility();
        Scanner info = new Scanner(System.in);

        System.out.print("이름 입력:");
        spark.carName = info.nextLine();
        System.out.print("주인 입력:");
        spark.carOwner = info.nextLine();
        System.out.print("타입 입력:");
        spark.carType = info.nextLine();
        System.out.print("연식 입력:");
        spark.carYear = info.nextInt();
        System.out.print("고유번호 입력:");
        spark.carSn = info.nextInt();
        System.out.print("가격 입력:");
        spark.carPrice = info.nextInt();

        spark.carInform(spark);
    }
}
