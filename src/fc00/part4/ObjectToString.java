package fc00.part4;

import fc00.Poly.Board;

public class ObjectToString {
    public static void main(String[] args){
        Board a = new Board();
        a.setTitle("게시판");

        System.out.println(a.getTitle());
        System.out.println(a.toString()); // override 전이면 Board 객체의 번지 출력
        System.out.println(a);
    }
}
