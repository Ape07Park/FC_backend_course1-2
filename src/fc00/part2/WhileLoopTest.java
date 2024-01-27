package fc00.part2;

public class WhileLoopTest {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        while(i < 10){
            System.out.println(numbers[i]);
            i += 1;
        }

        int j = 0;
        do{
            System.out.println(numbers[j]);
            j +=1;
        }while(j < numbers.length);
    }
}
