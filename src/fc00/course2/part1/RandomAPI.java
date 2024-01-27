package fc00.course2.part1;
import java.util.*;

public class RandomAPI {
    public static void main(String[] args){
        Random rand = new Random();
        int [] arr = new int[6];
        int i = 0; // 저장위치

        while(i < 6){
            int num = rand.nextInt(45) + 1; // Random의 nextInt(x) 메서드 : 0부터 괄호 안의 숫자 x 전까지 랜덤으로 1개 뽑음
            boolean isDuplicate = false;

            // 배열의 이전 인덱스와의 중복 여부 확인
            for(int j = 0; i > j; j++){
                if(num == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            // 중복 X면 배열에 num 집어넣음
            if(!isDuplicate){
                arr[i++] = num;
            }
        }
        Arrays.sort(arr); // 오름차순 정렬 메서드: Arrays.sort(배열 자료형인 변수)
        for(int num:arr){
            System.out.println(num + "");
        }
    }
}
