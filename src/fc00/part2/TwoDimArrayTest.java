package fc00.part2;

public class TwoDimArrayTest {
    public static void main(String [] args){
        int[][] a = new int[2][4];
        for(int i =0; i < a.length;i++){
            for(int j = 0; j < a[i].length;j++){
                a[i][j] = 10;
                System.out.println(a[i][j]);
            }
        }

    }
}
