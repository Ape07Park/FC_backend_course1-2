package fc00.Poly;
// 추상 클래스: 추상 메서드를 지닌 클래스(불완전한 클래스)-단독으로 사용불가하므로 자식 클래스 필요-. 자식을 담기 위한 자료형(그릇,틀)으로서의 역할만 수행
// 다형성 유도위해 추상 클래스 이용
public abstract class Animal {
    // 추상 메서드: 구현부(바디)가 없는 불완전한 메서드. 메서드는 헤드(이름)와 바디(동작부분 = 구현부)필요. 메서드 없으면 호출불가
    public abstract void eat(); // 리모컨의 버튼 역할만 수행. 따라서 자식이 TV로서 override(재정의) 즉 메서드 구현 필요

    // 구현 메서드: 구현부(바디)가 있는 메서드, 필요하면 override(재정의) 가능
    public void move(){
        System.out.println("무리지어 다니다");
    }
}
