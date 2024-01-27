package fc00.part3;
// 객체(object) = 상태정보(속성, 맴버변수) + 행위정보(동작, 맴버메서드)
public class personDTO {
    public String name;
    public int age;
    public String phone;

    /* 기본 생성자(생략됨): public personDTO(){
    코드들
    }*/

    public static void exercise(){
        System.out.println("운동하기");
    }

    public static void eat(){
        System.out.println("먹기");
    }

    public static void walk(){
        System.out.println("걷기");
    }
}
