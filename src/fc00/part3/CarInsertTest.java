package fc00.part3;

import fc00.model.CarDAO;
import fc00.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
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

        CarDAO dao = new CarDAO();
        dao.carInsert(sonata);
        dao.carSelect(sonata);
    }
}
