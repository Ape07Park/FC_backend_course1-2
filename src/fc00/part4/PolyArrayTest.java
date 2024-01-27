package fc00.part4;
import fc00.model.*;

public class PolyArrayTest {
    public static void main(String[] args){
        // 다형성 배열
        Animal [] a = {new Dog(), new Cat()};
        /*Animal [] a = new Animal[2];
        a[0] = new Dog();
        a[1] = new Cat();*/
        display(a);
    }
    private static void display(Animal[] a){
        for(int i = 0;i < a.length; i+=1){
            a[i].eat();
            if(a[i] instanceof Cat){
                ((Cat)a[i]).night();
            }
        }
    }
}
