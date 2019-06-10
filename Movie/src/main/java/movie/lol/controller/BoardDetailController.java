package movie.lol.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import movie.common.function.TotalPage;
import movie.sample.service.BoardService;
import movie.sample.service.CommentBoardService;

@Controller
public class BoardDetailController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="BoardService")// resource 어노테이션통해 빈을 수동등록(serive 어노테이션에 접근을위해)
	private BoardService boardService;
	
	@Resource(name="CommentBoardService")
	private CommentBoardService commentBoardService;
	
	@RequestMapping(value="/lol/boarddetail.do" )//해당주소
	public ModelAndView viewBoardDetail(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("lol/boardviewDetail");//실행될 jsp파일
		Map<String,Object> boardInputInfo = new HashMap<String,Object>();
		String boNo = request.getParameter("bo_no");

		boardInputInfo.put("boNo",boNo);
		
		mv.addObject("commentBoardlist", commentBoardService.selectBoardList(boardInputInfo,10,0));
		mv.addObject("boardInfo",boardService.selectBoardDetail(boardInputInfo));
		return mv;
	}
	@RequestMapping(value="/lol/boardmodify.do" )//해당주소
	public ModelAndView viewBoardModify(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("lol/boardmodify");//실행될 jsp파일
		Map<String,Object> boardInputInfo = new HashMap<String,Object>();
		String boNo = request.getParameter("bo_no");
		
		boardInputInfo.put("boNo",boNo);
		
		mv.addObject("boardInfo",boardService.selectBoardDetail(boardInputInfo));
		return mv;
	}
	@RequestMapping(value="/lol/commentboardwrite.ajax" )//해당주소
	public ModelAndView writeBoard(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("jsonView");
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map = mapper.readValue(request.getParameter("ajaxdata"), new TypeReference<HashMap<String,Object>>(){});
		map.put("co_id",session.getAttribute("account"));
		commentBoardService.insertBoard(map);
		return mv;
	}
	@RequestMapping(value="/lol/commentboarddelete.ajax" )//
	public ModelAndView deleteBoard(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("jsonView");
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map = mapper.readValue(request.getParameter("ajaxdata"), new TypeReference<HashMap<String,Object>>(){});
		commentBoardService.deleteBoard(map);
		return mv;
	}
	
}