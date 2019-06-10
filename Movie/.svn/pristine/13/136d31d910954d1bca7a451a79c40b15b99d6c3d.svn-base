package movie.sample.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import movie.common.dao.BoardDAO;
import movie.common.dao.CommentBoardDAO;

@Service ("CommentBoardService") 
public class CommentBoardServiceImpl implements CommentBoardService {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="CommentBoardDAO")
	private CommentBoardDAO commentBoardDAO;
	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map, int cellcount, int currentpage) throws Exception {
		
		int startcell =currentpage*cellcount;
		map.put("startcell",startcell);
		map.put("cell",cellcount);
		
		return commentBoardDAO.selectBoardList(map);
	}
	@Override
	public void updateBoard(Map<String, Object> map) throws Exception {
		commentBoardDAO.updateBoard(map);
	}
	
	@Override
	public void deleteBoard(Map<String, Object> map) throws Exception {
		commentBoardDAO.deleteBoard(map);
	}
	
	@Override
	public void insertBoard(Map<String, Object> map) throws Exception {
		commentBoardDAO.insertBoard(map);
	}
	@Override
	public List<Map<String, Object>> selectBoardListAll() throws Exception{
		return commentBoardDAO.selectBoardListAll();
	}
	@Override
	public int countBoard(Map<String, Object> map) throws Exception{
		return commentBoardDAO.countBoard(map);
	}
	@Override
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception{
		return commentBoardDAO.selectBoardDetail(map);
	}

}