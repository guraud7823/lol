package movie.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("CommentBoardDAO")
public class CommentBoardDAO extends AbstractDAO{

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("commentboard.selectBoardList",map);
	}
	
	public void updateBoard(Map<String, Object> map) throws Exception{
		update("commentboard.updateBoard",map);
	}
	public void insertBoard(Map<String, Object> map) throws Exception{
		insert("commentboard.insertBoard",map);
	}
	public void deleteBoard(Map<String, Object> map) throws Exception{
		delete("commentboard.deleteBoard",map);
	}
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardListAll() throws Exception{
		return (List<Map<String, Object>>)selectList("commentboard.selectBoardListAll");
	}
	public int countBoard(Map<String, Object> map) throws Exception{
		return (int) selectOne("commentboard.countboard",map);
	}
	@SuppressWarnings("unchecked")
	public Map<String,Object> selectBoardDetail(Map<String, Object> map) throws Exception{
		return (Map<String, Object>)selectOne("commentboard.selectBoardDetail",map);
	}

}