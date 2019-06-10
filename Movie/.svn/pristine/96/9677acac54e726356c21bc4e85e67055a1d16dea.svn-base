package movie.sample.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import movie.common.dao.BoardDAO;

@Service ("BoardService") 
public class BoardServiceImpl implements BoardService {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="BoardDAO")
	private BoardDAO boardDAO;
	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map, int cellcount, int currentpage) throws Exception {
		
		int startcell =currentpage*cellcount;
		map.put("startcell",startcell);
		map.put("cell",cellcount);
		
		return boardDAO.selectBoardList(map);
	}
	@Override
	public void updateBoard(Map<String, Object> map) throws Exception {
		 boardDAO.updateBoard(map);
	}
	
	@Override
	public void deleteBoard(Map<String, Object> map) throws Exception {
		 boardDAO.deleteBoard(map);
	}
	
	@Override
	public void insertBoard(Map<String, Object> map) throws Exception {
		 boardDAO.insertBoard(map);
	}
	@Override
	public List<Map<String, Object>> selectBoardListAll() throws Exception{
		return boardDAO.selectBoardListAll();
	}
	@Override
	public int countBoard(Map<String, Object> map) throws Exception{
		return boardDAO.countBoard(map);
	}
	@Override
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception{
		return boardDAO.selectBoardDetail(map);
	}

}