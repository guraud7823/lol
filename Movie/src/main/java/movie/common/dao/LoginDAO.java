package movie.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("LoginDAO")
public class LoginDAO extends AbstractDAO{

	@SuppressWarnings("unchecked")
	public Map<String, Object> loginInfo(Map<String, Object> map) throws Exception{
		return (Map<String, Object>) selectOne("login.loginInfo",map);
	}
}