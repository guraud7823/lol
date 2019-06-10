package movie.sample.service;

import java.util.List;
import java.util.Map;

public interface RegistService {

	void insertRegist(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> registIdCheck(Map<String, Object> map) throws Exception;
}