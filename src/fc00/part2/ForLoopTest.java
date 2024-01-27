package fc00.part2;

public class ForLoopTest {
    public static void main(String[] args){

        for(int i =0; i < 26 ; i+=1){
            System.out.println(65 + i +":"+ "\t"+ (char)(65 + i));
        }
        int[] numbers= {1,2,3,4,5,6,7,8,9,10};
        for(int a : numbers){
            System.out.println(a);
        }
    }
}
