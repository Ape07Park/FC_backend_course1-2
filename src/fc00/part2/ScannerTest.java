package fc00.part2;

import java.util.*;

// import java.util.*; 을 하면 밑에 java.util. 을 안써도 된다.
public class ScannerTest {
    public static void main(String [] args){
        java.util.Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요"); // 블럭 락(콘술 창에 숫자 입력)
        int num = scan.nextInt();
        System.out.println(num);

        System.out.print("실수를 입력하세여");
        float f = scan.nextFloat();
        System.out.println(f);

        System.out.print("문자열을 입력하시오");
        String s = scan.next(); // 공백 앞까지만 받음
        System.out.println(s);

        scan.nextLine(); //버퍼(임시저장 공간 ex 유튜브의 회색) 비우기
        System.out.print("문자열을 입력하시오");
        String s1 = scan.nextLine();
        System.out.println(s1);
    }
}
