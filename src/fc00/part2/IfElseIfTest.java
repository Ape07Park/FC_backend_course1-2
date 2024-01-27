package fc00.part2;

import java.util.*;
public class IfElseIfTest {
    public static void main(String[] args){
        System.out.print("숫자 입력:");
        Scanner score_chacker = new Scanner(System.in);
        int score = score_chacker.nextInt();
        if(score > 0 && score < 101) {
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 85) {
                System.out.println("B");
            } else if (score >= 80) {
                System.out.println("C");
            } else{
                System.out.println("x");
            }
        }
        else{
            System.out.println("none");
        }
    }
}
