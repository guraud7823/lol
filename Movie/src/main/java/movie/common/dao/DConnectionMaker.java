package movie.common.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker{
	public Connection makeConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb?serverTimezone=UTC&verifyServerCertificate=false&useSSL=false", "root", "asdf1234");	
		return c;
	}
}
