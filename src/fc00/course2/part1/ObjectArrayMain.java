package fc00.course2.part1;

import fc00.model2.*;

import fc00.model2.ObjectArray;
import fc00.model2.Person;
import fc00.part2.IfbasicTest;

public class ObjectArrayMain {
	public static void main(String[] args) {
		ObjectArray list = new ObjectArray();
		
		list.add(new A());
		list.add(new B());
		list.add(new C());
				
		// 값을 가져올 때는 다운 캐스팅 필요
		A a = (A) list.get(0);
		B b = (B) list.get(1);
		C c = (C) list.get(2);
		
		a.display();
		b.display();
		c.display();
		
		System.out.println();
		
		// 다시 보기
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof A) { // list의 i번째가 A의 인스턴스가 맞다면 
				((A) list.get(i)).display();
			}
			else if(list.get(i) instanceof B) {
				((B) list.get(i)).display();
			}else {
				((C) list.get(i)).display();
			}
		}
		
		System.out.println("done");
		
	}

}
