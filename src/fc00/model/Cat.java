package fc00.model;

public class Cat extends Animal {
    public Cat(){
        super();
    }
    // override
    public void eat() {
        System.out.println("고양이처럼 먹다");
    }
    public void night(){
        System.out.println("밤에 눈이 빛난다");
    }
}
