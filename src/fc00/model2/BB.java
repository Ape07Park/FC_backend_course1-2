package fc00.model2;
// BB는 노출 x (BB.class)만 노출하고 .java는 노출 x 
public class BB implements CC {

	@Override
	public void x() {
		System.out.println("X 동작 실행");
		
	}

	@Override
	public void y() {
		System.out.println("Y 동작 실행");
		
	}

	@Override
	public void z() {
		System.out.println("Z 동작 실행");
		
	}

}
