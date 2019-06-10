package movie.lol.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import movie.common.bean.UserInfo;
import movie.common.dao.UserVO;
import movie.sample.service.LoginService;
import movie.sample.service.RegistService;

@Controller
public class LoginController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="LoginService")// resource 어노테이션통해 빈을 수동등록(serive 어노테이션에 접근을위해)
	private LoginService loginService;
	
	@RequestMapping(value="/lol/logincheck.ajax")
    public ModelAndView loginCheck(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("jsonView");
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, Object> map = new HashMap<String, Object>();
		HashMap<String, Object> tempmap = new HashMap<String, Object>();
		Map<String, Object> userInfo = new HashMap<String, Object>();
		UserVO userVO = new UserVO();
		tempmap = mapper.readValue(request.getParameter("ajaxdata"), new TypeReference<HashMap<String,Object>>(){});
		tempmap.get("loginid");
		tempmap.get("loginpw");
		
		
		map.put("id",tempmap.get("loginid"));
		map.put("password",tempmap.get("loginpw"));
		
		userInfo = loginService.getLoginInfo(map);
		if(userInfo == null || !BCrypt.checkpw((String) tempmap.get("loginpw"),(String) userInfo.get("password"))) {
			System.out.println("잘못됨 ㅎㅎ");		
		}
		else {
			userVO.setId((String) userInfo.get("id"));
			userVO.setName((String) userInfo.get("name"));
			userVO.setPassword((String) userInfo.get("password"));
		}
		//map.put("password",tempmap.get("loginid"));
		//int idcheck = registService.registIdCheck(map).size();
		//System.out.println(idcheck + "입니다");
		model.addAttribute("userInfo", userVO);
		//mv.addObject("userInfo", userVO);
		return mv;
    }
	
	@RequestMapping(value="/lol/logoutcheck.ajax")
	 public ModelAndView logoutCheck(HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("jsonView");
		session.invalidate(); // 세션 전체를 날려버림
	     return mv;
	    }
}
