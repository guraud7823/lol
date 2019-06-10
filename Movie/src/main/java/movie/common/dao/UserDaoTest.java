package movie.common.dao;

import java.sql.SQLException;

public class UserDaoTest {
	public void test()  throws ClassNotFoundException, SQLException{
		ConnectionMaker connectionMaker = new DConnectionMaker();
		UserDao dao = new UserDao(connectionMaker);
	}

}
