package movie.lol.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.activation.CommandMap;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import movie.common.bean.UserInfo;
import movie.sample.service.RegistService;
import movie.sample.service.SampleService;


@Controller
public class registerController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="RegistService")// resource ������̼����� ���� �������(serive ������̼ǿ� ����������)
	private RegistService registService;
	
	@RequestMapping(value="/lol/register.do" )//�ش��ּ�
	public ModelAndView openRegister(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("lol/register");//����� jsp����

		return mv;
	}
	
	@RequestMapping(value="/lol/register.ajax")
    public ModelAndView register(HttpServletRequest request, HttpServletResponse response) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("jsonView");
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map = mapper.readValue(request.getParameter("ajaxdata"), new TypeReference<HashMap<String,Object>>(){});
		map.put("password",BCrypt.hashpw((String) map.get("pw"),BCrypt.gensalt()));
		registService.insertRegist(map);
		mv.addObject("id", map.get("id"));
		return mv;
    }
	
	@RequestMapping(value="/lol/registerchk.ajax")
    public ModelAndView registerchk(HttpServletRequest request, HttpServletResponse response) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("jsonView");
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, Object> map = new HashMap<String, Object>();
		HashMap<String, Object> tempmap = new HashMap<String, Object>();
		tempmap = mapper.readValue(request.getParameter("ajaxdata"), new TypeReference<HashMap<String,Object>>(){});
		map.put("id",tempmap.get("idchk"));
		int idcheck = registService.registIdCheck(map).size();
		System.out.println(idcheck + "�Դϴ�");
		mv.addObject("idcheck", idcheck);
		return mv;
    }

}
