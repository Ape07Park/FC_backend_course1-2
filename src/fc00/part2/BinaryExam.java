package fc00.part2;

public class BinaryExam{
    public static void main(String args[]){
        int a = 123;
        // 2진수로 변환
        String bin = Integer.toBinaryString(a);
        System.out.println(bin);
        // 8진수로 변환
        String octal = Integer.toOctalString(a);
        System.out.println(octal);
        // 16진수로 변환
        String hexa = Integer.toHexString(a);
        System.out.println(hexa);
    }
}
