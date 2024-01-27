package fc00.part2;

import java.util.*;
public class IfbasicTest {
    public static void main(String [] args){
        Scanner a = new Scanner(System.in); // System.in: 입력 스트림/스캐너에 꽂기
       System.out.print("정수를 입력하시오:");
       int num = a.nextInt();
       if(num % 7 == 0){
           System.out.println("7의 배수");
       }
       System.out.println("종료");

        System.out.print("Enter your age:");
        Scanner b = new Scanner(System.in);
        int age = b.nextInt();
        if(age >= 20){
            System.out.println("adult");
        }
        System.out.println("종료");
    }
}
