package fc00.course2.part1;

import fc00.model2.Connection;
import fc00.model2.MySQLDriver;
import fc00.model2.OracleDriver;


public class DBConnection {

	public static void main(String[] args) {
		
		Connection conn = new MySQLDriver();
		conn.getConnection("jdbc:mysql://localhost:3306/world","xxxx", "xxxx");
		
		conn = new OracleDriver();
		conn.getConnection("url", "xxxx", "xxxx");
	}

}
