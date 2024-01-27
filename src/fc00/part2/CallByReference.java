package fc00.part2;

public class CallByReference {
    public static void main(String[] args){
        // 실수 더하기 메소드(call by value)
        float a = 12.3f;
        float b = 12.7f;
        add(a,b);

        // 배열 더하기 메소드(call by reference)
        int [] c = {1,2,3,4,5};
        System.out.println(array_add(c));
        System.out.println(ArrayAdd(c));
    }
    // 실수 더하기 메소드(call by value)
    public static void add(float x, float y){
        float z = x + y;
        System.out.println(z);
    }

    // 배열 더하기 메소드 (call by reference)
    public static int array_add(int[] x){
        int y = 0;
        for(int i:x){
            y += i;
        }
        return y;
    }
    // 배열 더하기 메소드 (call by reference)
    public static int ArrayAdd(int[] z){
        int sum = 0;
        for(int j = 0; j < z.length; j +=1){
            sum += z[j];
        }
        return sum;
    }
}
