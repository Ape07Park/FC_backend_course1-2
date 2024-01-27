package fc00.part2;

public class LoopLoopTest {
    public static void main(String[] args){
        for(int m =0; m < 5; m+= 1){
            for(int n = 0; n < 5; n +=1){
                System.out.println(m + ":" + n);
            }//_m
        }//_n

        int [][] a = {
                {0,1,2,3,4},
                {0,1,2,3,4}
        };

        for(int i = 0; i < 2; i +=1){
            for(int j =0; j < 5; j +=1){
                System.out.print(a[i][j]+"\t");
            }//_j
            System.out.println();
        }//_i

        for(int o = 1; o < 10; o +=1){
            System.out.print(o + "단"+ "\t");
        }
        System.out.println();
        for(int k = 1; k < 10; k +=1){
           for(int l = 1; l < 10; l += 1){
               System.out.print(k +"x"+l+"="+ k * l + "\t");
           }
           System.out.println();
       }
    }
}
