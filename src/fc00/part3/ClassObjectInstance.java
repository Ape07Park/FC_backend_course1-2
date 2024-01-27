package fc00.part3;
import fc00.model.*;
public class ClassObjectInstance {
    public static void main(String[] args) {
        StudentVO st1; // st1 : Object
        StudentVO st2; // st2 : Object

        st1 = new StudentVO("성민","컴퓨터공학", 25, "ape", 2018, "010-2222-3333"); // st1 : instance
        System.out.println(st1.toString());


    }
}
