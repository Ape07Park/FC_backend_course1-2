package fc00.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NoneStaticTest st = new NoneStaticTest(); //객체 생성 및 Heap Area 로딩
        int sum = st.hap(a,b);
        System.out.println(sum);

    }
    public int hap(int a, int b){
        int v = a+b;
        return v;
    }
}
