package movie.sample.service;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import movie.common.dao.LoginDAO;

@Service ("LoginService") 
public class LoginServiceImpl implements LoginService{
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="LoginDAO")
	private LoginDAO loginDAO;
	
	@Override
	public Map<String, Object> getLoginInfo(Map<String, Object> map) throws Exception{
		return loginDAO.loginInfo(map);
		
	}
}
