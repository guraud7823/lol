package movie.lol.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import movie.common.dao.UserVO;
import movie.common.logger.LoggerInterceptor;

public class LoginInterceptor extends HandlerInterceptorAdapter 
{
	private static final String LOGIN = "";
	protected Log log = LogFactory.getLog(LoggerInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception 
	{
		HttpSession httpSession = request.getSession();
		if (log.isDebugEnabled()){
			log.debug("======================================Login START ======================================");
		}
		if(httpSession.getAttribute(LOGIN) != null) {
			log.debug("clear login data before");
			httpSession.removeAttribute(LOGIN);
		}
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception 
	{
		HttpSession httpSession = request.getSession();
		ModelMap modelMap = modelAndView.getModelMap();
		Object userInfo = modelMap.get("userInfo");
		if(userInfo != null) {
			log.debug("new login sucess");
			httpSession.setAttribute("account", (String)((UserVO) modelMap.get("userInfo")).getId());
		}
		if (log.isDebugEnabled()){
			log.debug("======================================Login END ======================================\n");
			}
	}
}