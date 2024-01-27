package fc00.Algo;
import java.util.*;

public class CheckYoun {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        if(num % 4 == 0 && num % 100 != 0 || num % 400 == 0){
            System.out.println("윤년");
        }else{
            System.out.println("not youn");
        }


    }
}
