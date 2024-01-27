package fc00.part2;

public class CharExam {
    public static void main(String[] args){
        int a = '1'+'2'+'3'+'4'+'5' - '0' * 5;
        System.out.println(a);
        // 아스키 코드상에서 문자열 0은 48을 의미하며 숫자가 1씩 커질때 마다 문자열도 1씩 커진다 즉 공차가 +1이다
        // 따라서 15를 만들기 위해선 '0'을 5번 빼야 정수상으로 15가 나온다. '1' - '0' = int 1
    }
}
