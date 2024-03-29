package movie.sample.service;

import java.util.List;
import java.util.Map;

public interface BoardService {

	List<Map<String, Object>> selectBoardList(Map<String, Object> map, int cellcount, int currentpage) throws Exception;
	List<Map<String, Object>> selectBoardListAll() throws Exception;
	void updateBoard(Map<String, Object> map) throws Exception;
	void insertBoard(Map<String, Object> map) throws Exception;
	void deleteBoard(Map<String, Object> map) throws Exception;
	int countBoard(Map<String, Object> map) throws Exception;
	Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception;

}