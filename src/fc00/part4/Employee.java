package fc00.part4;

public class Employee extends Object { // new Object
    private String name;
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage){ // 여기서 자식 클래스의 요구사항 처리
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }
    public Employee(){
        super(); // 상위 클래스(Objects)의 생성자 호출 -> new Object()
    }
    public String toString(){
        return name + "\t" + phone + "\t" + empDate + "\t"+ dept + "\t" + marriage + "\t"+ age;
    }
}
