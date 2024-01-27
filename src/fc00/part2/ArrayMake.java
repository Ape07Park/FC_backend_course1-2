package fc00.part2;

public class ArrayMake {
    public static void main(String[] args){
        int[] a = new int[5];

        //반복문 활용
        for(int i = 0; i < a.length; i++){
            a[i] = 10;
            System.out.println(a[i]);
        }
    }
}
