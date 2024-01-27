package fc00.part2;

import java.util.*;

public class ScannerTest1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        Book a = new Book();

        System.out.print("책 이름");
        a.title = scan.next();
        System.out.println(a.title);

        System.out.print("책 가격");
        a.price = scan.nextInt();
        System.out.println(a.price);

        System.out.print("책 회사");
        a.company = scan.next();
        System.out.println(a.company);

        scan.nextLine(); // 버퍼 비우기

        System.out.print("책 저자");
        a.author = scan.nextLine();
        System.out.println(a.author);

        System.out.print("책 페이지 수");
        a.page = scan.nextInt(); //700_
        System.out.println(a.page);

        scan.nextLine(); // 버퍼 비우기

        System.out.print("책 isbn");
        a.isbn = scan.nextLine();
        System.out.println(a.isbn);

        scan.close();
    }
}
