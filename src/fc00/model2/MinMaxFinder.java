package fc00.model2;

public class  MinMaxFinder {
    private MinMaxFinder(){} // 디폴트 생성자 프라이빗으로해서 객체 생성 불가능
    public static int min(int arr[]){
        int min = arr[0]; // 초기값
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int arr[]){
        int max = arr[0]; // 초기값
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
