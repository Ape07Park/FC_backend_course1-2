package fc00.model;

public class MemberDTO {
    public String name;
    public String phone_number;
    private int age; // 정보 은닉, 값을 넣고자 한다면 메서드를 만들어 메서드를 통해 값을 넣도록 한다
    public static void eat(){ // 상호작용 위해 public으로 하는게 일반적
        System.out.println("먹는다");
    }
}
