package fc00.model2;

// interface는 자바의 java.sql에서 제공
public interface Connection {
	
	// DB 연결동작- 이것의 구현체는 DB회사들에서 만들어서 제공
	public void getConnection(String url, String username, String password);
	
}
