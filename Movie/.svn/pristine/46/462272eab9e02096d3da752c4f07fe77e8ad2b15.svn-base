package movie.lol.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import movie.common.bean.ChampionInfo;
import movie.common.bean.Champion_data;
import movie.common.function.ConvertToJson;
import movie.common.function.MakeUrl;
import movie.common.function.MapperStatic;

@Controller
public class getChampionInfoController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/lol/championinfo.do" )//해당주소
	public ModelAndView openChampionInfo(HttpServletRequest request, HttpSession session) throws Exception, IOException{
		ModelAndView mv = new ModelAndView("lol/championinfo");//실행될 jsp파일
		MakeUrl makeUrl = new MakeUrl();
		ConvertToJson convertToJson = new ConvertToJson();
		ObjectMapper mapper = new ObjectMapper();
		
		ArrayList<String> ChampName = new ArrayList<String>();
		ArrayList<String> ChampKey = new ArrayList<String>();
		ArrayList<String> ChampImg = new ArrayList<String>();

		Iterator<String> itr = MapperStatic.getChampionFull().getKeys().keySet().iterator();
		while(itr.hasNext()) {
			String champNm = MapperStatic.getChampionFull().getKeys().get(itr.next());
			Champion_data champion_data =MapperStatic.getChampionFull().getData().get(champNm);
			
		  ChampName.add((champion_data.getName()));
		  ChampKey.add((champion_data.getKey()));
		  ChampImg.add((champion_data.getImage().getFull()));
		}
		 
		
		mv.addObject("ChampName",ChampName);
		mv.addObject("ChampKey",ChampKey);
		mv.addObject("ChampImg",ChampImg);
		return mv;
	}
}
