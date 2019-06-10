package movie.sample.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import movie.common.dao.RegistDAO;
@Service ("RegistService") 
public class RegistServiceImpl implements RegistService{
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="RegistDAO")
	private RegistDAO registDAO;
	@Override
	public void insertRegist(Map<String, Object> map) throws Exception {
		registDAO.insertRegist(map);
	}
	@Override
	public List<Map<String, Object>> registIdCheck(Map<String, Object> map) throws Exception {
		return registDAO.registIdCheck(map);
	}
	
}