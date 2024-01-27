package fc00.part2;

public class ArrayTest {
    public static void main(String[] args){
        float[] f = new float[5];
        for(int i =0;i < f.length;i++){
            f[i] = 10.5f;
            System.out.println(f[i]);
        }

        // 배열 초기화
        int[] a = {10,20,30,40,50};
        System.out.println(a.length);
        System.out.println(a[0] + a[3]);

        // 초기화 전의 배열 안의 값은 0
        int[] b;
        b = new int[3];
        System.out.println(b[0]);
    }
}
