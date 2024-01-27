package fc00.part3;
import fc00.model.*;

public class StudentArrayTest {
    public static void main(String[] args) {
        StudentVO[] std = new StudentVO[4];
        std[0] = new StudentVO("박성민", "데이터 과학", 18, "ape", 24, "010-2222-3333");
        std[1] = new StudentVO("김성민", "컴퓨터 과학", 18, "ape", 24, "010-2222-1111");
        std[2] = new StudentVO("이성민", "AI 과학", 18, "ape", 24, "010-2222-4444");
        std[3] = new StudentVO("최성민", " 뇌 과학", 18, "ape", 24, "010-2222-5555");

        for (int i = 0; i < std.length; i += 1){
            System.out.println(std[i].toString());
        }

        System.out.println();
        
        for(StudentVO st:std){
            System.out.println(st); // toString() 생략
        }
    }
}
