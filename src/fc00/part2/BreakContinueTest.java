package fc00.part2;

public class BreakContinueTest {
    public static void main(String[] args){
        char[] c = {'s','h','u','t','d', 'o', 'w', 'n'};
        for(char i:c){
            if(i == 'o') break;
            System.out.print(i + "\t");

        }
        System.out.println();

        // 3의 배수 출력
        int count = 0;
        for(int j =1; j < 11; j+=1){
            if(j % 3 == 0) {
                count += 1;
                continue;
            }
            System.out.print(j + "\t");
        }
        System.out.println();
        System.out.println(count);
    }
}
