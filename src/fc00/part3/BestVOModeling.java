package fc00.part3;
import fc00.model.*;
public class BestVOModeling {
    public static void main(String[] args){
        MovieVO a = new MovieVO("아바타", "2022", "jake", "SF", 200, 12);

        System.out.println(a.toString());
        System.out.println(a.getName());
    }
}
