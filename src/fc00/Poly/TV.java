package fc00.Poly;
import fc00.model.*;
import java.util.*;
public class TV implements RemoCon {
    Scanner a = new Scanner(System.in);
    private int currCh = a.nextInt();
    public void chUp() {
        if(TV.MAXCH > currCh){
            currCh += 1;
        }else{
            currCh =1;
        }
        System.out.println("TV 채널 업");
        System.out.println(currCh);
    }
    public void chDown(){
        System.out.println("TV 채널 다운");
    }
    public void volUp(){
        System.out.println("TV 볼륨 업");
    }
    public void volDown(){
        System.out.println("TV 볼륨 다운");
    }
    public void internet(){
        System.out.println("인터넷 작동");
    }

}
