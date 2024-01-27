package fc00.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    // 기본 생성자(default constructor) / 없으면 객체 생성 X
    public PersonVO(){

    }
    // 생성자의 오버로딩
    public PersonVO(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
            this.age = age;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    // Getter
    public String getName(){
        return this.name; // this 생략 가능
    }
    public int getAge(){
        return this.age; // this 생략 가능
    }
    public String getPhone(){
        return this.phone; // this 생략 가능
    }

    // toString 메서드
    public String toString(){
        return this.name + "\t"+ this.age+"\t" + this.phone;

    }
}
