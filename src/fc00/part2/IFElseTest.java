package fc00.part2;

import java.util.*;
public class IFElseTest {
    public static void main(String[] args){
        int x = 10;
        if(x >= 10){
            System.out.println("x는 10보다 크거나 같다");
        }else{
            System.out.println("x는 10보다 작다");
        }
        System.out.println("종료");

        // 홀짝 확인 프로그램
        System.out.print("enter number:");
        Scanner odd_and_even = new Scanner(System.in);
        int num = odd_and_even.nextInt();
        if (num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("end");

        // 12의 배수 확인 프로그램
        System.out.print("enter number:");
        Scanner chack_12_drainage = new Scanner(System.in);
        int num2 = chack_12_drainage.nextInt();
        if (num2 % 12 == 0){
            System.out.println("12 drainage");
        }else{
            System.out.println("Not 12 drainage");
        }
        System.out.println("end");

        // 윤년 확인 프로그램
       System.out.print("enter year:");
       Scanner chack_year = new Scanner(System.in);
       int year = chack_year.nextInt();
       if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
           System.out.println("윤년");
       }else{
           System.out.println("not");
       }
        System.out.println("end");
    }
}
