package fc00.model2;
// OracleDriver는 Oracle회사에서 만들어서 제공함
public class OracleDriver implements Connection {

	// 구현- 이건 Oracle에서 알아서 구현할 것임
	@Override
	public void getConnection(String url, String username, String password) {
		
		System.out.println("url, username, password 정보를 이용해 DB에 접속");
		
	}
	
}
