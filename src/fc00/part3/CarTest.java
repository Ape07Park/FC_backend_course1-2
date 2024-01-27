package fc00.part3;
import java.util.*;
import fc00.model.*;
import fc00.model.CarDTO;

public class CarTest {
    public static void main(String[] args){
        Scanner car_info = new Scanner(System.in);
        CarDTO sonata = new CarDTO();

        System.out.print("이름 입력:");
        sonata.carName = car_info.nextLine();
        System.out.print("주인 입력:");
        sonata.carOwner = car_info.nextLine();
        System.out.print("타입 입력:");
        sonata.carType = car_info.nextLine();
        System.out.print("인식번호 입력:");
        sonata.carSn = car_info.nextInt();
        System.out.print("가격 입력:");
        sonata.carPrice = car_info.nextInt();
        System.out.print("연식 입력:");
        sonata.carYear = car_info.nextInt();

        carInfo(sonata); // call by reference, 하나의 구조로 된 인수

        // System.out.println(sonata.carName+"\t"+sonata.carOwner+"\t"+sonata.carType+"\t"+sonata.carSn+"\t"+sonata.carPrice+"\t"+sonata.carYear);
    }
    // 매개변수로 자동차의 정보를 받아 출력하는 메서드 정의하기
    public static void carInfo(CarDTO a){ // call by reference, 하나의 구조로 된 매개변수
        System.out.println(a.carName+"\t"+a.carOwner+"\t"+a.carType+"\t"+a.carSn+"\t"+a.carPrice+"\t"+a.carYear);
    }
}
