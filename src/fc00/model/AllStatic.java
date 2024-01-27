package fc00.model;

public class AllStatic {
    private AllStatic(){

    }

    public static int hap(int x, int y){
        int sum = x + y;
        return sum;
    }
    public static int max(int x, int y){
        return x > y ? x:y;
    }

    public static int min(int x, int y){
        return x > y ? y:x;
    }
}
