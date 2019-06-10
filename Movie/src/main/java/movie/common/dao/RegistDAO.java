package movie.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("RegistDAO")
public class RegistDAO extends AbstractDAO{

	public void insertRegist(Map<String, Object> map) throws Exception{
		insert("regist.insertinfo",map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> registIdCheck(Map<String, Object> map) throws Exception{
		return selectList("regist.registidcheck",map);
	}
}