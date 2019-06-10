package movie.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("BoardDAO")
public class BoardDAO extends AbstractDAO{

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("board.selectBoardList",map);
	}
	
	public void updateBoard(Map<String, Object> map) throws Exception{
		update("board.updateBoard",map);
	}
	public void insertBoard(Map<String, Object> map) throws Exception{
		insert("board.insertBoard",map);
	}
	public void deleteBoard(Map<String, Object> map) throws Exception{
		delete("board.deleteBoard",map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardListAll() throws Exception{
		return (List<Map<String, Object>>)selectList("board.selectBoardListAll");
	}
	public int countBoard(Map<String, Object> map) throws Exception{
		return (int) selectOne("board.countboard",map);
	}
	@SuppressWarnings("unchecked")
	public Map<String,Object> selectBoardDetail(Map<String, Object> map) throws Exception{
		return (Map<String, Object>)selectOne("board.selectBoardDetail",map);
	}

}