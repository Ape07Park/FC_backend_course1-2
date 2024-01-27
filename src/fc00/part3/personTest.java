package fc00.part3; // 디렉터리가 다르면 항상 경로 표시 필요
public class personTest {
    public static void main(String[] args){
        /*fc.java.part3.*/ personDTO p = new personDTO(); // 인스턴스를 만드는 과정
        p.name = "Park";
        p.age = 25;
        p.phone = "010-9187-2645";

        System.out.println(p.name +"\t"+p.age +"\t"+p.phone);
        p.eat();
        p.walk();
        p.exercise();
    }
}
