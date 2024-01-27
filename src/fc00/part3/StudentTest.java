package fc00.part3;
import fc00.model.*;

public class StudentTest {
    public static void main(String[] args){
        int [] arr = new int[6];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 67;
        arr[3] = 98;
        arr[4] = 55;
        arr[5] = 32;
        for(int i=0; i < arr.length; i+= 1){
            System.out.println(arr[i]);
        }

        StudentVO std = new StudentVO("박성민", "데이터 과학", 25, "ape", 24, "010-1111-2222");
        System.out.println(std.toString());
        System.out.println(std); // toString() 생략됨
    }
}
