package movie.sample.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import movie.common.dao.SampleDAO;

@Service ("SampleService") //resource 어노테이션에서 사용ㄷ됨
public class SampleServiceImpl implements SampleService {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="sampleDAO")
	private SampleDAO sampleDAO;
	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		return sampleDAO.selectBoardList(map);
	}
	
}
