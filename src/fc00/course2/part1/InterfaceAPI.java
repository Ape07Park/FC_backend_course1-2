package fc00.course2.part1;
// 유저는 CC를 이용하여 BB를 동작시키는 프로그래밍(인터페이스 기반 프로그래밍)

import fc00.model2.BB;
import fc00.model2.CC;

public class InterfaceAPI {

	public static void main(String[] args) {
		CC c = new BB();
		c.x(); // BB의 x 메서드가 동작 
		c.y();
		c.z();

	}

}
