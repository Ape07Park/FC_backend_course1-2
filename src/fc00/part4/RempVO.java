package fc00.part4;

public class RempVO extends Employee {
    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage){
        super(name, age, phone, empDate, dept, marriage); // 부모의 생성자를 호출하되 6개의 매개변수를 지닌 생성자 호출하여 부모가 처리할 수 있게 함
    }
}
