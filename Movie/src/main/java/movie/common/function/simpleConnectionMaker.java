package movie.common.function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class simpleConnectionMaker {
	public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb?serverTimezone=UTC&verifyServerCertificate=false&useSSL=false", "root", "asdf1234");	
		return c;
	}
}
