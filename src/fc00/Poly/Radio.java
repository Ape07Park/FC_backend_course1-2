package fc00.Poly;
import fc00.model.*;
public class Radio implements RemoCon {
    public void chUp(){
        System.out.println("라디오 채널 업");
    }
    public void chDown(){
        System.out.println("라디오 채널 다운");
    }
    public void volUp(){
        System.out.println("라디오 볼륨 업");
    }
    public void volDown(){
        System.out.println("라디오 볼륨 다운");
    }

    @Override
    public void internet() {
        System.out.println("인터넷 작동 X");
    }
}
