package fc00.part2;

import java.util.*;
public class SwitchCaseTest {
    public static void main(String [] args){
        System.out.println("요일 입력:");
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        switch(b){
            case "Sunday":
                System.out.println("baseball");
                break;
            case "Monday":
                System.out.println("basketball");
                break;
            case "Tuesday":
                System.out.println("swimming");
                break;

            case "Wednesday":
                System.out.println("swimming");
            default:
                System.out.println("sleep");
        }
    }
}
