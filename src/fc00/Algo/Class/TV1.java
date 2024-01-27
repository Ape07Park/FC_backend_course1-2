package fc00.Algo.Class;
import java.util.*;

// 리모컨에 반응해 채널 업,다운(1 ~ 99까지). 99면 1로 && 99보다 크면 1. 인터넷 접속 기능
public class TV1 implements RemoCon1{
    public static final int MAXCH = 99;
    public static final int MINCH = 1;

    Scanner a = new Scanner(System.in);
    int ch = a.nextInt();

    @Override
    public void chUp(){
        if(ch > MAXCH){
            ch = 1;
        }else{
            ch +=1;
        }
        System.out.println("채널 업");
        System.out.println(ch);
    }

    int ch1 = a.nextInt();

    @Override
    public void chDown(){
        if(ch1 < MINCH){
            ch1 = 99;
        }else{
            ch1-=1;
        }
        System.out.println("채널 다운");
        System.out.println(ch1);
    }
    @Override
    public void internet(){
        System.out.println("인터넷 접속");
    }
}
