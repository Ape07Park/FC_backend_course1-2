package fc00.part2;

public class MemberTest {
    public static void main(String [] args){
        Member a = new Member();
        a.name = "홍길동";
        a.age = 30;
        a.phone_number = "010-1111-1111";
        a.email = "ape0723";
        a.from = "korea";
        a.weight = 57.6f;
        System.out.println(a.name+"\t"+a.age);
    }
}
