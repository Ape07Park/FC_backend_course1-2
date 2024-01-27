package fc00.model;

// 조건 3

public class Car {
    private String company;
    private String color;
    private String name;
    private int price;

    public Car() {}

    // 생성자
    public Car(String company, String color, String name, int price){
        this.company = company;
        this.color = color;
        this.name = name;
        this.price = price;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(int price){
        this.price = price;
    }

    public String getCompany(){
        return company;
    }
    public String getColor(){
        return company;
    }
    public String getName(){
        return company;
    }
    public int getPrice(){
        return price;
    }
    
    // 재정의(오버라이딩): 부모로 부터 상속받은 메쏘드를 재정의하여 사용
    // 중복정의(오버로딩): 메쏘드 중복 정의
    public String toString() {
       return company + "\t" + color + "\t" + name + "\t" + price;
    }

    public void printCarInfo()
    {

        System.out.println("회사명:" + company);
        System.out.println("회사명:" + company);
        System.out.println("회사명:" + company);
        System.out.println("회사명:" + company);
    }
}
