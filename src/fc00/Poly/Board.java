package fc00.Poly;

public class Board extends Object{// Object는 toString() 가지고 있음. 이것은 객체의 번지를 문자열로 출력
    private String title;

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
       // super.toString(); // 부모 클래스의 메서드 호출
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
