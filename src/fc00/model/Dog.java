package fc00.model;

public class Dog extends Animal {
    public Dog(){
        super(); // new Animal()
    }
    // override
    public void eat(){
        System.out.println("개처럼 먹다");
    }

}
