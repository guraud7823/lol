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

@Controller
public class BoardController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="BoardService")// resource 어노테이션통해 빈을 수동등록(serive 어노테이션에 접근을위해)
	private BoardService boardService;
	
	@RequestMapping(value="/lol/board.do" )//해당주소
	public ModelAndView viewBoard(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("lol/boardview");//실행될 jsp파일
		Map<String,Object> boardInfo = new HashMap<String,Object>();
		String cellcount = request.getParameter("cellcount");
		String currentpage = request.getParameter("currentpage");	
		String selectInfo = request.getParameter("selectbox");
		String searchvalue = request.getParameter("searchvalue");
		if(searchvalue != null)
			searchvalue = URLDecoder.decode(searchvalue,"UTF-8");
		
		boardInfo.put("selectInfo",selectInfo);
		boardInfo.put("searchvalue",searchvalue);
		
		int count = boardService.countBoard(boardInfo);
		TotalPage totalPage = new TotalPage();
		HashMap<String, Integer> pageInfo =totalPage.getPageInfo(count, cellcount, currentpage);
		mv.addObject("boardlist", boardService.selectBoardList(boardInfo, pageInfo.get("cellcount") , pageInfo.get("currentpage") ));
		mv.addObject("totalcount",count);
		mv.addObject("pageInfo",pageInfo);
		mv.addObject("boardInfo",boardInfo);
		return mv;
	}
	@RequestMapping(value="/lol/boardwrite.do" )//해당주소
	public ModelAndView writeBoard(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("lol/boardwrite");//실행될 jsp파일

		return mv;
	}
	@RequestMapping(value="/lol/boardsave.ajax" )//
	public ModelAndView saveBoard(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("jsonView");
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map = mapper.readValue(request.getParameter("ajaxdata"), new TypeReference<HashMap<String,Object>>(){});
		map.put("id",session.getAttribute("account"));
		boardService.insertBoard(map);
		return mv;
	}
	@RequestMapping(value="/lol/boardupdate.ajax" )//
	public ModelAndView updateBoard(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("jsonView");
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map = mapper.readValue(request.getParameter("ajaxdata"), new TypeReference<HashMap<String,Object>>(){});
		boardService.updateBoard(map);
		return mv;
	}
	@RequestMapping(value="/lol/boarddelete.ajax" )//
	public ModelAndView deleteBoard(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("jsonView");
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map = mapper.readValue(request.getParameter("ajaxdata"), new TypeReference<HashMap<String,Object>>(){});
		boardService.deleteBoard(map);
		return mv;
	}
}
