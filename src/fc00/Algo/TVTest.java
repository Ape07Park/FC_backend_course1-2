package fc00.Algo;
import fc00.Algo.Class.RemoCon1;
import fc00.Algo.Class.TV1;

// 다중 상속(추상 클래스 + 인터페이스), 인터페이스끼리 상속, TV 채널 돌리기 구현
public class TVTest {
    public static void main(String[] args){
        RemoCon1 remo = new TV1();
        remo.chUp();
        remo.chDown();
        remo.internet();
    }
}
